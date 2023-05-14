package no.ntnu.mocha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.domain.repository.OrderRepository;

/**
 * <h1>Business Logic Service class for Order </h1>
 * 
 * <p> Representing an Service class for the Order and implements the
 * Order Service interface with the additional methods. </p>
 * 
 * @version 22.04.2023
 * @since   22.04.2023
 */
@Service
public class OrderService {

    /** Gives access to the Order Repository */
    @Autowired
    private OrderRepository orderRepository;

    /**
     * Returns the order with the given id.
     * 
     * @param id    the id of the order.
     * @return  {@code Order} with the given id.
     */
    public Order getOrderItem(long id) {
        return this.orderRepository.findById(id).orElse(null);
    }

    /**
     * Returns a list of all orders.
     * 
     * @return {@code List<Order>} of all the orders
     *         in the database.
     */
    public List<Order> getAllOrder() {
        List<Order> order = new ArrayList<>();
        orderRepository.findAll().forEach(order::add);
        return order;
    }

    /**
     * Adds an order to the database.
     * 
     * @param {@code order} to be added.
     */
    public void addOrder(Order order) {
        this.orderRepository.save(order);
    }

    /**
     * Adds an collection of the orders into the database.
     * 
     * @param order iterable collection of the orders to be added.
     */
    public void addAllOrderItems(Iterable<Order> order) {
        this.orderRepository.saveAll(order);
    }

    /**
     * Updates the order with the given id.
     * 
     * @param id    the id of the order to be updated.
     * @param order the {@code order} to be updated.
     */
    public void update(long id, Order order) {
        if (order != null && order.getId() == id && getOrderItem(id) != null) {
            this.orderRepository.save(order);
        }
    }

    /**
     * Deletes the order by the given id.
     * 
     * @param id    the id of the order to be
     *              deleted.
     */
    public void deleteOrder(long id) {
        this.orderRepository.deleteById(id);
    } 
}
