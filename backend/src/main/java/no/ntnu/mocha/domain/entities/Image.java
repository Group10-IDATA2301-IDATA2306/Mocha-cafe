package no.ntnu.mocha.domain.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

/**
 * Represents a product image and it's details.
 * 
 * @since   06.02.2023
 * @version 22.04.2023
 */
@Entity
@Table(name = "image")
public class Image {
    

    /** Image ID (primary key) represented as Long in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "image_id", nullable = false)
    private long id;

    @Lob
    @Column(name = "imagedata")
    private byte[] imageData;

    /** File extension of the image, represented as VarChar(255). */
    @Column(name = "extension")
    private String extension;

    /** The content type of the image */
    @Column(name = "content_type")
    private String contentType;

    /** The content of the alt tag. */
    @Column(name = "alt_info")
    private String alt;


    /**
     * Empty constructor.
     */
    public Image() {}

    /**
     * Creates an instance of an Image.
     * 
     * @param imageData     the array of bytes of an Image.
     * @param extension     the file extension of the Image.
     * @param contentType   the content type of this Image.
     */
    public Image(byte[] imageData, String extension, String contentType, String alt) {
        super();
        this.imageData = imageData;
        this.extension = extension;
        this.contentType = contentType;
        this.alt = alt;
    }

    
    /**
     * Returns the unique id of the image.
     * 
     * @return the id of the image.
     */
    public Long getId() { 
        return id; 
    }

    /**
     * Set the unique iId of the image.
     * 
     * @param iId the unique id of the image.
     */
    public void setmID(long id) { 
        this.id = id; 
    }

    /**
     * Returns the file extension of the image.
     * 
     * @return file extension of the image.
     */
    public String getExtension() { 
        return extension; 
    }

    /**
     * Set the file extension of the image.
     * 
     * @param extension the file extension of the image.
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * Returns the array of the bytes creating 
     * the Image.
     * 
     * @return the array of bytes creating the Image.
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * Sets the array of byten creating the Image.
     * 
     * @param imageData the new array of bytes.
     */
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    /**
     * Returns the content type of the given
     * Image.
     * 
     * @return the content type of the given Image.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the content type of the given Image.
     * 
     * @param contentType the content type of the given
     *                      Image.
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
