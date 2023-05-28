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

    /** Username of the User */
    private String username;

    /** Password of the User */
    private String password;

    /** Email of the User */
    private String email;

    /** Bio of the User */
    private String bio;

    /** Role of the User */
    private String role;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
     * Returns the bio of the User.
     * 
     * @return the bio of the User.
     */
    public String getBio() {
        return bio;
    }

    /**
     * Sets the bio of the User.
     * 
     * @param bio the bio of the User.
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
