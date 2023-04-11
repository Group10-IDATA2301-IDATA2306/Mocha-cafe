import "./Product.css";

/**
 * A collection of products
 *
 * @return {JSX.Element}
 * @constructor
 */
export function Product() {
  return (
    <container className="product-section">
      <h2>New Releases</h2>

      <container className="product-container">
        <card id="product1">
          <container class="card-info">
            <h4>Black coffe</h4>
            <h4>229kr</h4>
          </container>
          <overlay></overlay>
        </card>

        <card id="product2">
          <container class="card-info">
            <h4>Brazillian coffe</h4>
            <h4>99kr</h4>
          </container>
          <overlay></overlay>
        </card>

        <card id="product3">
          <container class="card-info">
            <h4>Black coffe</h4>
            <h4>229kr</h4>
          </container>
          <overlay></overlay>
        </card>
      </container>
    </container>
  );
}
