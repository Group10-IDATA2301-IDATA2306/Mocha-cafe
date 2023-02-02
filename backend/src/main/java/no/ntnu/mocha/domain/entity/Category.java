package no.ntnu.mocha.domain.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Category {
    
    /** Category ID (primary key) represented as Varchar(255) in the database. */
    @Id
    private String cID;

    /** Category name, represented as Varchar(255). */
    private String name;

    /** Description text for the category, represented as Text. */
    private String description;



    public Category() {}

    public Category(String cID, String name, String description) {
        super();
        this.cID = cID;
        this.name = name;
        this.description = description;
    }



    public String getcID() { return cID; }

    public String getName() { return name; }

    public String getDescription() { return description; }



    
    public void setcID(String cID) { this.cID = cID; }

    public void setName(String name) { this.name = name; }

    public void setDescription(String description) { this.description = description; }
}