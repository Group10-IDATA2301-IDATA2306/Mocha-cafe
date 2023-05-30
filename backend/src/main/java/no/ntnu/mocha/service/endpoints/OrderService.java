package no.ntnu.mocha.service.endpoints;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.DTO.OrderDto;
import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.domain.entities.User;
import no.ntnu.mocha.domain.repository.OrderRepository;
import no.ntnu.mocha.domain.repository.UserRepository;

/**
 * <h1>Business Logic Service class for Order </h1>
 * 
 * <p> Representing an Service class for the Order and implements the
 * Order Service interface with the additional methods. </p>
 * 
 * @version 22.04.2023
 * @since   22.04.2023
 */
@Service public class OrderService {

    @Autowired private OrderRepository orderRepository;
    @Autowired private UserRepository userRepository;



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
    public Iterable<Order> getAllOrders() {
        List<Order> order = new ArrayList<>();
        orderRepository.findAll().forEach(order::add);
        return order;
    }


    /**
     * Creates a new order and adds it to the database.
     * 
     * @param dto the dto representing the order.
     * @return the new order or null if error occured.
     */
    public Order createOrder(OrderDto dto) {
        Optional<User> user = userRepository.findById(dto.getUserId());
        return (user.isPresent()) ? orderRepository.save(new Order(user.get())) : null;
    }

    
    /**
     * Returns a list of all orders by a user.
     * 
     * @return {@code List<Order>} of all the orders
     *         made by a given user.
     */
    public Iterable<Order> getAllByUser(long id) {
        List<Order> order = new ArrayList<>();
        orderRepository.findAllByUserId(id).forEach(order::add);
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
     * @param date  the new date of the order.
     */
    public void update(long id, String date) {
        LocalDate localDate = LocalDate.parse(date);
        this.orderRepository.update(id, localDate);
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
