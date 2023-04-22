package no.ntnu.mocha.service;

import no.ntnu.mocha.DTO.ProductDto;
import no.ntnu.mocha.domain.entities.Product;

/**
 * <h1>Business Logic interface for the Products </h1>
 * 
 * Represents an interface that defines the operations
 * that can be performed in products in the application.
 * 
 * @version 21.04.2023
 * @since   21.04.2023
 */
public interface ProductService {

    /**
     * Access elements of the Product Collection, and
     * returns all the products.
     * 
     * @return all the products
     */
    Iterable<Product> getAllProducts();

    /**
     * Returns the product by id.
     * 
     * @param id the id of the product
     * @return the product
     */
    Product getProduct(long id);

    /**
     * Returns the product with correct name.
     * 
     * @param name the name of the product
     * @return the product with the right name
     */
    Product getProductByName(String name);

    /**
     * Adds a product from the Product DTO.
     * 
     * @param name the name of the product
     * @return the created product
     */
    Product addProductFromDto(String name);

    /**
     * Updates a product with the given id using data
     * from the Product DTO.
     * 
     * @param id        the id of the product
     * @param product   the DTO containing the updated product
     * @return          the updated product
     */
    Product updateProduct(long id, ProductDto product);

    /**
     * Deletes a product with the given id.
     * 
     * @param id the id of the product
     */
    void deleteProduct(long id);


}
