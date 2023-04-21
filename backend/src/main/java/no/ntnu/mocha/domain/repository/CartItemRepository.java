package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;
import no.ntnu.mocha.domain.entities.CartItem;

/**
 * Represents CartItemRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 */
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
}
