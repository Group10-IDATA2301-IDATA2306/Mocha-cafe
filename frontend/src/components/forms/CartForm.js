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

    return (
        <section className="cartForm">
            <PageHeader text="Checkout"></PageHeader>
            <ContactInformationForm></ContactInformationForm>
            <ShippingAddressForm></ShippingAddressForm>
            <RightButtonLayout>
                <FormButton text="Submit" id="bigScreenProceedCheckoutBtn"></FormButton>
            </RightButtonLayout>
        </section>
    );
}