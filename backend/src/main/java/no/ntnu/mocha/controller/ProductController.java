package no.ntnu.mocha.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}
