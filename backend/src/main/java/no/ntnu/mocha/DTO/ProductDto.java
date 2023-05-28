package no.ntnu.mocha.DTO;

/**
 * <h1>Product DTO (Data Transfer Object)</h1>
 * 
 * <p>Representing an Data Transfer Object class for
 * Product so that we can share either required data
 * or complete data from the source.</p>
 * 
 * @version 22.03.2023
 * @since   22.03.2023
 */
public class ProductDto {

    /** Image id associated with the product */
    private long imageId;

    /** Name of the product */
    private String name;

    /** Price of the product */
    private double price;

    /** Amount of the product */
    private String amount;

    /** Description of the product. */
    private String description;

    /** The category of a product */
    private long category;

    private boolean display;

    private int totalBought;


    /**
     * Returns the image id associated with the product.
     * 
     * @return the image id associated with the product.
     */
    public long getImageId() {
        return imageId;
    }

    /**
     * Returns the name of the product.
     * 
     * @return the name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the product.
     * 
     * @return the price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the size of the product.
     * 
     * @return the size of the product.
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Returns the description of the product.
     * 
     * @return the description of the product.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the category of the product.
     * 
     * @return  the category of the product.
     */
    public long getCategory() {
        return category;
    }

    /**
     * Sets the category of the product.
     * 
     * @param category  the category of the product.s
     */
    public void setCategory(long category) {
        this.category = category;
    } 

    public boolean getDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public int getTotalBought() {
        return totalBought;
    }

    public void setTotalBought(int totalBought) {
        this.totalBought = totalBought;
    }
}
