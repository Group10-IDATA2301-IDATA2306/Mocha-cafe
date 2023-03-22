package no.ntnu.mocha.domain.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents a customer review submitted on the website.
 * 
 * @since   06.02.2023
 * @version 21.03.2023
 */
@Entity
@Table(name = "review")
public class Review {
    
    /** Review ID (primary key) represented as Long in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "review_id")
    private long rId;

    /** User ID (foreign key) represented as Long in the database. */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User uId;

    /** Product ID (foreign key) represented as Long in the database. */
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product pId;

    /** Content of the review represented as VarChar(255) in the database. */
    @Column(name = "comment")
    private String comment;

    /** Star rating of the review represented as Integer in the database. */
    @Column(name = "stars")
    private int stars;

    /** Date of the review represented as Date in the database. */
    @Column(name = "date")
    private LocalDateTime date;


    /**
     * Emtpy Constructor.
     */
    public Review() {}


    /**
     * Creates an instance of Review.
     * 
     * @param uId       the uId of user which made the review. 
     * @param pId       the pId of the product which is reviewed.
     * @param comment   the content of the review.
     * @param stars     the star rating of the review.
     */
    public Review(User uId, Product pId, String comment, int stars) {
        super();
        this.uId = uId;
        this.pId = pId;
        this.comment = comment;
        this.stars = stars;
        this.date = LocalDateTime.now();
    }

    /**
     * Get the rId of the Review.
     * 
     * @return rId of the Review.
     */
    public long getRid() {
        return rId;
    }

    /**
     * Set the rId of the Review.
     * 
     * @param rId the rId of the Review.
     */
    public void setRid(long rId) {
        this.rId = rId;
    }

    /**
     * Get the uId of the Review.
     * 
     * @return uId of the Review.
     */
    public User getUid() {
        return uId;
    }

    /**
     * Set the uId of the Review.
     * 
     * @param uId the uId of the Review.
     */
    public void setUid(User uId) {
        this.uId = uId;
    }

    /**
     * Get the pId of the Review.
     * 
     * @return pId of the Review.
     */
    public Product getPid() {
        return pId;
    }

    /**
     * Set the pId of the Review.
     * 
     * @param pId the pId of the Review.
     */
    public void setPid(Product pId) {
        this.pId = pId;
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