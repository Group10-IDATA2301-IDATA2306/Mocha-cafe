package no.ntnu.mocha.service;

import org.springframework.web.multipart.MultipartFile;

import no.ntnu.mocha.domain.entities.Image;

/**
 * <h1>Business Logic interface for the Image </h1>
 * 
 * <p>Represents an interface that defines the operations
 * that can be performed in Image in the application. </p>
 * 
 * @version 22.04.2023
 * @since   22.04.2023
 */
public interface ImageService {

    /**
     * Adds the image file.
     * 
     * @param imageFile the image file to add
     *                  to the database.
     * @return  the image to be added.
     */
    Image addImage(MultipartFile imageFile);

    /**
     * Returns the image with the given id.
     * 
     * @param id    the id of the image.
     * @return  the image with the given id, or 
     *          null if nothing is found.
     */
    Image getImageById(long id);

    /**
     * Updates the image with the given id and
     * the given image file.
     * 
     * @param id            the id of the image.
     * @param imageFile     the image file to update.
     * @return  the updated image.
     */
    Image updateImage(long id, MultipartFile imageFile);
    
}
