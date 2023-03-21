package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entity.Category;

public interface CategoryRepository extends CrudRepository<Long, Category> {
    
}
