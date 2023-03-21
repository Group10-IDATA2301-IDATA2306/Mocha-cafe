package no.ntnu.mocha.domain.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private long rId;

    /** User ID (foreign key) represented as Long in the database. */
    private long uId;

    /** Product ID (foreign key) represented as Long in the database. */
    private long pId;

    /** Content of the review represented as VarChar(255) in the database. */
    private String comment;

    /** Star rating of the review represented as Integer in the database. */
    private int stars;

    /** Date of the review represented as Date in the database. */
    private Date date;


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
    public Review(long uId, long pId, String comment, int stars) {
        super();
        this.uId = uId;
        this.pId = pId;
        this.comment = comment;
        this.stars = stars;
        this.date = new Date();
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
    public long getUid() {
        return uId;
    }

    /**
     * Set the uId of the Review.
     * 
     * @param uId the uId of the Review.
     */
    public void setUid(long uId) {
        this.uId = uId;
    }

    /**
     * Get the pId of the Review.
     * 
     * @return pId of the Review.
     */
    public long getPid() {
        return pId;
    }

    /**
     * Set the pId of the Review.
     * 
     * @param pId the pId of the Review.
     */
    public void setPid(long pId) {
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
    public Date getDate() {
        return date;
    }

    /**
     * Set the date of the Review.
     * 
     * @param date the date of the Review.
     */
    public void setDate(Date date) {
        this.date = date;
    }
}