package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entity.Product_Category;

public interface Product_CategoryRepository extends CrudRepository<Long, Product_Category> {
    
}
