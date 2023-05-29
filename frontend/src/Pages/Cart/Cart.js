import React, { useEffect, useState } from "react";
import productImg1 from "../../assets/img/Product 1.png"
import productImg2 from "../../assets/img/Product 2.png"
import { CartItem } from "../../components/entities/CartItem"
import { CartSection } from './CartSection';
import { CartForm } from '../../components/forms/CartForm';
import './Cart.css';
import { CartSectionOnlyItems } from "./CartSectionOnlyItems";
import { CartSectionFee } from "./CartSectionFee";

export function Cart() {
    const feeDescription = "Extra fees might be added to the total due to differences in the shipping locations. The total"
        + "fee will be calculated at the next step."
    const totalFee = "Total: NOK 350,-"

    return (
        <div className="cartPage">
            <CartSectionOnlyItems>
                <CartItem src={productImg1} alt="Brazilian coffee" text="Brazilian coffee" price="NOK 80,-" value="1"></CartItem>
                <CartItem src={productImg2} alt="Green tea" text="Green tea" price="NOK 70,-" value="2"></CartItem>
            </CartSectionOnlyItems>
            <CartForm></CartForm>
            <CartSection priceDetails={feeDescription} totalFee={totalFee}>
                <CartItem src={productImg1} alt="Brazilian coffee" text="Brazilian coffee" price="NOK 80,-" value="1"></CartItem>
                <CartItem src={productImg2} alt="Green tea" text="Green tea" price="NOK 70,-" value="2"></CartItem>
            </CartSection>
            <CartSectionFee priceDetails={feeDescription} totalFee={totalFee}></CartSectionFee>
        </div>
    );
}