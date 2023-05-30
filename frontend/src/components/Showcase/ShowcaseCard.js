import "./ShowcaseCard.css";
import * as React from "react";
import Button from "@mui/material/Button";

/**
 * A showcase of products
 *
 * @param props the properties of the product being showcased
 * @return {JSX.Element}
 * @constructor
 */
export function ShowcaseCard({ props }) {
  return (
    <div className="card-container">
      <img
        className="product-image"
        src={require("../../assets/img/" + props.id + ".png")}
        alt="product"
      />
      <div className="card-overlay"></div>
      <div className="card-info">
        <div class="card-stats">
          <h3>{props.name}</h3>
        </div>
        <p>{props.description}</p>
        <h4>{props.price}kr</h4>
        <div className="button-container">
          <Button variant="contained">View Product</Button>
        </div>
      </div>
    </div>
  );
}
