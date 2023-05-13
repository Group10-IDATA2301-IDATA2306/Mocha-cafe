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
          <h3>{props.name}</h3>
        </container>
        <p>{props.description}</p>
        <h4>{props.price}kr</h4>
      </container>
    </card>
  );
}
