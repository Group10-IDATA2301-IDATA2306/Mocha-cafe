package no.ntnu.mocha.domain.repository;

import org.springframework.data.repository.CrudRepository;

import no.ntnu.mocha.domain.entity.Media;

/**
 * Represents an MediaRepository interface with CRUD functionalities.
 * 
 * @since 06.02.2023
 * @version 06.02.2023
 */
public interface MediaRepository extends CrudRepository<Media, String> {
    
}
