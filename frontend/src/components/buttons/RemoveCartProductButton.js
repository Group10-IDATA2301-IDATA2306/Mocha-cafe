import React, { useContext } from "react";
import { CartContext } from "../../context/CartContext";
import "./RemoveCartProductButton.css"
/**
 * A button that removes a product from a shopping cart.
 * 
 * @returns {JSX.Element} button removing cart product
 */
export function RemoveCartProductButton(item) {
    const { removeFromCart } = useContext(CartContext);

    /**
     * Function for removing item from the cart.
     */
    const handleRemoveFromCart = () => {
        removeFromCart(item);
    };

    return (
        <button
            className="removeCartProductButton"
            onClick={handleRemoveFromCart}>
            X
        </button>
    );
}