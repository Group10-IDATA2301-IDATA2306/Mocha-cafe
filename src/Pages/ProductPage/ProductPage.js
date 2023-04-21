import { useEffect, useState } from "react";
import "./ProductPage.css";

/**
 * Represents product page.
 *
 * @param props Properties containing the products.
 * @return {JSX.Element}
 * @constructor
 */
export function ProductPage() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    //fetchProducts();
  }, []);

  const fetchProduct = () => {
    // Read the token from the session
  };

  return (
    <div>
      <h2>Choose your favorite coffee:</h2>
      <div className="product-grid">
        <div className="product-card">
          <div className="product-image">
            <img
              src={process.env.PUBLIC_URL + "/img/Product 3.png"}
              alt="Colombian Dark Roast"
            />
          </div>
          <h3>Colombian Dark Roast</h3>
          <p>
            Our Colombian Dark Roast coffee is a bold and full-bodied roast...
          </p>
          <button>Add to Cart</button>
        </div>
        <div className="product-card">
          <div className="product-image">
            <img
              src={process.env.PUBLIC_URL + "/img/Product 2.png"}
              alt="French Vanilla"
            />
          </div>
          <h3>French Vanilla</h3>
          <p>
            Indulge in the rich and creamy flavor of our French Vanilla
            coffee...
          </p>
          <button>Add to Cart</button>
        </div>
        <div className="product-card">
          <div className="product-image">
            <img
              src={process.env.PUBLIC_URL + "/img/Product 1.png"}
              alt="Hazelnut"
            />
          </div>
          <h3>Hazelnut</h3>
          <p>
            Experience the nutty and delicious flavor of our Hazelnut coffee...
          </p>
          <button>Add to Cart</button>
        </div>
      </div>
    </div>
  );
}
