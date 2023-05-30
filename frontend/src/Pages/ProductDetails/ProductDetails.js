import { useParams } from "react-router-dom";

export function ProductDetails() {
  const { id } = useParams();

  // Use the product ID to fetch the product details or access it from the props
  // You can fetch the product details using an API call or from a local data source

  return (
    <div>
      {/* Render the product details */}
    </div>
  );
}
