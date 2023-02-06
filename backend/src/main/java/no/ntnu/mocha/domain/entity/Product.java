package no.ntnu.mocha.domain.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/**
 * Represents an product and it's details.
 * 
 * @since 06.02.2023
 * @version 06.02.2023
 */
@Entity
@Table(name = "product")
public class Product {
    
    /** Product ID (primary key) represented as Varchar(255) in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String pID;

    /** Category ID (foreign key to Category) represented as Varchar(255) in the database. */
    private String cID;

    /** Media ID (foreign key to Media) represented as Varchar(255) in the database. */
    private String mID;

    /** Product name, represented as Varchar(255). */
    private String name;

    /** Product price, represented as Int(11). */
    private int price;

    /** Quantity of products, represented as Int(11). */
    private int amount;

    /** Weight of the product, represented as Double. */
    private double weight;

    /** Alternative discount to the product as a decimal-percentage, represented as Double. */
    private double discount;

    /** Description text for the product, represented as Text. */
    private String description;

    /** Indicating wether to display the product on the website or not, represented as Boolean. */
    private boolean display;


    /**
     * Empty constructor.
     */
    public Product() {}

    /**
     * Creates an instance of an Product.
     * 
     * @param pID           the pID of the product (e.g., "")
     * @param cID           the cID of the product (e.g., "")
     * @param mID           the mID of the product (e.g., "")
     * @param name          the name of the product (e.g., "CofeeDockery")
     * @param price         the price of the product (measured in kr)
     * @param amount        the amount of the product (e.g., 23)
     * @param weight        the weight of the product (measured in kilos)
     * @param discount      the discount of the product (e.g., 50%)
     * @param description   the description of the product (e.g., "This is a dark mocha cofee")
     * @param display       the display of the product (boolean yes/no)
     */
    public Product(String pID, String cID, String mID, String name, 
                    int price, int amount, double weight, double discount,
                    String description, boolean display) {

        super();
        this.pID = pID;
        this.cID = cID;
        this.mID = mID;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.weight = weight;
        this.discount = discount;
        this.description = description;
        this.display = display;
    }

    /**
     * Returns the pID of the product.
     * 
     * @return the pID of the product
     */
    public String getpID() {
        return pID;
    }

    /**
     * Set the pID of the product.
     * 
     * @param pID the pID of the product
     */
    public void setpID(String pID) {
        this.pID = pID;
    }

    /**
     * Returns the cID of the product.
     * 
     * @return the cID of the product
     */
    public String getcID() {
        return cID;
    }

    /**
     * Set the cID of the product.
     * 
     * @param cID the cID of the product
     */
    public void setcID(String cID) {
        this.cID = cID;
    }

    /**
     * Returns the mID of the product.
     * 
     * @return the mID of the product
     */
    public String getmID() {
        return mID;
    }

    /**
     * Set the mID of the product.
     * 
     * @param mID the mID of the product
     */
    public void setmID(String mID) {
        this.mID = mID;
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
    public int getPrice() {
        return price;
    }

    /**
     * Set the price of the product.
     * 
     * @param price the price of the product
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Returns the amount of the product.
     * 
     * @return the amount of the product
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set the amount of the product.
     * 
     * @param amount the amount of the product
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Returns the weight of the product.
     * 
     * @return the weight of the product
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set the weight of the product.
     * 
     * @param weight the weight of the product
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Returns the discount of the product.
     * 
     * @return the discount of the product
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Set the discount of the product.
     * 
     * @param discount the discount of the product
     */
    public void setDiscount(double discount) {
        this.discount = discount;
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
    public boolean isDisplay() {
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
