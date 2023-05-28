package no.ntnu.mocha.domain.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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


    @Transactional
    @Modifying
    @Query(value = "update user u set u.password = ?2, u.email = ?3, u.bio = ?4 where u.user_id = ?1", nativeQuery = true)
    void updateUser(long id, String password, String email, String bio);
}
