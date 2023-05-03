import "./ShowcaseCard.css";

/**
 * A showcase of products
 *
 * @param props the properties of the product being showcased
 * @return {JSX.Element}
 * @constructor
 */
export function ShowcaseCard({ props }) {
  return (
    <card>
      <img
        className="product-image"
        src={require("../assets/img/" + props.id + ".png")}
        alt="product"
      />
      <overlay></overlay>
      <container className="card-info">
        <container class="card-stats">
          <h4>{props.name}</h4>
          <h4>{props.price}kr</h4>
        </container>
        <p>{props.description}</p>
      </container>
    </card>
  );
}
