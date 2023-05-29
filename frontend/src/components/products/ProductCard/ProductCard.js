import { Link as RouterLink } from "react-router-dom";
import * as React from "react";
import Card from "@mui/material/Card";
import CardActions from "@mui/material/CardActions";
import CardContent from "@mui/material/CardContent";
import CardMedia from "@mui/material/CardMedia";
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import "../../../Pages/ProductPage/ProductPage.css";

const ProductCard = (product) => {
  return (
    <Card sx={{ maxWidth: 345 }} className="productCard">
      <CardMedia
        sx={{ height: 300 }}
        image={product.image}
        title={product.name}
      />
      <CardContent>
        <Typography gutterBottom variant="h5" component="div">
          {product.name}
        </Typography>
        <Typography variant="body2" color="text.secondary">
          {product.description}
        </Typography>
        <Typography variant="body2" color="text.secondary">
          Price: {product.price}
        </Typography>
      </CardContent>
      <CardActions>
        <Button
          size="small"
          color="primary"
          component={RouterLink}
          to={`/products/product/${product._id}`}
        >
          Buy
        </Button>
      </CardActions>
    </Card>
  );
};

export default ProductCard;
