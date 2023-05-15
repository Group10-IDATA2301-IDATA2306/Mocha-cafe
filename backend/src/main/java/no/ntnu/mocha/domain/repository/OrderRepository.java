package no.ntnu.mocha.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import no.ntnu.mocha.domain.entities.Order;

/**
 * Represents OrderRepository which extends
 * CrudRepsitory for CRUD-functionalites.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 * @see     Order
 */
@RepositoryRestResource
public interface OrderRepository extends CrudRepository<Order, Long> {

    /**
     * Returns all the orders by the given id.
     * 
     * @param id    the id of the orders.
     * @return  all the orders by the given id.
     */
    List<Order> findAllOrdersById(Order id);

}
