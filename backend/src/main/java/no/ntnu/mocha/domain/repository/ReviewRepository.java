package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;
import no.ntnu.mocha.domain.entities.Review;

/**
 * Represents ReviewRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 * @see     Review
 */
public interface ReviewRepository extends CrudRepository<Review, Long> {
    
}
