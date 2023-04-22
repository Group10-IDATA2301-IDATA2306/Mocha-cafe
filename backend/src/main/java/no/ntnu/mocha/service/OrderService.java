package no.ntnu.mocha.service;

import java.util.List;

import no.ntnu.mocha.domain.entities.Order;

/**
 * <h1>Business Logic interface for the Order </h1>
 * 
 * <p>Represents an interface that defines the operations
 * that can be performed in Order in the application. </p>
 * 
 * @version 22.04.2023
 * @since   22.04.2023
 */
public interface OrderService {

    Order getOrderItem(long id);

    List<Order> getAllOrder();

    void addOrder(Order order);

    void addAllOrderItems(Iterable<Order> order);

    void update(long id, Order order);

    void deleteOrder(long id);

}
