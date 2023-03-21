package no.ntnu.mocha.domain.entity;

import jakarta.persistence.Id;
import javax.persistence.Column;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Represents an item in an order from the user.
 */
@Entity
@Table(name = "order_item")
public class OrderItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_item_id")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_details_id")
    private OrderDetails orderDetails;

    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer quantity;

    @Column(name = "creation")
    private LocalDateTime creation;

    @Column(name = "updated")
    private LocalDateTime updated;

    /**
     * Emtpy constructor.
     */
    public OrderItem() {

    }

    public OrderItem(OrderDetails orderDetails, Product product, int quantity) {
        this.orderDetails = orderDetails;
        this.product = product;
        this.quantity = quantity;
        this.creation =  LocalDateTime.now();
        this.updated = LocalDateTime.now();

    }

    /**
   * Returns this order items id.
   *
   * @return this order items id.
   */
  public long getId() {
    return id;
  }

  /**
   * Returns the order details this order item belongs to.
   *
   * @return order details this order item belongs to.
   */
  public OrderDetails getOrderDetails() {
    return this.orderDetails;
  }

  /**
   * Sets the order details for this order item.
   *
   * @param orderDetails the order details to be set for this order item.
   */
  public void setOrderDetails(OrderDetails orderDetails) {
    this.orderDetails = orderDetails;
  }

  /**
   * Returns the product this order item represents.
   *
   * @return product this order item represents.
   */
  public Product getProduct() {
    return product;
  }

  /**
   * Sets the product that this order item represents.
   *
   * @param product the product that this order item is to represent.
   */
  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * Returns the quantity of the product in this order item.
   *
   * @return quantity of the product in this order item.
   */
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity of the product in this order item.
   *
   * @param quantity quantity of the product in this order item.
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Returns the calculated total for this order item.
   *
   * @return total of this order item.
   */
  public double getTotal() {
    return product.getPrice() * quantity;
  }

  /**
   * Returns when this order item was last updated.
   *
   * @return when this order item was last updated.
   */
  public LocalDateTime getUpdatedAt() {
    return updated;
  }

  /**
   * Sets when this order item was last updated to now.
   */
  public void setUpdated() {
    this.updated = LocalDateTime.now();
  }

  /**
   * Returns when this order item was created.
   *
   * @return when this order item was created.
   */
  public LocalDateTime getCreated() {
    return creation;
  }

}
