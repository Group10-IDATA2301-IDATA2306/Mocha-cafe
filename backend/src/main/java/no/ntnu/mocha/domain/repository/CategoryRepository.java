package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;
import no.ntnu.mocha.domain.entity.ProductCategory;

/**
 * Represents an CategoryRepository interface with CRUD functionalities.
 * 
 * @since 06.02.2023
 * @version 06.02.2023
 */
public interface CategoryRepository extends CrudRepository<ProductCategory, String> {
    
}
