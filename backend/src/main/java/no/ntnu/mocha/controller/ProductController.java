package no.ntnu.mocha.controller;

import org.springframework.web.bind.annotation.RestController;

import no.ntnu.mocha.DTO.ProductDto;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.service.ProductService;

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

/**
 * Serves product-related REST API endpoints.
 */
@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    
    @Autowired
    private ProductService service;

    /**
     * Get all products stored in the database.
     * 
     * @return  All products in the storage.
     * @throws InterruptedException An exception if the executing thread is interrupted while
     *                              it is sleeping. 
     */
    @GetMapping
    public Iterable<Product> getAll() throws InterruptedException {
        return service.getAllProducts();
    }

    @GetMapping("/order")
    public Iterable<Product> getAllOrderedBy(@RequestParam String order) {
        return service.getAllOrderedBy(order);
    }

    @GetMapping("/name")
    public Product getByName(@RequestParam String name) {
        return service.getProductByName(name);
    }

    @GetMapping("/category")
    public Iterable<Product> getByCategory(@RequestParam String category) {
        return service.getAllByCategory(category);
    }

    @GetMapping("/{id}") 
    public ResponseEntity<?> getProductById(@PathVariable long id)  {
        return (service.getProduct(id) != null) ? 
            ResponseEntity.ok(service.getProduct(id)) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody ProductDto dto) {
        service.addProduct(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProductById(@PathVariable long id, @RequestBody ProductDto dto) {
        service.updateProduct(id, dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable long id) {
        return service.deleteProduct(id) ? 
            new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}/increment")
    public ResponseEntity<?> incrementProductPurchases(@PathVariable long id) {
        service.increment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}/setprice")
    public ResponseEntity<?> updateProductPrice(@PathVariable long id, @RequestParam double price) {
        service.updatePrice(id, price);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
