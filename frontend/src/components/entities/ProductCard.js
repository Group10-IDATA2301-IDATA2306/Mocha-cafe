import { Link } from "react-router-dom";
import { ProductCardImage } from "../img/ProductCardImage";
import "./ProductCard.css";

/**
 * Component representing a product card.
 * 
 * @param {*} props the properties of the product card
 * @returns {JSX.Element} div element
 */
export function ProductCard({ product }) {
    return (
        <div className="productCard">
            <Link to={`/productdetails/${product.id}`} className="productCardLink">
                <ProductCardImage src={`data:image/png;base64,${product.image.imageData}`} alt={product.image.alt}></ProductCardImage>
                {product.name}
            </Link>
        </div>
    );
};