package no.ntnu.mocha.domain.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents an order.
 * 
 * @version 21.03.2023
 * @since   22.04.2023
 */
@Entity
@Table(name = "product_order")
public class Order {
    
    /** Unique Id for Order */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "order_id")
    private long id;

    /** Foregin key (Uid) from User class */
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    /** Given date for the current order */
    @Column(name = "order_date")
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
    public Order(LocalDateTime date) {
        super();
        // The current date of the Order
        this.date = LocalDateTime.now(); 
    }

    /**
     * Return this order items id.
     * 
     * @return this order items id.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the order id for this
     * order.
     * 
     * @param id the order id for this order.
     */
    public void setId(long id) {
        this.id = id;
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
