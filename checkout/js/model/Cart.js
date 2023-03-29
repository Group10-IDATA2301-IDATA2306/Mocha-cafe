/**
 * A JavaScript class representing a cart.
 * 
 * @author Oskar Lothe
 * @class
 */
class Cart{
    /**
     * Constructor for the Cart class.
     */
    constructor() {
        this.products = [];
    }

    /**
     * Adds a Product object to the cart.
     * 
     * @param {*} product a product to be added
     */
    addProduct(product) {
        this.products.push(product);
    }

    /**
     * Removes a product from the cart.
     * 
     * @param {*} product a product to be removed
     */
    removeProduct(product) {
        const index = this.products.indexOf(product);
        if (index !== -1) {
            this.products.splice(index, 1);
        }
    }

    /**
     * Returns a list of all the products in the cart.
     * 
     * @returns the list of products
     */
    getProducts() {
        return this.products;
    }

    /**
     * Returns the number of products in the cart.
     * 
     * @returns the size of the cart
     */
    size() {
        return this.products.length;
    }
}