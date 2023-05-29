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

    const [data, setData] = useState([]);

    // fetches data once the component is mounted
    useEffect(() => {
        fetchData();
    }, []);

    /**
     * Fetches product data using swagger api
     */
    const fetchData = async () => {
        try {
            const response = await axios.get('https://group10.web-tek.ninja:8080/products');
            setData(response.data);
        } catch (error) {
            console.error(error);
        }
    };

    // logging the data retrieved for development purposes
    console.log(data);

    return (
        <div className="cartPage">
            <CartSectionOnlyItems>
                {data.map((item) => (
                    <CartItem key={item.id} src={`data:image/png;base64,${item.image.imageData}`} alt={item.image.alt} text={item.name} price={item.price} value="1"></CartItem>
                ))}
                <CartItem src={productImg1} alt="Brazilian coffee" text="Brazilian coffee" price="NOK 80,-" value="1"></CartItem>
                <CartItem src={productImg2} alt="Green tea" text="Green tea" price="NOK 70,-" value="2"></CartItem>
            </CartSectionOnlyItems>
            <CartForm></CartForm>
            <CartSection priceDetails={feeDescription} totalFee={totalFee}>
                {data.map((item) => (
                    <CartItem key={item.id} src={`data:image/png;base64,${item.image.imageData}`} alt={item.image.alt} text={item.name} price={item.price} value="1"></CartItem>
                ))}
                <CartItem src={productImg1} alt="Brazilian coffee" text="Brazilian coffee" price="NOK 80,-" value="1"></CartItem>
                <CartItem src={productImg2} alt="Green tea" text="Green tea" price="NOK 70,-" value="2"></CartItem>
            </CartSection>
            <CartSectionFee priceDetails={feeDescription} totalFee={totalFee}></CartSectionFee>
        </div>
    );
}