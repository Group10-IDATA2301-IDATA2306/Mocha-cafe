import ProductCard from "../../components/products/ProductCard/ProductCard";
import HeaderProduct from "../../components/products/sideFilterProducts/HeaderProduct";
import { useEffect } from "react";
import Grid from "@mui/material/Grid";
import Button from "@mui/material/Button";
import { useSelector, useDispatch } from "react-redux";

const ProductPage = () => {
  return (
    <>
      <HeaderProduct />
      <ProductCard />
    </>
  );
};

export default ProductPage;
