package no.ntnu.mocha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.domain.entities.CartItem;
import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.domain.repository.CartItemRepository;

/**
 * <h1>Business Logic Service class for Cart Item</h1>
 * 
 * <p> Representing an Service class for the Cart Item and implements the
 * Cart Item Service interface with the additional methods. </p>
 * 
 * @version 21.04.2023
 * @since   21.04.2023
 * @see     CartItemService
 */
@Service
public class CartItemServiceImpl implements CartItemService {

    /** Gives access to the Cart Item Repository */
    @Autowired
    private CartItemRepository cartItemRepository;

    /**
     * Returns the cart item with the given id.
     * 
     * @param id    the id of the cart item.
     * @return {@code CartItem} with the given id, or
     *          {@code null} if nothing found.
     */
    @Override
    public CartItem getCartItem(long id) {
        return this.cartItemRepository.findById(id).orElse(null);
    }

    /**
     * Returns the Cart Item with the given order id and product id.
     * 
     * @param oId   The order id to find cart item for.
     * @param pId   The product id to find cart item for.
     * @return {@code CartItem} found, or {@code null} if
     *          nothing found.
     */
    @Override
    public CartItem getCartItemByOrderAndProduct(Order oId, Product pId) {
        return this.cartItemRepository.findCartItemByOrderAndProduct(oId, pId)
                .orElse(null);
    }

    /**
     * Saves the cart item into the database.
     * 
     * @param cartItem  the cart item to be saved.
     */
    @Override
    public void addCartItem(CartItem cartItem) {
        this.cartItemRepository.save(cartItem);
    }

    /**
     * Updates the cart item with the given id to the 
     * database.
     * 
     * @param id        the id of the cart item to update
     * @param cartItem  the updated {@code cartItem}
     */
    @Override
    public void updateCartItem(long id, CartItem cartItem) {
        this.cartItemRepository.save(cartItem);
    }

    /**
     * Deletes the cart item by the given id.
     * 
     * @param id    the id of the cart item to be
     *              deleted.
     */
    @Override
    public void deleteCartItem(long id) {
        this.cartItemRepository.deleteById(id);
    }

    /**
     * Deletes all the item in the cart item
     * with the given id.
     * 
     * @param id    the cart item id to be deleted.
     */
    @Override
    public void deleteAllCartItemById(long id) {
        this.cartItemRepository.deleteAllCartItemById(id);
    }
    
}
