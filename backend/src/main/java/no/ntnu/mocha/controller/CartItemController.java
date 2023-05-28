package no.ntnu.mocha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
