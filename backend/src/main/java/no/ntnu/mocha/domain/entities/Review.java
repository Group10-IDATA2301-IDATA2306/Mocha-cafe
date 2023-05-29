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
 * Represents a customer review submitted on the website.
 * 
 * @since   06.02.2023
 * @version 22.04.2023
 */
@Entity
@Table(name = "review")
public class Review {
    
    /** Review ID (primary key) represented as Long in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "review_id")
    private long id;

    /** User ID (foreign key) represented as Long in the database. */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /** Product ID (foreign key) represented as Long in the database. */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    /** Content of the review represented as VarChar(255) in the database. */
    @Column(name = "review_comment")
    private String comment;

    /** Star rating of the review represented as Integer in the database. */
    @Column(name = "stars")
    private int stars;

    /** Date of the review represented as Date in the database. */
    @Column(name = "review_date")
    private LocalDateTime date;


    /**
     * Emtpy Constructor.
     */
    public Review() {}


    /**
     * Creates an instance of Review.
     * 
     * @param user      the user which made the review. 
     * @param product   the product which is reviewed.
     * @param comment   the content of the review.
     * @param stars     the star rating of the review.
     */
    public Review(User user, Product product, String comment, int stars) {
        super();
        this.user = user;
        this.product = product;
        this.comment = comment;
        this.stars = stars;
        this.date = LocalDateTime.now();
    }

    /**
     * Get the id of the Review.
     * 
     * @return id of the Review.
     */
    public long getId() {
        return id;
    }

    /**
     * Set the id of the Review.
     * 
     * @param id the id of the Review.
     */
    public void setRid(long id) {
        this.id = id;
    }

    /**
     * Get the comment of the Review.
     * 
     * @return comment of the Review.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Set the comment of the Review.
     * 
     * @param comment the comment of the Review.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Get the stars of the Review.
     * 
     * @return stars of the Review.
     */
    public int getStars() {
        return stars;
    }

    /**
     * Set the stars of the Review.
     * 
     * @param stars the stars of the Review.
     */
    public void setStars(int stars) {
        this.stars = stars;
    }

    /**
     * Get the date of the Review.
     * 
     * @return date of the Review.
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Set the date of the Review.
     * 
     * @param date the date of the Review.
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}