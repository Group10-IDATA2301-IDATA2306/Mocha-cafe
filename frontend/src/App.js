import { NavBar } from "./components/Navigation/NavBar";
import { Footer } from "./components/Footer/Footer";
import { BrowserRouter as Router } from "react-router-dom";
import { MainSection } from "./MainSection";
import { useState } from "react";
import { useEffect } from "react";
import { asyncApiRequest } from "./api/HttpInterface";

/**
 * Component representing the main page
 * @return {JSX.Element}
 * @constructor
 */
export function App() {
  const [user, setUser] = useState(null);
  const [products, setProducts] = useState([]);
  const [productsLoaded, setProductsLoaded] = useState(false);

  useEffect(loadProducts);

  function loadProducts() {
    if (products.length === 0 && !productsLoaded) {
      setProductsLoaded(true);
      console.log("Loading products...");
      asyncApiRequest("GET", "/products").then(function (loadProducts) {
        console.log("Products received");
        setProducts(loadProducts);
      });
    }
  }

  return (
    <Router>
      <section>
        <NavBar />
        <MainSection user={user} products={products} setUser={setUser} />
        <Footer />
      </section>
    </Router>
  );
}
