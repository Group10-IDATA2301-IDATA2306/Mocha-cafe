package no.ntnu.mocha.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.DTO.CartItemDto;
import no.ntnu.mocha.domain.entities.CartItem;
import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.domain.repository.CartItemRepository;
import no.ntnu.mocha.domain.repository.OrderRepository;
import no.ntnu.mocha.domain.repository.ProductRepository;

/**
 * <h1>Business Logic Service class for Cart Item</h1>
 * 
 * <p> Representing an Service class for the Cart Item and implements the
 * Cart Item Service interface with the additional methods. </p>
 * 
 * @version 21.04.2023
 * @since   21.04.2023
 */
@Service
public class CartItemService {

    /** Gives access to the Cart Item Repository */
    @Autowired
    private CartItemRepository cartItemRepository;

    /** Gives access to the Product Repository */
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;



    /**
     * Returns the cart item with the given id.
     * 
     * @param id    the id of the cart item.
     * @return {@code CartItem} with the given id, or
     *          {@code null} if nothing found.
     */
    public CartItem getCartItem(long id) {
        return this.cartItemRepository.findById(id).orElse(null);
    }

    public Iterable<CartItem> getCart(long id) {
        return this.cartItemRepository.getAllByOrderId(id);
    }

    public Iterable<Product> getCartProducts(long id) {
        ArrayList<Product> products = new ArrayList<>();
        for (CartItem cartItem : this.getCart(id)) {
            products.add(this.productRepository.findById(cartItem.getProduct().getId()).orElse(null));
        }
        return products;
    }

    /**
     * Returns the Cart Item with the given order id and product id.
     * 
     * @param oId   The order id to find cart item for.
     * @param pId   The product id to find cart item for.
     * @return {@code CartItem} found, or {@code null} if
     *          nothing found.
     */
    public CartItem getCartItemByOrderAndProduct(Order oId, Product pId) {
        return this.cartItemRepository.findCartItemByOrderAndProduct(oId, pId)
                .orElse(null);
    }

    /**
     * Saves the cart item into the database.
     * 
     * @param cartItem  the cart item to be saved.
     */
    public CartItem addCartItem(CartItemDto dto) {

        Optional<Order> order = orderRepository.findById(dto.getOrderId());
        Optional<Product> product = productRepository.findById(dto.getProductId());

        if (order.isPresent() && product.isPresent()) {
            CartItem cartItem = new CartItem(
                order.get(), 
                product.get(), 
                dto.getAmount()
            );
            return cartItemRepository.save(cartItem);
        } else {
            return null;
        }
    }

    /**
     * Updates the cart item with the given id to the 
     * database.
     * 
     * @param id        the id of the cart item to update
     * @param cartItem  the updated {@code cartItem}
     */
    public void updateCartItem(long id, CartItem cartItem) {
        this.cartItemRepository.save(cartItem);
    }

    /**
     * Deletes the cart item by the given id.
     * 
     * @param id    the id of the cart item to be
     *              deleted.
     */
    public void deleteCartItem(long id) {
        this.cartItemRepository.deleteById(id);
    }

    /**
     * Deletes all the item in the cart item
     * with the given order id.
     * 
     * @param id    the order id of the cart items to be deleted.
     */
    public void deleteAllCartItemById(long id) {
        this.cartItemRepository.deleteAllCartItemByOrderId(id);
    }


    public void incrementCartItem(long id) {
        this.cartItemRepository.incrementCartItem(id);
    }

    public void decrementCartItem(long id) {
        this.cartItemRepository.decrementCartItem(id);
        Optional<CartItem> item = this.cartItemRepository.findById(id);
        if (item.isPresent() &&  (item.get().getAmount() == 0)) this.cartItemRepository.delete(item.get());
    }
}
