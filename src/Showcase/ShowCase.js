import "./Showcase.css";
import { ShowcaseCard } from "./ShowcaseCard";

const jsonTestData = {
  id: "Product 1",
  name: "jsonTestData",
  price: "122",
  imageURL: "../assets/img/Product 1.png",
};

/**
 * A section of showcased products
 *
 * @return {JSX.Element}
 * @constructor
 */
export function Showcase() {
  return (
    <container className="product-section">
      <h2>New Releases</h2>
      <container className="product-container">
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
      </container>
    </container>
  );
}
