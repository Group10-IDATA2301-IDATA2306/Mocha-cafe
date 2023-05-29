import { useEffect, useState } from "react";
import "../ProductPage/ProductPage.css";
import { HttpInterface } from "../../api/HttpInterface";
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
  const [products, setProducts] = useState([]);
  const [page, setPage] = useState(1);
  const [selectedProduct, setSelectedProduct] = useState(null);

  useEffect(() => {
    fetchProducts();
  }, []);

  const fetchNextProducts = () => {
    setPage((prevPage) => prevPage + 1);
  };

  const fetchProducts = async () => {
    try {
      // Retrieve the array of products from the HTTP interface
      const response = await HttpInterface.getAllProducts();
      const productList = await response.json();

      // Set the retrieved products in the component's state
      setProducts(productList);
    } catch (error) {
      console.log("Error fetching products: ", error);
    }
  };

  const handleCardClick = (product) => {
    setSelectedProduct(product);
  };

  const handleClosePopup = () => {
    setSelectedProduct(null);
  };

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
