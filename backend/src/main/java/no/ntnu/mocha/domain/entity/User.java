package no.ntnu.mocha.domain.entity;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents an User.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 */
@Entity
@Table(name = "user")
public class User {
    
    /** Unique User Id */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "user_id")
    private long Uid;

    /** The firstname of the User */
    @Column(name = "first_name")
    private String firstName;

    /** The lastname of the User */
    @Column(name = "last_name")
    private String lastName;

    /** The password of the User */
    @Column(name = "password")
    private String password;

    /** The email of the User */
    @Column(name = "email")
    private String email;

    /** The country of the User */
    @Column(name = "country")
    private String country;

    /** The street of the User */
    @Column(name = "street")
    private String street;

    /** The housenumber of the User */
    @Column(name = "house_number")
    private String houseNumber;

    /** The city of the User */
    @Column(name = "city")
    private String city;

    /** The zip-code of the User */
    @Column(name = "zip_code")
    private int zipCode;

    /**
     * Empty constructor.
     */
    public User(){}

    /**
     * Creates an instance of User.
     * 
     * @param Uid           User id of the User (e.g. "123")
     * @param firstName     First Name of the User (e.g. "Morten")
     * @param lastName      Last Name of the User (e.g. "Finvein")
     * @param password      Password of the User (e.g. "123Spill")
     * @param email         Email of the User (e.g. "morten@gmail.com")
     * @param country       Country of the User (e.g. "Albania")
     * @param street        Street of the User (e.g. "NTNU Ålesund veien 3")
     * @param houseNumber   House Number of the User (e.g. "52C")
     * @param city          City of the User (e.g. "Ålesund")
     * @param zipCode       zip-code of the User (e.g. "6800")
     */
    public User(long Uid, String firstName, String lastName,
                String password, String email, String country,
                String street, String houseNumber, String city, 
                int zipCode) {
                    super();
                    this.Uid = Uid;
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.password = password;
                    this.email = email;
                    this.country = country;
                    this.street = street;
                    this.houseNumber = houseNumber;
                    this.city = city;
                    this.zipCode = zipCode;
                }

    /**
     * Returns the User Id for the User.
     * 
     * @return the User Id for the User.
     */
    public long getUid(){
        return Uid;
    }

    /**
     * Sets the User id {@code Uid} for the User.
     * 
     * @param Uid the user id for the User.
     */
    public void setUid(long Uid) {
        this.Uid = Uid;
    }

    /**
     * Returns the firstname of the User.
     * 
     * @return the firstname of the User.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the firstname of the User.
     * 
     * @param firstName the firstname of the User.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the lastname of the User.
     * 
     * @return the lastname of the User.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the lastname of the User.
     * 
     * @param lastName the lastname of the User.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the password for the User.
     * 
     * @return the password for the User.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password for the User.
     * 
     * @param password the password for the User.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the email of the User.
     * 
     * @return the email of the User.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the User.
     * 
     * @param email the email of the User.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the country of the User.
     * 
     * @return the country of the User.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country of the User.
     * 
     * @param country the country of the User.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Returns the street of the User.
     * 
     * @return the street of the User.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street of the User.
     * 
     * @param street the street of the User.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns the housenumber of the User.
     * 
     * @return the housenumber of the User.
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the housenumber of the User.
     * 
     * @param houseNumber the housenumber of the User.
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Returns the city of the User.
     * 
     * @return the city of the User.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the User.
     * 
     * @param city the city of the User.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the zip-code of the User.
     * 
     * @return the zip-code of the User.
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * Sets the zip-code of the User.
     * 
     * @param zipCode the zip-code of the User.
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
