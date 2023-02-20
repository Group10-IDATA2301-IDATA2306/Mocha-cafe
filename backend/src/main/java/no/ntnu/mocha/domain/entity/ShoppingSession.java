package no.ntnu.mocha.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
// import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Represents a shopping session made by a cusomter.
 */
@Entity
@Table(name = "shopping_session")
public class ShoppingSession {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "session_id")
    private long id;

    //@OnDelete(action = OnDeleteAction.CASCADE)
    //@OneToOne(cascade = CascadeType.REMOVE)
    //@JoinColumn(name = "user_id")
    //private User user;

    //@JsonManagedReference
    //@OneToMany(mappedBy = "shoppingSession")
    //private final Set<CartItem> cart = new HashSet<>();

    private double total;

    private int quantity;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    /**
     * Empty constructor.
     */
    //public ShoppingSession() {}


    public ShoppingSession() {
        // this.user = user;
        this.createdAt = LocalDateTime.now();
    }


    public long getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //public User getUser() {return this.user;}
    //public void setUser(User user) {this.user = user;}


    //public Set<CartItem> getCart() {return this.cart;}
    //public void setCart(Set<CartItem> cart) {this.cart = cart;}


    public double getTotal() {
        return this.total;
    }

    /* 
    public void updateTotal() {
        if (this.cart.isEmpty()) {
            this.total = 0;
        } else {
            this.total = this.cart.stream().mapToDouble(CartItem::getTotal).sum();
        }
    } */

    public int getQuantity() {
        return this.quantity;
    }

    /* 
    public void updateQuantity() {
        if (this.cart.isEmpty()) {
            this.quantity = 0;
        } else {
            this.quantity = this.cart.stream().mapToInt(CartItem::getQuantity).sum();
        }
    } */


    public LocalDateTime getCreatedAt() {
        return this.getCreatedAt();
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
