package no.ntnu.mocha.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entities.Cart;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.domain.entities.User;

/**
 * Represents CartItemRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since 21.03.2023
 */
public interface CartRepository extends CrudRepository<Long, Cart> {

    Optional<Cart> findCartItemByProductAndOrder(Product pId, User uID);
}
