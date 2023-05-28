import { SmallProductImage } from "../SmallProductImage";
import { CartItemTitleAndQuantity } from "./CartItemTitleAndQuantity";
import "./CartItemDetails.css"

/**
 * A container with cart product image, title and quantity.
 * 
 * @param {*} props image src, title text and quantity initial value
 * @returns {JSX.Element} div with children
 */
export function CartItemDetails(props) {
    return (
        <div className="cartItemDetails">
            <SmallProductImage src={props.src} alt={props.alt}></SmallProductImage>
            <CartItemTitleAndQuantity text={props.text} value={props.value}></CartItemTitleAndQuantity>
        </div>
    );
}