package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entity.Review;

public interface ReviewRepository extends CrudRepository<Long, Review> {
    
}
