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

    /** Size of the product */
    private String size;

    /** Description of the product. */
    private String description;

    /** The category of a product */
    private String category;



    /**
     * Empty Constructor.
     */
    public ProductDto(){}

    /**
     * Creates an instance of ProductDto.
     * 
     * @param imageId       The id of the image associated with the product.
     * @param name          The name of the product.
     * @param price         The price of the product.
     * @param amount        The amount of the specific product.
     * @param description   The description of the product.
     * @param category      The category of the product.
     */
    public ProductDto(long imageId, String name, double price,
                        String size, String description,
                        String category) {
                            this.imageId = imageId;
                            this.name = name;
                            this.price = price;
                            this.size = size;
                            this.description = description;
                            this.category = category;
    }

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
    public String getSize() {
        return size;
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
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the product.
     * 
     * @param category  the category of the product.s
     */
    public void setCategory(String category) {
        this.category = category;
    } 

                
}
