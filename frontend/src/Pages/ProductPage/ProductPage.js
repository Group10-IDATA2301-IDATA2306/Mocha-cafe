import ProductCard from "../../components/products/ProductCard/ProductCard";
import { useEffect, useState } from "react";
import Grid from "@mui/material/Grid";
import Button from "@mui/material/Button";
import "../ProductPage/ProductPage.css";
import { HttpInterface } from "../../api/HttpInterface";

const ProductPage = () => {
  const [products, setProducts] = useState([]);
  const [page, setPage] = useState(1);

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

  return (
    <>
      <Grid container spacing={2} className="article_card">
        {products && products.length > 0 ? (
          products.map((item) => (
            <Grid key={item._id} item xs={12} sm={6} lg={3}>
              <ProductCard product={item} />
            </Grid>
          ))
        ) : (
          <p>No products found</p>
        )}
      </Grid>
      <hr />
      <Button variant="outlined" onClick={fetchNextProducts}>
        Load More
      </Button>
    </>
  );
};

export default ProductPage;
