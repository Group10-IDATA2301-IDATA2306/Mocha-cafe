package no.ntnu.mocha.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


/**
 * Representing a cart item.
 */
@Entity
@Table(name = "cart_item")
public class CartItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_item_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private ShoppingSession shoppingSession;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;

    @Column(name = "updated")
    private LocalDateTime updated;

    @Column(name = "creation")
    private LocalDateTime creation;

    /**
     * Default constructor.
     */
    public CartItem() {

    }

    /**
     * Creates an instance of an cart item.
     * 
     * @param shoppingSession   the current shopping session the cart item belongs.
     * @param product           the represented product for the cart item.
     */
    public CartItem(ShoppingSession shoppingSession, Product product) {
        this.shoppingSession = shoppingSession;
        this.product = product;
        this.quantity = 1;
        this.creation = creation;
        this.updated = updated;
    }

    /**
     * Returns the Id of the cart item.
     * 
     * @return the Id of the cart item
     */
    public long getId() {
        return this.id;
    }

    /**
     * Returns the shopping session for the cart items.
     * 
     * @return the shopping session for the cart items.
     */
    public ShoppingSession getShoppingSession() {
        return ShoppingSession;
    }

    /**
     * Set the cart items shopping session.
     * 
     * @param shoppingSession the shopping session to be set for this cart item.
     */
    public void setShoppingSession(ShoppingSession shoppingSession) {
        this.shoppingSession = shoppingSession;
    }

    /**
     * Returns the product this cart item represents.
     * 
     * @return the product this cart item represents.
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the product that this cart item represents.
     * 
     * @param product the product that this cart item represent.
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Returns the quantity of the product in this cart item.
     * 
     * @return the quantity of the product in this cart item.
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity for this cart item.
     * 
     * @param quantity the quantity of the product in this cart item.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Increases the quantity by one.
     */
    public void increaseQuantity() {
        this.quantity += 1;
    }

    /**
     * Return the total of the product in this cart item.
     * 
     * @return the total of the product in this cart item.
     */
    public double getTotal() {
        return product.getPrice() * quantity;
    }

    /**
     * Returns when the current item was last updated.
     * 
     * @return when the current item was last updated.
     */
    public LocalDateTime getUpdate() {
        return updated;
    }

    /**
     * Sets when the current cart item was last updated to
     * now.
     */
    public void setUpdated() {
        this.updated = LocalDateTime.now();
    }

    /**
     * Returns when the cart item was created.
     * 
     * @return when the cart item was created.
     */
    public LocalDateTime getCreation() {
        return creation;
    }
}