/**
 * A JavaScript class representing a product.
 * 
 * @author Oskar Lothe
 * @class
 */

class Product {
    /**
     * Constructor for the Product class.
     * 
     * @param {*} productID The ID of the product.
     * @param {*} name The name of the product.
     * @param {*} categories A list of categories which the product belongs to.
     * @param {*} price The price of the product.
     * @param {*} description A description of the product.
     * @param {*} imgURL The URL to an image of the product.
     */
    constructor(productID, imgURL, name, categories, price, description) {
        this.productID = productID;
        this.name = name;
        this.categories = categories;
        this.price = price;
        this.description = description;
        this.imgURL = imgURL;
    }

    /**
     * Returns the ID of the product.
     * 
     * @returns productID
     */
    getProductId() {
        return this.productID;
    }

    /**
     * Returns the imageURL of the product.
     * 
     * @returns image URL
     */
    getImgUrl() {
        return this.imgURL;
    }

    /**
     * Returns the name of the project.
     * 
     * @returns product name
     */
    getName() {
        return this.name;
    }

    /**
     * Returns a list of categories which belongs to the product.
     * 
     * @returns product categories
     */
    getCategories() {
        return this.categories;
    }

    /**
     * Returns the price of the product.
     * 
     * @returns product price
     */
    getPrice() {
        return this.price;
    }

    /**
     * Returns the description of the product.
     * 
     * @returns product description
     */
    getDescription() {
        return this.description;
    }
}