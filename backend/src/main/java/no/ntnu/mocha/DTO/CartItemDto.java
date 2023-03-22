package no.ntnu.mocha.DTO;

/**
 * <h1>Cart Item DTO (Data Transfer Object)</h1>
 * 
 * <p>Representing an Data Transfer Object class for
 * Cart Item so that we can share either required data
 * or complete data from the source.</p>
 * 
 * @version 22.03.2023
 * @since   22.03.2023
 */
public class CartItemDto {
    
    /** The id of the product of this cart item dto. */
    private final Long productId;

    /** The quantity of the product in this cart item dto. */
    private final Integer quantity;

    /**
     * Creates an instance of the product in this cart item dto.
     * 
     * @param productId the id of the product of this cart item dto.
     * @param quantity  the quantity of the product in this cart item dto.
     */
    public CartItemDto(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    /**
     * Returns the id of the product in this cart item dto.
     * 
     * @return the id of the product in this cart item dto.
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Returns the quantity of the product in this cart item dto.
     * 
     * @return the quantity of the product in this cart item dto.
     */
    public Integer getQuantity() {
        return quantity;
    }
}
