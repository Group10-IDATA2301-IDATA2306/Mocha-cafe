package no.ntnu.mocha.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * <h1>Cart</h1>
 * 
 * <p>
 * This class is an enitity which maps a relation between users and products
 * representing an
 * item in their cart.
 * </p>
 * 
 * @version 16.04.2023
 */
@Entity
public class Cart {

    @EmbeddedId
    public CartKey id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    /**
     * Returns the Carts ID.
     * 
     * @return The ID of the cart
     */
    public CartKey getId() {
        return this.id;
    }

    /**
     * Sets the carts ID.
     *
     * @param id The id of the new cartID
     */
    public void setId(CartKey id) {
        this.id = id;
    }

    /**
     * Returns the Users ID.
     *
     * @return The ID of the user
     */
    public User getUser() {
        return this.user;
    }

    /**
     * Sets the users ID.
     *
     * @param user The id of the new userID
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Returns the Products ID.
     *
     * @return The ID of the product
     */
    public Product getProduct() {
        return this.product;
    }

    /**
     * Sets the products ID.
     *
     * @param id The id of the new productID
     */
    public void setProduct(Product product) {
        this.product = product;
    }

}
