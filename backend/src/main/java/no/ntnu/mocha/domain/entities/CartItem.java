package no.ntnu.mocha.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



/**
 * <h1>Cart Item</h1>
 * 
 * <p>Represents an simple entity class for Cart Item
 *  with the JPA's {@code @Entity} annotation. 
 * </p>
 * 
 * @version 21.03.2023
 * @since   22.04.2023
 */
@Entity
@Table(name = "cart_item")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_item_id")
    private long id;

    /** The order Id of the Cart Item */
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    /** The Product Id of the Cart Item */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    /** The amount of the Cart Items */
    @Column(name = "amount")
    private int amount;

    /**
     * Empty Constructor.
     */
    public CartItem(){}

    /**
     * Creates an instance of cart item.
     * 
     * @param oId       The Order Id of the Cart Item.
     * @param pId       The Product Id of the Cart Item.
     * @param amount    The amount of the Cart Item.
     */
    public CartItem(int amount) {
        super();
        this.amount = amount;
    }

    /**
     * Returns the id for the Cart Item.
     * 
     * @return the id for the Cart Item.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id for the Cart Item.
     * 
     * @param id    the id for the Cart Item.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Returns the amount for the Cart Item.
     * 
     * @return  the amount for the Cart Item.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount for the Cart Item.
     * 
     * @param amount    the amount for the
     *                  Cart Item.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
