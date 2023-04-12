import "./Showcase.css";
import { ShowcaseCard } from "./ShowcaseCard";
/**
 * A section of showcased products
 *
 * @return {JSX.Element}
 * @constructor
 */
export function ShowCase() {
  return (
    <container className="product-section">
      <ShowcaseCard />
      <ShowcaseCard />
      <ShowcaseCard />
    </container>
  );
}
