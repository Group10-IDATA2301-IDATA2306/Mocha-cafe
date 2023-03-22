package no.ntnu.mocha.DTO;

import no.ntnu.mocha.domain.entities.User;

/**
 * <h1>User DTO (Data Transfer Object)</h1>
 * 
 * <p>Representing an Data Transfer Object class for
 * User so that we can share either required data
 * or complete data from the source.</p>
 * 
 * @version 22.03.2023
 * @since   22.03.2023
 */
public class UserDto {
    
    /** Firstname of the User */
    private String firstName;

    /** Lastname of the User */
    private String lastName;

    /** Password of the User */
    private String password;

    /** Email of the User */
    private String email;

    /** Country of the User */
    private String country;

    /** City of the User */
    private String city;

    /** Street of the User */
    private String street;

    /** Housenumber of the user */
    private String houseNumber;

    /** ZipCode of the User */
    private int zipCode;

    /**
     * Empty constructor.
     */
    public UserDto() {}

    /**
     * Creates an instance of the UserDto. Several constructor for handling different data.
     * 
     * @param firstName     The firstname of the user.
     * @param lastName      The lastname of the user.
     * @param password      The password of the user.
     * @param email         The email of the user.
     * @param country       The country of the user.
     * @param street        The street of the user.
     * @param houseNumber   The house number of the user.
     * @param zipCode       The zip code of the user.
     */
    public UserDto(String firstName, String lastName, String password,
                    String email, String country, String street,
                    String houseNumber, int zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
    }

    /**
     * Creates and returns a User-object from the DTO.
     * 
     * @return a User Object.
     */
    public User getUserFromDto() {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setEmail(email);
        user.setCountry(country);
        user.setCity(city);
        user.setStreet(street);
        user.setHouseNumber(houseNumber);
        user.setZipCode(zipCode);

        return user;
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
