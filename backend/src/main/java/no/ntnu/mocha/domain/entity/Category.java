package no.ntnu.mocha.domain.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/**
 * Represents an Category and its details.
 * 
 * @since 06.02.2023
 * @version 06.02.2023
 */
@Entity
@Table(name = "category")
public class Category {
    
    /** Category ID (primary key) represented as Varchar(255) in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cID;

    /** Category name, represented as Varchar(255). */
    private String name;

    /** Description text for the category, represented as Text. */
    private String description;


    /**
     * Emtpy Constructor.
     */
    public Category() {}

    /**
     * Creates an instance of the Category.
     * 
     * @param cID           the unique cID of the category (e.g., "234R8")
     * @param name          the name of the category (e.g., "Mocha")
     * @param description   the description of the category (e.g., "This is a strong coffee")
     */
    public Category(String cID, String name, String description) {
        super();
        this.cID = cID;
        this.name = name;
        this.description = description;
    }


    /**
     * Returns an cID object that is unique.
     * 
     * @return the cID of the category
     */
    public String getcID() { return cID; }

    /**
     * Returns the name of the category.
     * 
     * @return the name of the category
     */
    public String getName() { return name; }

    /**
     * Returns the description of the category.
     * 
     * @return the description of the category
     */
    public String getDescription() { return description; }



    /**
     * Set the unique cID of the category.
     * 
     * @param cID the unique cID of the category
     */
    public void setcID(String cID) { this.cID = cID; }

    /**
     * Set the name of the category.
     * 
     * @param name the name of the category
     */
    public void setName(String name) { this.name = name; }

    /**
     * Set the description of the category.
     * 
     * @param description the description of the category
     */
    public void setDescription(String description) { this.description = description; }
}