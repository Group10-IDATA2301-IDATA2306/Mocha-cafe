package no.ntnu.mocha.service;

import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.DTO.UserDto;
import no.ntnu.mocha.domain.entities.Role;
import no.ntnu.mocha.domain.entities.User;
import no.ntnu.mocha.domain.repository.RoleRepository;
import no.ntnu.mocha.domain.repository.UserRepository;
import no.ntnu.mocha.security.AccessUserDetails;

/**
 * Provides AccessUserDetails needed for authentication.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    private static final int MIN_PASSWORD_LENGTH = 6;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()) {
            return new AccessUserDetails(
                user.get().getUsername(),
                user.get().getPassword(),
                user.get().getRoles()
            );
        } else {
            throw new UsernameNotFoundException("User " + username + "not found");
        }
    }

    public User getSessionUser() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        String username = authentication.getName();
        return userRepository.findByUsername(username).orElse(null);
    }

    /**
   * Check if user with given username exists in the database.
   *
   * @param username Username of the user to check, case-sensitive
   * @return True if user exists, false otherwise
   */
  private boolean userExists(String username) {
    try {
      loadUserByUsername(username);
      return true;
    } catch (UsernameNotFoundException ex) {
      return false;
    }
  }

    /**
     * Try to create a new user.
     *
     * @param username Username of the new user
     * @param password Plaintext password of the new user
     * @return null when user created, error message on error
     */
    public String tryCreateNewUser(String username, String password) {
        String errorMessage;
        if ("".equals(username)) {
        errorMessage = "Username can't be empty";
        } else if (userExists(username)) {
        errorMessage = "Username already taken";
        } else {
        errorMessage = checkPasswordRequirements(password);
        if (errorMessage == null) {
            createUser(username, password);
        }
        }
        return errorMessage;
    }

    /**
     * Check if password matches the requirements.
     *
     * @param password A password to check
     * @return null if all OK, error message on error
     */
    private String checkPasswordRequirements(String password) {
        String errorMessage = null;
        if (password == null || password.length() == 0) {
        errorMessage = "Password can't be empty";
        } else if (password.length() < MIN_PASSWORD_LENGTH) {
        errorMessage = "Password must be at least " + MIN_PASSWORD_LENGTH + " characters";
        }
        return errorMessage;
    }


    /**
     * Create a new user in the database.
     *
     * @param username Username of the new user
     * @param password Plaintext password of the new user
     */
    private void createUser(String username, String password) {
        HashSet<Role> roles = new HashSet<>();
        roles.add(roleRepository.findOneByName("USER"));
        if (!roles.isEmpty()) {
            User user = new User(
                username, 
                createHash(password), 
                roles
            );
            userRepository.save(user);
        }
    }

    /**
     * Create a secure hash of a password.
     *
     * @param password Plaintext password
     * @return BCrypt hash, with random salt
     */
    private String createHash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    /**
     * Update profile information for a user.
     *
     * @param user        User to update
     * @param profileData Profile data to set for the user
     * @return True on success, false otherwise
     */
    public boolean updateProfile(User user, UserDto dto) {
        user.setBio(dto.getBio());
        userRepository.save(user);
        return true;
    }
}
