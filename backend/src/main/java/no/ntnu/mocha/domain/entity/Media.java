package no.ntnu.mocha.domain.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/**
 * Represents an media and it's details.
 * 
 * @since 06.02.2023
 * @version 06.02.2023
 */
@Entity
@Table(name = "media")
public class Media {
    

    /** Media ID (primary key) represented as Varchar(255) in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String mID;

    /** Path to media-file, represented as Varchar(255). */
    private String path;

    /** Media height in px, represented as Int(11). */
    private int height;

    /** Media width in px, represented as Int(11). */
    private int width;

    /** Color theme of the media, represented as Varchar(255). */
    private String theme;

    /** Text to display in the HTML alt-attribute, represented as Text. */
    private String alt;


    /**
     * Empty constructor.
     */
    public Media() {}

    /**
     * Creates an instance of an Media.
     * 
     * @param mID       the unique mID of the Media (e.g., "837R3")
     * @param path      the path to media-file (e.g., "")
     * @param height    the height of the media (e.g., 45px)
     * @param width     the width of the media (e.g., 70px)
     * @param theme     the color theme of the media (e.g., "Brown")
     * @param alt       the text to display in the HTML alt-attribute (e.g., "Mocha Cofee")
     */
    public Media(String mID, String path, int height, 
                    int width, String theme, String alt) {

        super();
        this.mID = mID;
        this.path = path;
        this.height = height;
        this.width = width;
        this.theme = theme;
        this.alt = alt;
    }

    
    /**
     * Returns the unique mID of the media.
     * 
     * @return the mID of the media
     */
    public String getmID() { return mID; }

    /**
     * Returns the path of the media.
     * 
     * @return the path of the media
     */
    public String getPath() { return path; }

    /**
     * Returns the height of the media.
     * 
     * @return the height of the media
     */
    public int getHeight() { return height; }

    /**
     * Returns the width of the media.
     * 
     * @return the width of the media
     */
    public int getWidth() { return width; }

    /**
     * Returns the theme of the media.
     * 
     * @return the theme of the media
     */
    public String getTheme() { return theme; }

    /**
     * Returns the display text of the HTML
     * alt-attribute.
     * 
     * @return the text displaye don the alt-attribute
     */
    public String getAlt() { return alt; }


    /**
     * Set the unique mID of the media.
     * 
     * @param mID the unique mID of the media
     */
    public void setmID(String mID) { this.mID = mID; }

    /**
     * Set the path of the media.
     * 
     * @param path the path of the media
     */
    public void setPath(String path) { this.path = path; }

    /**
     * Set the height of the media.
     * 
     * @param height the height of the media
     */
    public void setHeight(int height) { this.height = height; }

    /**
     * Set the width of the media.
     * 
     * @param width the width of the media
     */
    public void setWidth(int width) { this.width = width; }

    /**
     * Set the theme of the media.
     * 
     * @param theme the theme of the media
     */
    public void setTheme(String theme) { this.theme = theme; }

    /**
     * Set the alt-attribute of the media.
     * 
     * @param alt the alt-attribute of the media
     */
    public void setAlt(String alt) { this.alt = alt;}
}
