import { SmallDescription } from "../text/SmallDescription";
import { TotalFee } from "../text/TotalFee";
import { CartItemsWrapper } from "./CartItemsWrapper";
import "./CartSection.css"
import { HFlexContainer } from "./HFlexContainer";

/**
 * Section for showing shopping cart items and addional fees, as well as the total fee.
 * The props.children is used for adding items to the cart.
 * The props.priceDetails is used for adding a descriptive text about additional fees.
 * The props.totalFee is used for displaying the total fee of the cart.
 * 
 * @param {*} props all the properties of the cart
 * @returns {JSX.Element} section for shopping cart and price details
 */
export function CartSection(props) {
    return (
        <section className="cartSection">
            <CartItemsWrapper>{props.children}</CartItemsWrapper>
            <SmallDescription text={props.priceDetails}></SmallDescription>
            <TotalFee text={props.totalFee}></TotalFee>
        </section>
    );
}