package no.ntnu.mocha.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import no.ntnu.mocha.domain.entities.User;

/**
 * Represents UserRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 * @see     User
 */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
    
    Optional<User> findByUsername(String username);


}
