import React, { createContext, useState } from "react";

// creates a new context
export const CartContext = createContext();

/**
 * A context for manipulating the shopping cart of a user.
 * 
 * @param children the children of the context
 * @returns the cart context with its children
 */
export const CartProvider = ({ children }) => {
    const [cartItems, setCartItems] = useState([]);

    /**
     * Adds an item to the cart.
     * 
     * @param {Object} item item to add
     */
    const addToCart = (item) => {
        const existingItem = cartItems.find((i) => i.id === item.id);
        if (existingItem) {
            setCartItems((prevItems) =>
                prevItems.map((i) =>
                    i.id === item.id ? { ...i, quantity: i.quantity + 1 } : i
                )
            );
        } else {
            setCartItems((prevItems) => [...prevItems, { ...item, quantity: 1 }]);
        }
    };
 
    /**
     * Removes an item from the cart.
     * 
     * @param {Object} item item to remove
     */
    const removeFromCart = (item) => {
        setCartItems((prevItems) => prevItems.filter((i) => i.id !== item.id));
    };

    /**
     * Clears the cart of all items.
     */
    const clearCart = () => {
        setCartItems([]);
    };

    return (
        <CartContext.Provider value={{ cartItems, addToCart, removeFromCart, clearCart }}>
            {children}
        </CartContext.Provider>
    );
};