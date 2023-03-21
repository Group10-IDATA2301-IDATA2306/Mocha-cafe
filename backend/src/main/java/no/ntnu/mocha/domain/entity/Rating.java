package no.ntnu.mocha.domain.entity;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Represents a customer review submitted on the website.
 */
@Entity
public class Rating {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "rating_id", nullable = false)
    private long id;

    //@ManyToOne(cascade = CascadeType.DETACH)
    //@JoinColumn(name = "user_id")
    //private User user;

    private String displayName;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id")
    private Product product;

    private int rating;

    private String comment;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    private String userProduct;


    /**
     * Empty constructor.
     */
    public Rating() {}

    /**
     * Create a new instance of the Rating class.
     * 
     * @param user          The author of the rating.
     * @param displayname   The display name of the author.
     * @param product       The product associated to the rating.
     * @param rating        The integer rating of the product.
     * @param comment       The authors comment in the review.
     */
    public Rating(String displayName, Product product, int rating, String comment) {
        // this.user = user;
        setDisplayName(displayName);
        this.product = product;
        this.rating = rating;
        this.comment = comment;
        this.updatedAt = LocalDateTime.now();
        // this.userProduct = user.getEmail() + product.getName();
    }


    public long getId() {
        return this.id;
    }


    //public User getUser() {return this.user;}
    //public void setUser(User user) {this.user = user;}

    
    /**
     * Get the display name of the rating author.
     * 
     * @return display name of the reviewer.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the rating author.
     * 
     * @param displayName the new display name.
     */
    public void setDisplayName(String displayName) {
        if (displayName == null || displayName.isEmpty()) {
            this.displayName = "Anonymous";
        } else {
            this.displayName = displayName;
        }
    }


    /**
     * Get the user and the product represented as a String.
     * 
     * @return User and Product as a String.
     */
    public String getUserAndProductAsString() {
        return this.userProduct;
    }


    /**
     * Get the Product which where rated.
     * 
     * @return the rated Product.
     */
    public Product getProduct() {
        return this.product;
    }

    /**
     * Set the Product which where rated.
     * 
     * @param product the rated Product.
     */
    public void setProduct(Product product) {
        this.product = product;
    }


    /**
     * Get the comment associated with the review.
     * 
     * @return the comment as a String.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Set the comment associated with the review.
     * 
     * @param comment the comment belonging to the rating.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * Get the time and date of the last rating update.
     * 
     * @return LocalDateTime the time of last update.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the time and date of the last rating update.
     * 
     * @param updatedAt the LocalDateTime representing the time of last update.
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}