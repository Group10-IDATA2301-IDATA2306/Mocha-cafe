package no.ntnu.mocha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.ntnu.mocha.DTO.OrderDto;
import no.ntnu.mocha.domain.entities.Order;
import no.ntnu.mocha.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {
    
    @Autowired
    private OrderService service;


    @GetMapping
    public Iterable<Order> getOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/user/{id}")
    public Iterable<Order> getByUser(@PathVariable long id) {
        return service.getAllByUser(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrder(@PathVariable long id, OrderDto dto) {
        service.update(id, dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable long id) {
        service.deleteOrder(id); 
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
