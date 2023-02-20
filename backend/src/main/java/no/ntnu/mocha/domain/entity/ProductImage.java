package no.ntnu.mocha.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * Represents an image associated with a product.
 * 
 * Contains attributes which describes an image and how its data
 * is stored in terms of file-type and content type.
 */
@Entity
public class ProductImage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "product_image_id")
    private long id;

    @Lob
    private byte[] data;

    // @ApiModelProperty("Image file extension.")
    private String fileExtension;

    // @ApiModelProperty("Image content type.")
    private String contentType;


    /**
     * Empty contstructor.
     */
    public ProductImage() {}


    /**
     * Create new instance of the ProductImage class.
     *
     * @param data image represented as an array of bytes.
     * @param extension file extension of the image.
     * @param contentType content type of the image.
     */
    public ProductImage(byte[] data, String extension, String contentType) {
        this.data = data;
        this.fileExtension = extension;
        this.contentType = contentType;
    }

    
    /**
     * Get the ID of this ProductImage instance.
     *
     * @return ID of the image.
     */
    public long getId() {
        return this.id;
    }

    /**
     * Set the ID of this ProductImage instance.
     *
     * @param id new ID of the image.
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Get the image data as an array of bytes.
     * 
     * @return byte[] representation of image data.
     */
    public byte[] getData() {
        return this.data;
    }

    /**
     * Set the image data representing this image.
     * 
     * @param date an array of bytes representing the image.
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Get the file extension of the image.
     * 
     * @return string representation of this image's file extension.
     */
    public String getFileExtension() {
        return this.fileExtension;
    }

    /**
     * Set the file extension of the image.
     * 
     * @param fileExtension string representing the file extension.
     */
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }


    /**
     * Get the content type of the ProductImage.
     * 
     * @return content type for this image as a string.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the content type of the image.
     * 
     * @param contentType the content type of the image data.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
