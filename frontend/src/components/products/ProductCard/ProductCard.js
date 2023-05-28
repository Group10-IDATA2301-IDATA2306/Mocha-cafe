import { Link as RouterLink } from "react-router-dom";
import {
  Card,
  CardMedia,
  CardContent,
  CardActions,
  IconButton,
  Typography,
  Button,
} from "@mui/material";
import FavoriteIcon from "@mui/icons-material/Favorite";

const ProductCard = (product) => {
  return (
    <Card>
      <CardMedia
        style={{ height: 0, paddingTop: "56.25%" }}
        src={require("../../../assets/img/2.png").default}
        title={product.name}
      />
      <CardContent>
        <Typography gutterBottom variant="h5" component="h2">
          {product.name}
        </Typography>
        <Typography variant="body2" component="p"></Typography>
      </CardContent>
      <CardActions disableSpacing>
        <IconButton>
          <FavoriteIcon />
        </IconButton>
        <Button
          size="small"
          color="primary"
          component={RouterLink}
          to={`/product/product/${product._id}`}
        >
          View product
        </Button>
      </CardActions>
    </Card>
  );
};

export default ProductCard;
