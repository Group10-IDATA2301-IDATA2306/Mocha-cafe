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
 * @since   21.03.2023
 */
@Entity
@Table(name = "cart_item")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_item_id")
    private long cID;

    /** The order Id of the Cart Item */
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order oId;

    /** The Product Id of the Cart Item */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product pId;

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
    public CartItem(Order oId, Product pId, int amount) {
        super();
        this.oId = oId;
        this.pId = pId;
        this.amount = amount;
    }

    /**
     * Returns the cId of the cart item id.
     * 
     * @return the cId of the cart item
     */
    public long getCid() {
        return cID;
    }

    /**
     * Returns the oId this cart item represents.
     * 
     * @return oId this cart item represents.
     */
    public Order getoId() {
        return oId;
    }

    /**
     * Sets the oId that this cart item represents.
     * 
     * @param oId the oId that this cart item represents.
     */
    public void setoId(Order oId) {
        this.oId = oId;
    }

    /**
     * Returns the pId this cart item represents.
     * 
     * @return the pId this cart item represents.
     */
    public Product getpId() {
        return pId;
    }

    /**
     * Sets the pId that this cart item represents.
     * 
     * @param pId the pId that this cart item represents.
     */
    public void setpId(Product pId) {
        this.pId = pId;
    }

}
