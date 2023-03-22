package no.ntnu.mocha.domain.entities;

import javax.persistence.Entity;

import org.hibernate.annotations.CollectionId;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Represents a product and it's details.
 * 
 * @since   06.02.2023
 * @version 21.03.2023
 */
@Entity
@Table(name = "product")
public class Product {
    
    /** Product ID (primary key) represented as Long in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "product_id")
    private long pId;

    /** Image ID (foreign key to Image) represented as Long in the database. */
    @OneToOne
    @JoinColumn(name = "image_id")
    private Image iId;

    /** Product name, represented as Varchar(255). */
    @Column(name = "name")
    private String name;

    /** Product price, represented as Int(11). */
    @Column(name = "price")
    private double price;

    /** Size of the product measured in weight, represented as Int(11). */
    @Column(name = "amount")
    private String size;

    /** Description text for the product, represented as Text. */
    @Column(name = "description")
    private String description;

    /** Indicating wether to display the product on the website or not, represented as Boolean. */
    @Column(name = "display")
    private boolean display;


    /**
     * Empty constructor.
     */
    public Product() {}

    /**
     * Creates an instance of Product.
     * 
     * @param name          the name of the product (e.g., "CofeeDockery")
     * @param price         the price of the product (measured in kr)
     * @param size          the size of the product (e.g., 25.9)
     * @param iID           the iID of the product (e.g., "")
     * @param description   the description of the product (e.g., "This is a dark mocha cofee")
     * @param display       the display of the product (boolean true/false)
     */
    public Product(String name, double price, String size, Image iId, String description, boolean display) {
        super();
        this.name = name;
        this.price = price;
        this.size = size;
        this.iId = iId;
        this.description = description;
        this.display = display;
    }

    /**
     * Returns the pId of the product.
     * 
     * @return the pId of the product
     */
    public long getPid() {
        return pId;
    }

    /**
     * Set the pId of the product.
     * 
     * @param pId the pId of the product
     */
    public void setPid(long pId) {
        this.pId = pId;
    }


    /**
     * Returns the iId of the product.
     * 
     * @return the iId of the product
     */
    public Image getIiD() {
        return iId;
    }

    /**
     * Set the iId of the product.
     * 
     * @param iId the iId of the product
     */
    public void setIiD(Image iId) {
        this.iId = iId;
    }

    /**
     * Returns the name of the product.
     * 
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the product.
     * 
     * @param name the name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the product.
     * 
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price of the product.
     * 
     * @param price the price of the product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the size of the product.
     * 
     * @return the size of the product
     */
    public String getSize() {
        return size;
    }

    /**
     * Set the size of the product.
     * 
     * @param size the size of the product
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Returns the description of the product.
     * 
     * @return the description of the product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the product.
     * 
     * @param description the description of the product
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the display of the product.
     * 
     * @return the display of the product
     */
    public boolean getDisplay() {
        return display;
    }

    /**
     * Set the display of the product.
     * 
     * @param display the display of the product
     */
    public void setDisplay(boolean display) {
        this.display = display;
    }
}
