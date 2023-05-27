import "./ProductQuantityInput.css"
/**
 * Input field for the quantity for a spesific product.
 * 
 * @param props the quantity of products
 * @returns {JSX.Element} number input
 */
export function ProductQuantityInput(props) {
    return (
        <input type="number" name="quantity" min="1" className="productQuantityInput" value={props.value}></input>
    );
}