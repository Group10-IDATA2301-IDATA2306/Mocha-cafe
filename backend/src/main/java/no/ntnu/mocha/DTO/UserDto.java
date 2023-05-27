package no.ntnu.mocha.DTO;

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

    /** Username of the User */
    private String username;

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

    /** Role of the User */
    private String role;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
