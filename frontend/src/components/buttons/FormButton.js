import { useContext } from "react";
import axios from "axios";
import "./FormButton.css"
import { CartContext } from "../../context/CartContext";
import { HttpInterface } from "../../api/HttpInterface";

/**
 * A button for forms.
 * 
 * @param {*} props text to be displayed on button
 * @returns {JSX.Element} a button with the desired text
 */
export function FormButton(props) {
    const { cartItems } = useContext(CartContext);

    const submit = async () => {
        const submitList = cartItems.map((item) => {
            return {
                productId: item.id,
                amount: item.quantity,
            };
        });
        console.log(submitList);
        HttpInterface.submitOrder(1, submitList);
    }

    return (
        <button className="formButton"
            id={props.id}
            onClick={submit}
        >{props.text}</button>
    );
}