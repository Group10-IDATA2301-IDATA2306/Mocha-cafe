package no.ntnu.mocha.domain.services;

import org.springframework.beans.factory.annotation.Autowired;

import no.ntnu.mocha.domain.repository.ProductRepository;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    
}
