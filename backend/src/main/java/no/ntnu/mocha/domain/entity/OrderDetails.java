package no.ntnu.mocha.domain.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.hibernate.annotations.Cascade;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Represents an order and the containing details.
 */
@Entity
@Table(name = "order_details")
public class OrderDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_details_id")
    private long id;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "orderDetails")
    private List<OrderItem> orderItems = new ArrayList<>();
    
    private double total;

    private int quantity;

    private boolean processed;

    @Column(name = "created")
    private LocalDateTime creation;

    @Column(name = "updated")
    private LocalDateTime updated;

    /**
     * Empty contructor;
     */
    public OrderDetails() {
        this.total = 0;
        this.quantity = 0;
        this.creation = LocalDateTime.now();
        this.updated = LocalDateTime.now();
        this.processed = false;
    }

    /**
     * Creates an instance of the order details.
     * 
     * @param user      the user of the order
     * @param total     the total of the order
     * @param quantity  the quantity of the order
     */
    public OrderDetails(User user, double total, int quantity) {
        this.user = user;
        this.total = total;
        this.quantity = quantity;
        this.creation = LocalDateTime.now();
        this.updated = LocalDateTime.now();
        this.processed = false;
    }

    /**
     * Returns the given Id for the Order Details.
     * 
     * @return the given Id for the order details.
     */
    public long getId() {
        return id;
    }

    /**
     * Returns the user for the order details.
     *  
     * @return the user for the order details
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user for the order details.
     * 
     * @param user the for the order details
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Returns the list of order items.
     * 
     * @return the list of the order items
     */
    public List<OrderItem> getOrderItem() {
        return orderItems;
    }

  /**
   * Sets the list of order items.
   *
   * @param orderItems list of order items.
   */
  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
    this.total = orderItems.stream().mapToDouble(OrderItem::getTotal).sum();
    this.quantity = orderItems.stream().mapToInt(OrderItem::getQuantity).sum();
  }

  /**
   * Adds an item into the order.
   *
   * @param orderItem item to be added into the order.
   */
  public void addOrderItem(OrderItem orderItem) {
    this.orderItems.add(orderItem);
    this.total += orderItem.getTotal();
    this.quantity += orderItem.getQuantity();
  }

  /**
   * Removes the orderitem from the current order.
   *
   * @param orderItem the order item to be removed.
   */
  public void removeOrderItem(OrderItem orderItem) {
    if (this.orderItems.contains(orderItem)) {
      this.orderItems.remove(orderItem);
      this.total -= orderItem.getTotal();
      this.quantity -= orderItem.getQuantity();
    }
  }

  /**
   * Returns the total of the order.
   *
   * @return total of this order.
   */
  public double getTotal() {
    return total;
  }

  /**
   * Sets the total of this order.
   */
  public void setTotal(double total) {
    this.total = total;
  }

  /**
   * Returns the quantity of products.
   *
   * @return quantity of products.
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity of products.
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * Returns false if the order is not processed and
   * true if the order is processed.
   *
   * @return if it's true it is processed and false if not.
   */
  public boolean isProcessed() {
    return processed;
  }

  /**
   * Sets the order if it is processed or not.
   *
   * @param processed true if processed, false if not.
   */
  public void setProcessed(boolean processed) {
    this.processed = processed;
  }

  /**
   * Returns the time of when the order details was created.
   *
   * @return the time of when the order details was created.
   */
  public LocalDateTime getCreatedAt() {
    return creation;
  }

  /**
   * Sets the order details from when it was created.
   *
   * @param creation the date of the creation of the order details.
   */
  public void setCreation(LocalDateTime creation) {
    this.creation = creation;
  }

  /**
   * Returns when the order details was updated lastly.
   *
   * @return when the order details was updated lastly.
   */
  public LocalDateTime getUpdated() {
    if (this.updated == null) {
      return this.creation;
    }
    return updated;
  }

  /**
   * Sets the order detals of when it was last updated until now.
   */
  public void setUpdated() {
    this.updated = LocalDateTime.now();
  }

    
}
