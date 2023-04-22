package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entities.ProductCategory;

/**
 * Represents ProductCategoryRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.04.2023
 * @since   21.04.2023
 * @ProductCategory
 */
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Long> {
    
    /**
     * Finds the product category by the given name.
     * 
     * @param name  the name of the product category.
     * @return  the product category by the given name.
     */
    ProductCategory findByName(String name);
}
