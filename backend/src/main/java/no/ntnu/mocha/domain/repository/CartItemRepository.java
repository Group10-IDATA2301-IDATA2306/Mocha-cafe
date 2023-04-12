package no.ntnu.mocha.domain.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entities.CartItem;
import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.domain.entities.Product;

/**
 * Represents CartItemRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 */
public interface CartItemRepository extends CrudRepository<Long, CartItem> {

    Optional<CartItem> findCartItemByProductAndOrder(Product pId, Order oId);
}
