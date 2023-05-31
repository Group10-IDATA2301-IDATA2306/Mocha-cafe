import React, { useState, useContext, useEffect } from "react";
import axios from "axios";
import { CartContext } from "../../context/CartContext";
import { ContactInformationForm } from "./ContactInformationForm"
import { ShippingAddressForm } from "./ShippingAddressForm";
import { FormButton } from "../buttons/FormButton";
import { PageHeader } from "../text/PageHeader"
import { RightButtonLayout } from "../layout/RightButtonLayout";
import "./CartForm.css"

/**
 * A form component for the checkout page.
 * 
 * @returns {JSX.Element} a section element with all its children
 */
export function CartForm() {
    const { addToCart, cartItems } = useContext(CartContext);
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

    // Adds a random item to the cart
    const addRandomItemToCart = () => {
        const randomItem = data[Math.floor(Math.random() * data.length)];
        addToCart(randomItem);
        console.log(cartItems)
    };

    return (
        <section className="cartForm">
            <PageHeader text="Checkout"></PageHeader>
            <ContactInformationForm></ContactInformationForm>
            <ShippingAddressForm></ShippingAddressForm>
            <RightButtonLayout>
                <FormButton text="Continue to payment" id="bigScreenProceedCheckoutBtn"></FormButton>
            </RightButtonLayout>
        </section>
    );
}