package no.ntnu.mocha.domain.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Represents an order.
 * 
 * @version 21.03.2023
 * @since   22.03.2023
 */
@Entity
@Table(name = "order")
public class Order {
    
    /** Unique Id for Order */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "order_id")
    private long oId;

    /** Foregin key (Uid) from User class */
    @OneToMany
    @JoinColumn(name = "user_id")
    private User Uid;

    /** Given date for the current order */
    @Column(name = "date")
    private LocalDateTime date;

    /**
     * Empty constructor.
     */
    public Order(){}

    /**
     * Creates an instance of order item.
     * 
     * @param oId   The Order Id for the Order.
     * @param Uid   The User Id for the Order.
     */
    public Order(int oId, User Uid) {
        super();
        this.oId = oId;
        this.Uid = Uid;
        // The current date of the Order
        this.date = LocalDateTime.now(); 
    }

    /**
     * Return this order items id.
     * 
     * @return this order items id.
     */
    public long getoId() {
        return oId;
    }

    /**
     * Sets the order id (oId) for this
     * order.
     * 
     * @param oId the order id for this order.
     */
    public void setoId() {
        this.oId = oId;
    }

    /**
     * Returns the User Id for this order.
     * 
     * @return the User Id for this order.
     */
    public User getUid() {
        return this.Uid;
    }

    /**
     * Sets the User Id for this order.
     * 
     * @param Uid the User Id for this order.
     */
    public void setUid(User Uid) {
        this.Uid = Uid;
    }

    /**
     * Return when this order item was created.
     * 
     * @return when this order item was created.
     */
    public LocalDateTime getDate() {
        return date;
    }

}
