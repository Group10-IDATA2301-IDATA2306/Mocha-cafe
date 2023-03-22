package no.ntnu.mocha.DTO;

/**
 * <h1>Login User DTO (Data Transfer Object)</h1>
 * 
 * <p>Representing an Data Transfer Object class for
 * Login User so that we can share either required data
 * or complete data from the source.</p>
 * 
 * @version 22.03.2023
 * @since   22.03.2023
 */
public class LoginUserDto {

    /** The email of a user */
    private String email;

    /** The password for the user */
    private String password;

    /**
     * Returns the email for the user.
     * 
     * @return the email for the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the password for the user.
     * 
     * @return the password for the user.
     */
    public String getPassword() {
        return password;
    }
}
