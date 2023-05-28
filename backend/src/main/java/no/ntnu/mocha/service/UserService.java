package no.ntnu.mocha.service;

import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.DTO.UserDto;
import no.ntnu.mocha.domain.entities.Role;
import no.ntnu.mocha.domain.entities.User;
import no.ntnu.mocha.domain.repository.RoleRepository;
import no.ntnu.mocha.domain.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private EmailService emailService;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    

    public User addUser(UserDto dto) {
        HashSet<Role> roles = new HashSet<>();
        roles.add(roleRepository.findOneByName("ROLE_USER"));
        if (roles.isEmpty()) {
            roleRepository.save(new Role("ROLE_USER"));
            roleRepository.save(new Role("ROLE_ADMIN"));
            roles.add(roleRepository.findOneByName("ROLE_USER"));
            roles.add(roleRepository.findOneByName("ROLE_ADMIN"));
        }
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


    public void updateUser(long id, UserDto dto) {
        userRepository.updateUser(
            id, 
            bCryptPasswordEncoder.encode(dto.getPassword()), 
            dto.getEmail(), 
            dto.getBio()
        );
    }


    public boolean deleteUser(long id, UserDto dto) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) userRepository.delete(user.get());
        return user.isPresent();
    }
}
