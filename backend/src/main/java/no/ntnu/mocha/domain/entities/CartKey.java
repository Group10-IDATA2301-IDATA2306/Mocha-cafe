package no.ntnu.mocha.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * This class serves as a composite primary key
 * for realtions between users and products.
 * 
 * @version 16.04.2023
 * 
 */
@Embeddable
public class CartKey implements Serializable {

    @Column(name = "user_id")
    public Long user_id;
    @Column(name = "product_id")
    public Long product_id;

    public Long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getProduct_id() {
        return this.product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

}
