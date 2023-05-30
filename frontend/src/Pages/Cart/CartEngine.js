import React, { useContext, useEffect, useState } from "react";
import axios from "axios";
import { CartItem } from "../../components/entities/CartItem"
import { CartContext, CartProvider } from "../../context/CartContext";
import "./CartEngine.css"

/**
 * The CartEngine is reponsible for getting all cart items and displaying them in HTML format.
 * 
 * @returns {JSX.Element} components representing cart items
 */
export function CartEngine() {
    const { cartItems, addToCart } = useContext(CartContext);
    const [items, setItems] = useState([]);

    useEffect(() => {
        setItems(cartItems);
    }, [cartItems]);

    return (
        <>
            {items.length > 0 ? (
                items.map((cartItem) => (
                    <CartItem
                        key={cartItem.id}
                        src={`data:image/png;base64,${cartItem.image.imageData}`}
                        alt={cartItem.image.alt}
                        text={cartItem.name}
                        price={(cartItem.price * cartItem.quantity) + ",-"}
                        quantity={cartItem.quantity}
                        item={cartItem}
                    />
                ))
            ) : (
                <span className="emptyCartSpan">Cart is empty</span>
            )}
        </>
    );
}