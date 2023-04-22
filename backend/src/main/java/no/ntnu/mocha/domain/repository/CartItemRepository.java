package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import no.ntnu.mocha.domain.entities.CartItem;
import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.domain.entities.Product;
import java.util.Optional;

/**
 * Represents CartItemRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 * @see     CartItem
 */
@Repository
public interface CartItemRepository extends CrudRepository<CartItem, Long> {

    /**
     * Finds a {@link CartItem} object in the cart
     * by matching the order id and product id.
     * 
     * @param order   the order of the cart item
     * @param product   the product of the product   
     * @return  an {@code Optional} containing the cart item
     *          or an empty {@code Optional} if no match was found.
     */
    Optional<CartItem> findCartItemByOrderAndProduct(Order order, Product product);

    /**
     * Deletes all {@link CartItem} with the given id.
     * 
     * @param id    the id of the Cart Item
     */
    void deleteAllCartItemById(long id);

}
