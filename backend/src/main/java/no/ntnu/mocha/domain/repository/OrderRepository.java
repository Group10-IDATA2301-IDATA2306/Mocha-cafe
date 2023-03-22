package no.ntnu.mocha.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entities.Order;

/**
 * Represents OrderRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 */
public interface OrderRepository extends CrudRepository<Long, Order> {
    
    @Query(value = "select product_id from order group by product_id order by sum(quantity)", nativeQuery = true)
    List<Long> findTopBestSellingProduct();
    

}
