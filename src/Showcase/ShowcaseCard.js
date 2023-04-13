import "./ShowcaseCard.css";

/**
 * A showcase of products
 *
 * @param props the properties of the product being showcased
 * @return {JSX.Element}
 * @constructor
 */
export function ShowcaseCard({ props }) {
  // const imageUrl = require(`${props.imageURL}`);
  const imageUrl = require(`../assets/img/Product 1.png`);

  return (
    <card>
      <img
        className="product-image"
        style={{
          backgroundImage: `url(${imageUrl})`,
        }}
      />
      <container class="card-info">
        <h4>{props.name}</h4>
        <h4>{props.price}</h4>
      </container>
      <overlay></overlay>
    </card>
  );
}
