package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entity.Product_Category;

/**
 * Represents Product_CategoryRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 */
public interface Product_CategoryRepository extends CrudRepository<Long, Product_Category> {
    
}
