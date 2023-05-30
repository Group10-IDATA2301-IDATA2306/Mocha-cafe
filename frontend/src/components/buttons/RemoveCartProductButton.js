import React, { useContext } from "react";
import "./RemoveCartProductButton.css"
/**
 * A button that removes a product from a shopping cart.
 * 
 * @returns {JSX.Element} button removing cart product
 */
export function RemoveCartProductButton(item) {
    return (
        <button className="removeCartProductButton">
            X
        </button>
    );
}