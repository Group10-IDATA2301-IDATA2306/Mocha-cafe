package no.ntnu.mocha.domain.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents an image of a product.
 */
@Entity
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "product_image_id")
    private long id;

    private byte[] data;

    private String fileExtension;

    private String contentType;

    /**
     * Creates an instance of product image.
     * 
     * @param data          the array of bytes of an image.
     * @param extenstion    the file extension of this image (.jpg, png, etc.)
     * @param contentType   the content type of this image (image/jpeg, image/png, .etc)
     */
    public ProductImage(byte[] data, String extenstion, String contentType) {
        this.data = data;
        this.fileExtension = extenstion;
        this.contentType = contentType;
    }
    
    /**
     * Empty constructor.
     */
    public ProductImage() {}

    /**
     * Returns this product image's id.
     * 
     * @return  this product image's id.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id of this product image.
     * 
     * @param id the id to be set for this image.
     */
    public void setId() {
        this.id = id;
    }

    /**
     * Returns the array of bytes making up the image.
     * 
     * @return the array of bytes making up this image.
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the array of bytes making up the image.
     * 
     * @param data data the new array of bytes.
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    /**
     * Returns the file extension of this image.
     * 
     * @return the file extension of this image.
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the file extension of this image.
     * 
     * @param fileExtension the file extension of the image.
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    /**
     * Returns the content-type of this image.
     * 
     * @return content-type of the image.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the content-type of the image.
     * 
     * @param contentType content-type of the image.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

}
