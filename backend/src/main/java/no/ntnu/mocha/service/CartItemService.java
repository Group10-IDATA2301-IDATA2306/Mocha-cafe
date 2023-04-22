package no.ntnu.mocha.service;

import no.ntnu.mocha.domain.entities.CartItem;
import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.domain.entities.Product;

/**
 * <h1>Business Logic interface for the Cart Items </h1>
 * 
 * <p>Represents an interface that defines the operations
 * that can be performed in Cart Item in the application. </p>
 * 
 * @version 22.04.2023
 * @since   22.04.2023
 */
public interface CartItemService {
    
    /**
     * Returns the Cart Item with the given id.
     * 
     * @param   id the id of the cart item
     * @return  the cart item with the given id
     */
    CartItem getCartItem(long id);

    /**
     * Returns the cart item with the given order id
     * and product id.
     * 
     * @param oId   the order id
     * @param pId   the product id
     * @return      the cart item with the given order id
     *              and product id
     */
    CartItem getCartItemByOrderAndProduct(Order oId, Product pId);

    /**
     * Adds the given cart item.
     * 
     * @param cartItem  the cart item
     */
    void addCartItem(CartItem cartItem);

    /**
     * Updates the cart item with the given 
     * id and cart item.
     * 
     * @param id        the id of the cart item
     * @param cartItem  the cart item
     */
    void updateCartItem(long id, CartItem cartItem);

    /**
     * Deletes the cart item with the given id.
     * 
     * @param id    the id of the cart item
     */
    void deleteCartItem(long id);

    /**
     * Deletes all the cart items by the given
     * id.
     * 
     * @param id    the cart item id.
     */
    void deleteAllCartItemById(long id);

}
