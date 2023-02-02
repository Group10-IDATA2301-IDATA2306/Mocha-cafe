package no.ntnu.mocha.domain.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Media {
    

    /** Media ID (primary key) represented as Varchar(255) in the database. */
    @Id
    private String mID;

    /** Path to media-file, represented as Varchar(255). */
    private String path;

    /** Media height in px, represented as Int(11). */
    private int height;

    /** Media width in pc, represented as Int(11). */
    private int width;

    /** Color theme of the media, represented as Varchar(255). */
    private String theme;

    /** Text to display in the HTML alt-attribute, represented as Text. */
    private String alt;



    public Media() {}

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

    

    public String getmID() { return mID; }

    public String getPath() { return path; }

    public int getHeight() { return height; }

    public int getWidth() { return width; }

    public String getTheme() { return theme; }

    public String getAlt() { return alt; }



    public void setmID(String mID) { this.mID = mID; }

    public void setPath(String path) { this.path = path; }

    public void setHeight(int height) { this.height = height; }

    public void setWidth(int width) { this.width = width; }

    public void setTheme(String theme) { this.theme = theme; }

    public void setAlt(String alt) { this.alt = alt;}
}
