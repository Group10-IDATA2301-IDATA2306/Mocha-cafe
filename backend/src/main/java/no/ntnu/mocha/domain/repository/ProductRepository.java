package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;
import no.ntnu.mocha.domain.entities.Product;

/**
 * Represents ProductRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 * @see     Product
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    /**
     * Returns the product by name.
     * 
     * @param name the name of the product
     * @return the name of the product
     */
    Product findByName(String name);
}
