package no.ntnu.mocha.domain.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import no.ntnu.mocha.domain.entities.User;

/**
 * Represents UserRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 * @see     User
 */
@Repository("userJpaRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByUsername(String username);


}
