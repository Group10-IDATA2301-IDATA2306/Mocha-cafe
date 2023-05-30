import React, { useEffect, useState } from "react";
import axios from "axios";
import productImg1 from "../../assets/img/Product 1.png"
import productImg2 from "../../assets/img/Product 2.png"
import { CartItem } from "../../components/entities/CartItem"
import { CartSection } from './CartSection';
import { CartForm } from '../../components/forms/CartForm';
import './Cart.css';
import { CartSectionOnlyItems } from "./CartSectionOnlyItems";
import { CartSectionFee } from "./CartSectionFee";

/**
 * A react component responsible for displaying the shopping cart to the user.
 * 
 * @returns {JSX.Element} div element with its children
 */
export function Cart() {
    const feeDescription = "Extra fees might be added to the total due to differences in the shipping locations. The total"
        + "fee will be calculated at the next step."
    const totalFee = "Total: NOK 350,-"

    return (
        <div className="cartPage">
            <CartSectionOnlyItems>
            </CartSectionOnlyItems>
            <CartForm></CartForm>
            <CartSection priceDetails={feeDescription} totalFee={totalFee}>
            </CartSection>
            <CartSectionFee priceDetails={feeDescription} totalFee={totalFee}></CartSectionFee>
        </div>
    );
}