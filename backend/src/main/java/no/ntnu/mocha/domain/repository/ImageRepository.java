package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entity.Image;

public interface ImageRepository extends CrudRepository<Long, Image>{
    
}
