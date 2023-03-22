package no.ntnu.mocha.domain.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

/**
 * Represents a category and it's details.
 * 
 * @since   06.02.2023
 * @version 22.03.2023
 */
@Entity
@Table(name = "category")
public class Category {
    
    /** Category ID (primary key) represented as Long in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "category_id")
    private long cId;

    /** Category name, represented as Varchar(255). */
    @Column(unique = true, name = "name")
    private String name;

    /** Description, represented as Varchar(255). */
    @Column(name = "description")
    private String description;


    /**
     * Emtpy Constructor.
     */
    public Category() {}

    /**
     * Creates an instance of Category.
     * 
     * @param name the name of the category (e.g., "Mocha")
     */
    public Category(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }


    /**
     * Returns the cId of the category.
     * 
     * @return the cId of the category.
     */
    public long getCid() { 
        return cId; 
    }

    /**
     * Returns the name of the category.
     * 
     * @return the name of the category.
     */
    public String getName() { 
        return name; 
    }

    /**
     * Set the unique cId of the category.
     * 
     * @param cId the unique cId of the category.
     */
    public void setCid(long cId) { 
        this.cId = cId; 
    }

    /**
     * Set the name of the category.
     * 
     * @param name the name of the category.
     */
    public void setName(String name) { 
        this.name = name; 
    }

    /**
     * Returns the description of the category.
     * 
     * @return the description of the category.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the category.
     * 
     * @param description the description of the category.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}