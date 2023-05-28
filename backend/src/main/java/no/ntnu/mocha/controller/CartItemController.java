package no.ntnu.mocha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import no.ntnu.mocha.DTO.CartItemDto;
import no.ntnu.mocha.domain.entities.CartItem;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.service.CartItemService;

/**
 * <h1>Cart Item Controller </h1>
 * 
 * <p> REST API controller for the Cart Item.
 * 
 * @version 22.04.2023
 * @since   22.04.2023
 */
@RestController
@CrossOrigin
@RequestMapping("/cart")
public class CartItemController {

    @Autowired
    private CartItemService service;


    @GetMapping
    public Iterable<CartItem> getCart(@RequestParam long orderId) {
        return service.getCart(orderId);
    }

    @GetMapping("/products")
    public Iterable<Product> getCartProducts(@RequestParam long orderId) {
        return service.getCartProducts(orderId);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCart(@RequestParam long orderId) {
        service.deleteAllCartItemById(orderId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCartItem(@PathVariable long id) {
        service.deleteCartItem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/decrement/{id}")
    public ResponseEntity<?> decrementCartItem(@PathVariable long id) {
        service.decrementCartItem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/increment/{id}")
    public ResponseEntity<?> incrementCartItem(@PathVariable long id) {
        service.incrementCartItem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addCartItem(@RequestBody CartItemDto dto) {
        return (service.addCartItem(dto) != null) ? 
            new ResponseEntity<>(HttpStatus.CREATED) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
 