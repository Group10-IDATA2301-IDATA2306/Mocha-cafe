package no.ntnu.mocha.domain.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Product {
    
    /** Product ID (primary key) represented as Varchar(255) in the database. */
    @Id
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



    public Product() {}

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

    
    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }
}
