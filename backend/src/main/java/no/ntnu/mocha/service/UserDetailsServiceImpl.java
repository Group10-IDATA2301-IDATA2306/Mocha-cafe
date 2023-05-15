package no.ntnu.mocha.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.domain.entities.User;
import no.ntnu.mocha.domain.repository.UserRepository;

/**
 * Represents UserDetailsService and implements UserDetailService
 * from Spring Security to provide user authentication and authorization
 * services.
 *
 * @author  Group 10
 * @since   14.05.2023
 * @version 14.05.2023
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
    private UserRepository repository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = repository.findByUsername(username);
        UserBuilder builder = null;
        if (user.isPresent()) {
            User currentUser = user.get();
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(currentUser.getPassword());
            builder.roles(currentUser.getRole());
        } else {
            throw new UsernameNotFoundException("User not found.");
        }
        return builder.build();
    }
}
