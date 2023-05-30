import "../ProductPage/ProductPageOld.css";
import { ShowcaseCard } from "../../components/Showcase/ShowcaseCard";

/**
 * Test data for the product
 */
const jsonTestData = {
  id: "2",
  name: "Black Coffe",
  price: "122",
  description: "Brazilian coffee is sealed for freshness...",
};

const ProductPage = () => {
  return (
    <>
      <div className="product-section">
        <h2>Products</h2>
        <container className="product-container">
          <ShowcaseCard props={jsonTestData} />
          <ShowcaseCard props={jsonTestData} />
          <ShowcaseCard props={jsonTestData} />
          <ShowcaseCard props={jsonTestData} />
        </container>
      </div>
    </>
  );
};

export default ProductPage;
