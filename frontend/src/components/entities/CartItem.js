import { SmallPriceSpan } from "../text/SmallPriceSpan";
import { CartItemDetails } from "./CartItemDetails";
import {RemoveCartProductButton } from "../buttons/RemoveCartProductButton"
import "./CartItem.css"
import { FlexDummy } from "./FlexDummy";

/**
 * Component representing an item in the shopping cart.
 * 
 * @param {*} item the properties of the item
 * @returns {JSX.Element} a container with all its children
 */
export function CartItem(item) {
    return (
        <div className="cartItem">
            <CartItemDetails src={item.src} alt={item.alt} text={item.text} quantity={item.quantity} price={item.price}></CartItemDetails>
            <SmallPriceSpan text={item.price}></SmallPriceSpan>
            <RemoveCartProductButton id={item.id}></RemoveCartProductButton>
        </div>
    );
}