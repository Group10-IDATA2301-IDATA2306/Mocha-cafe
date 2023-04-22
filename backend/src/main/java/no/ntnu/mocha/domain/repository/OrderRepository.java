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
 * @see     Order
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

    /**
     * Returns all the orders by the given id.
     * 
     * @param id    the id of the orders.
     * @return  all the orders by the given id.
     */
    List<Order> findAllOrdersById(Order id);

}
