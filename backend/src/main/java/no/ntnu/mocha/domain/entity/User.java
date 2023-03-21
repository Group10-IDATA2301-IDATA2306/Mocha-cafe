package no.ntnu.mocha.domain.entity;

/**
 * Represents an User.
 * 
 * @version 21.03.2023
 * @since   21.03.2023
 */
public class User {
    
    /** Unique User Id */
    private long Uid;

    /** The firstname of the User */
    private String firstName;

    /** The lastname of the User */
    private String lastName;

    /** The password of the User */
    private String password;

    /** The email of the User */
    private String email;

    /** The country of the User */
    private String country;

    /** The street of the User */
    private String street;

    /** The housenumber of the User */
    private int houseNumber;

    /** The city of the User */
    private String city;

    /** The zip-code of the User */
    private int zipCode;

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
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the housenumber of the User.
     * 
     * @param houseNumber the housenumber of the User.
     */
    public void setHouseNumber(int houseNumber) {
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
