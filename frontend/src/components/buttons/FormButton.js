import { useContext } from "react";
import "./FormButton.css"
import { CartContext } from "../../context/CartContext";

/**
 * A button for forms.
 * 
 * @param {*} props text to be displayed on button
 * @returns {JSX.Element} a button with the desired text
 */
export function FormButton(props) {
    const { cartItems } = useContext(CartContext);

    const submit = () => {
        const submitList = cartItems.map((item) => {
            return {
                productId: item.id,
                amount: item.quantity,
            };
        });
        console.log("success");
    }

    return (
        <button className="formButton"
            id={props.id}
            onClick={submit}
        >{props.text}</button>
    );
}