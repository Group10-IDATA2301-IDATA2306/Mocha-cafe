package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entity.Product;

public interface ProductRepository extends CrudRepository<Long, Product> {
    
}
