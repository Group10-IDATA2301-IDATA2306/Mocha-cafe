import "./ShowcaseCard.css";

/**
 * A showcase of products
 *
 * @param productInfo the properties of the product being showcased
 * @return {JSX.Element}
 * @constructor
 */
export function ShowcaseCard({ productInfo }) {
  return (
    <container className="product-section">
      <h2>New Releases</h2>
      <container className="product-container">
        <card>
          <img src={require("../assets/img/" + productInfo.id + ".png")} />
          <container class="card-info">
            <h4>{productInfo.name}</h4>
            <h4>{productInfo.price}</h4>
          </container>
          <overlay></overlay>
        </card>
      </container>
    </container>
  );
}
