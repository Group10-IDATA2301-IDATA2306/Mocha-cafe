package no.ntnu.mocha.domain.entities;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

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
    private long id;

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

    private Set<Role> roles = new LinkedHashSet<>();

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
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Creates an instance of User.
     * 
     * @param username      Username of the user
     * @param password      Password of the User (e.g. "123Spill")
     * @param email         Email of the User (e.g. "morten@gmail.com")
     */
    public User(String username, String password, String email) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    
    public Set<Role> getRoles() {
        return roles;
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

        /**
     * Add a role to the user
     *
     * @param role Role to add
     */
    public void addRole(Role role) {
        roles.add(role);
    }

    /**
     * Check if this user is an admin
     *
     * @return True if the user has admin role, false otherwise
     */
    public boolean isAdmin() {
        return this.hasRole("ROLE_ADMIN");
    }

    /**
     * Check if the user has a specified role
     *
     * @param roleName Name of the role
     * @return True if hte user has the role, false otherwise.
     */
    public boolean hasRole(String roleName) {
        boolean found = false;
        Iterator<Role> it = roles.iterator();
        while (!found && it.hasNext()) {
        Role role = it.next();
        if (role.getName().equals(roleName)) {
            found = true;
        }
        }
        return found;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
