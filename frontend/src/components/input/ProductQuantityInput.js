import React, { useContext } from "react";
import { CartContext } from "../../context/CartContext";
import "./ProductQuantityInput.css";

/**
 * Input field for the quantity for a spesific product.
 * 
 * @param {Object} item - The item object containing the quantity.
 * @returns {JSX.Element} - Number input component.
 */
export function ProductQuantityInput(item) {
    return (
        <input
            type="number"
            name="quantity"
            min="1"
            className="productQuantityInput"
            defaultValue={item.quantity}
        />
    );
}