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
    console.log(cartItems)
    const [data, setData] = useState([]);

    // fetches data once the component is mounted
    useEffect(() => {
        fetchData();
    }, []);

    // fetches product data using swagger api
    const fetchData = async () => {
        try {
            const response = await axios.get('https://group10.web-tek.ninja:8080/products');
            setData(response.data);
        } catch (error) {
            console.error(error);
        }
    };

    // adds a random item to the cart
    const addItemToCart = () => {
        if (data.length > 0) {
            const sampleItem = data[Math.floor(Math.random() * data.length)];
            addToCart(sampleItem);
        }
    };

    return (
        <>
            {cartItems.length > 0 ? (
                cartItems.map((cartItem) => (
                    <CartItem
                        key={cartItem.id}
                        src={`data:image/png;base64,${cartItem.image.imageData}`}
                        alt={cartItem.image.alt}
                        text={cartItem.name}
                        price={(cartItem.price * cartItem.quantity) + ",-"}
                        quantity={cartItem.quantity}
                    />
                ))
            ) : (
                <span className="emptyCartSpan">Cart is empty</span>
            )}
            <button onClick={addItemToCart}>Add Sample Item to Cart</button>
        </>
    );
}