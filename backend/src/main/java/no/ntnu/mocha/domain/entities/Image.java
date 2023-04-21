package no.ntnu.mocha.domain.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a product image and it's details.
 * 
 * @since   06.02.2023
 * @version 21.03.2023
 */
@Entity
@Table(name = "image")
public class Image {
    

    /** Image ID (primary key) represented as Long in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "image_id", nullable = false)
    private long iId;

    /** Url to image-file, represented as Varchar(255). */
    @Column(name = "url")
    private String url;

    /** Image height in px, represented as Int(11). */
    @Column(name = "height")
    private int height;

    /** Image width in px, represented as Int(11). */
    @Column(name = "width")
    private int width;

    /** Color theme of the image, represented as Varchar(255). */
    @Column(name = "color")
    private String color;

    /** Text to display in the HTML alt-attribute, represented as Text. */
    @Column(name = "alt")
    private String alt;

    /** File extension of the image, represented as VarChar(255). */
    @Column(name = "extension")
    private String extension;


    /**
     * Empty constructor.
     */
    public Image() {}

    /**
     * Creates an instance of Image.
     * 
     * @param url       the url to the image-file (e.g., "")
     * @param height    the height of the image (e.g., 45px)
     * @param width     the width of the image (e.g., 70px)
     * @param color     the color theme of the image (e.g., "Brown")
     * @param alt       the text to display in the HTML alt-attribute (e.g., "Mocha Cofee")
     * @param extension the file extension of the image (e.g., "png", "jpeg")
     */
    public Image(String url, int height, int width, String color, String alt, String extension) {
        super();
        this.url = url;
        this.height = height;
        this.width = width;
        this.color = color;
        this.alt = alt;
        this.extension = extension;
    }

    
    /**
     * Returns the unique iId of the image.
     * 
     * @return the iId of the image.
     */
    public Long getIid() { 
        return iId; 
    }

    /**
     * Returns the url of the image.
     * 
     * @return the url of the image.
     */
    public String getUrl() { 
        return url; 
    }

    /**
     * Returns the height of the image.
     * 
     * @return the height of the image.
     */
    public int getHeight() { 
        return height; 
    }

    /**
     * Returns the width of the image.
     * 
     * @return the width of the image.
     */
    public int getWidth() { 
        return width; 
    }

    /**
     * Returns the color of the image.
     * 
     * @return the color of the image.
     */
    public String getColor() { 
        return color; 
    }

    /**
     * Returns the display text of the HTML
     * alt-attribute.
     * 
     * @return the text displayed in the alt-attribute.
     */
    public String getAlt() { 
        return alt; 
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
     * Set the unique iId of the image.
     * 
     * @param iId the unique iId of the image.
     */
    public void setmID(long iId) { 
        this.iId = iId; 
    }

    /**
     * Set the url of the image.
     * 
     * @param url the url of the image.
     */
    public void setUrl(String url) { 
        this.url = url; 
    }

    /**
     * Set the height of the image.
     * 
     * @param height the height of the image.
     */
    public void setHeight(int height) { 
        this.height = height; 
    }

    /**
     * Set the width of the image.
     * 
     * @param width the width of the image.
     */
    public void setWidth(int width) { 
        this.width = width; 
    }

    /**
     * Set the color of the image.
     * 
     * @param color the color of the image.
     */
    public void setColor(String color) { 
        this.color = color; 
    }

    /**
     * Set the alt-attribute of the image.
     * 
     * @param alt the alt-attribute of the image.
     */
    public void setAlt(String alt) { 
        this.alt = alt;
    }

    /**
     * Set the file extension of the image.
     * 
     * @param extension the file extension of the image.
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
}
