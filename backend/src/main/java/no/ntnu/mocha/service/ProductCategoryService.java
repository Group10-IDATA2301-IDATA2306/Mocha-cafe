package no.ntnu.mocha.service;

import no.ntnu.mocha.domain.entities.ProductCategory;

/**
 * <h1>Business Logic interface for the Category </h1>
 * 
 * Represents an interface that defines the operations
 * that can be performed in category in the application.
 * 
 * @version 22.04.2023
 * @since   22.04.2023
 */
public interface ProductCategoryService {
    
    /**
     * Returns all the product categories.
     * 
     * @return  all the product categories.
     */
    Iterable<ProductCategory> getAllProductCategories();

    /**
     * Returns the product category by the 
     * given id.
     * 
     * @param id    the id of the product category.
     * @return  the product category by the given id.
     */
    ProductCategory getProductCategory(long id);

    /**
     * Adds a product category into the database.
     * 
     * @param category the category to be added.
     */
    void addProductCategory(ProductCategory category);

    /**
     * Deletes an product category by the id in the 
     * database.
     * 
     * @param id    the given id of the product category.
     */
    void deleteProductCategory(long id);
}
