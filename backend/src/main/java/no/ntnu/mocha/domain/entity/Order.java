package no.ntnu.mocha.domain.entity;

import java.time.LocalDateTime;

/**
 * Represents an order.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 */
public class Order {
    
    /** Unique Id for Order */
    private long oId;

    /** Foregin key (Uid) from User class */
    private User Uid;

    /** Given date for the current order */
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
