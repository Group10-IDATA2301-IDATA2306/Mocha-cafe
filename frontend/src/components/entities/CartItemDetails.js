import { SmallProductImage } from "../SmallProductImage";
import { SmallProductTitle } from "../text/SmallProductTitle"
import { ProductQuantityInput } from "../input/ProductQuantityInput"
import "./CartItemDetails.css"

/**
 * A container with cart product image, title and quantity.
 * 
 * @param {*} item image src, title text and quantity initial value
 * @returns {JSX.Element} div with children
 */
export function CartItemDetails(item) {
    return (
        <div className="cartItemDetails">
            <SmallProductImage src={item.src} alt={item.alt}></SmallProductImage>
            <SmallProductTitle text={item.text}></SmallProductTitle>
            <ProductQuantityInput quantity={item.quantity}></ProductQuantityInput>
        </div>
    );
}