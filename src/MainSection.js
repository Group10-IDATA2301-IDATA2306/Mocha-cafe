import { Route, Routes } from "react-router-dom";
import { Home } from "./Pages/Home/Home";
import { Products } from "./Pages/Products/Products";
import { About } from "./Pages/About/About";
import { Contact } from "./Pages/Contact/Contact";
import { Cart } from "./Pages/Cart/Cart";
import { ProductPage } from "./Pages/ProductPage/ProductPage";
import "./MainSection.css";

/**
 * Represents the main content of the page
 * @returns {JSX.Element}
 */
export function MainSection() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/products" element={<ProductPage />} />
      <Route path="/about" element={<About />} />
      <Route path="/contact" element={<Contact />} />
      <Route path="/cart" element={<Cart />} />
    </Routes>
  );
}
