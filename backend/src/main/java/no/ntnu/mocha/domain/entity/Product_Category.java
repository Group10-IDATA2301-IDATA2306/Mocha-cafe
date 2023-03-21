package no.ntnu.mocha.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a table in the database acting as
 * a connection between the many to many relationship
 * of the Product table and the Category table.
 * 
 * @since   21.03.2023
 * @version 21.03.2023
 */
@Entity
@Table(name = "product-category")
public class Product_Category {

    /** Category ID (primary key and foreign key) represented as Long in the database. */
    @Id
    private long cId;

    /** Product ID (primary key and foreign key) represented as Long in the database. */
    @Id
    private long pId;


    /**
     * Emtpy Constructor.
     */
    public Product_Category() {}


    /**
     * Creates an instance of Product_Category.
     * 
     * @param cId the cId of the Category.
     * @param pId the pId of the Product.
     */
    public Product_Category(long cId, long pId) {
        super();
        this.cId = cId;
        this.pId = pId;
    }


    /**
     * Returns the cId of the Category.
     * 
     * @return the cId of the Category.
     */
    public long getCid() {
        return cId;
    }

    /**
     * Set the unique cId of the Category.
     * 
     * @param cId the unique cId of the Category.
     */
    public void setCid(long cId) {
        this.cId = cId;
    }

    /**
     * Returns the pId of the Product.
     * 
     * @return the pId of the Product.
     */
    public long getPid() {
        return pId;
    }

    /**
     * Set the unique pId of the Product.
     * 
     * @param pId the unique pId of the Product.
     */
    public void setPid(long pId) {
        this.pId = pId;
    }
}
