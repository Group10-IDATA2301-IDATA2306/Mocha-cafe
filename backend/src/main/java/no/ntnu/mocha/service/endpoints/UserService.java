package no.ntnu.mocha.service.endpoints;

import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.DTO.UserDto;
import no.ntnu.mocha.domain.entities.Role;
import no.ntnu.mocha.domain.entities.User;
import no.ntnu.mocha.domain.repository.RoleRepository;
import no.ntnu.mocha.domain.repository.UserRepository;
import no.ntnu.mocha.service.email.EmailService;


/**
 * <Business Logic Service for the User</h1>
 * 
 * Representing an Review class for the User.
 * 
 * @version 29.04.2023
 * @since   25.04.2023
 */
@Service public class UserService {
    
    @Autowired private UserRepository userRepository;
    @Autowired private RoleRepository roleRepository;
    @Autowired private EmailService emailService;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    

    /**
     * Add a new user to the database.
     * 
     * @param dto the dto representing the user.
     * @return the new user.
     */
    public User addUser(UserDto dto) {
        HashSet<Role> roles = new HashSet<>();
        roles.add(roleRepository.findOneByName("ROLE_USER"));

        User user = new User(
            dto.getUsername(),
            bCryptPasswordEncoder.encode(dto.getPassword()),
            roles,
            dto.getEmail(),
            dto.getBio()
        );

        emailService.sendAccountConfirmation(dto.getEmail());

        return userRepository.save(user);
    }


    /**
     * Update an existing user.
     * 
     * @param id the id of the user.
     * @param dto the dto representing the user.
     */
    public void updateUser(long id, UserDto dto) {
        userRepository.updateUser(
            id, 
            bCryptPasswordEncoder.encode(dto.getPassword()), 
            dto.getEmail(), 
            dto.getBio()
        );
    }


    /**
     * Delete a user from the database.
     * 
     * @param id the id of the user.
     * @param dto the dto representing the user.
     */
    public boolean deleteUser(long id, UserDto dto) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) userRepository.delete(user.get());
        return user.isPresent();
    }


    /**
     * Checks if the user attempting to perform something on a user entity
     * actually is the user itself.
     * 
     * @param dto the dto representing the user.
     * @return true if the user is the same as the one in the dto, otherwise false.
     */
    public boolean validateUserAction(UserDto dto) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return dto.getUsername().equals(username);
    }
}
