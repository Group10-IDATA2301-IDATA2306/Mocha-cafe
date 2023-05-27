package no.ntnu.mocha.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, name = "user_id")
    private Long id;

    /** The username of the User. */
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    /** The password of the User */
    @Column(name = "password")
    private String password;

    /** The email of the User */
    @Column(name = "email")
    private String email;

    @Column(name = "bio")
    private String bio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role", referencedColumnName = "role_id")
    private Role role;


    /**
     * Empty constructor.
     */
    public User(){}

    /**
     * Creates an instance of User with username and password.
     * 
     * @param username  The username of the User.
     * @param password  The pasword of the User.
     */
    public User(String username, String password, Role role) {
        super();
        this.username = username;
        this.password = password;
        this.role = role;
    }



    /**
     * Returns the User Id for the User.
     * 
     * @return the User Id for the User.
     */
    public long getId(){
        return id;
    }

    /**
     * Sets the User id {@code id} for the User.
     * 
     * @param id the user id for the User.
     */
    public void setUid(long id) {
        this.id = id;
    }

    /**
     * Get the username of the user.
     * 
     * @return user's username.
     */
    public String getUserName(){
        return username;
    }

    /**
     * Set the username of the user.
     * 
     * @param username the new username.
     */
    public void setUserName(String username) {
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

    public boolean isActive() {
        return false;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
