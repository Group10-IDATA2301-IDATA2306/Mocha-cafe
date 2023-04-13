import { NavBar } from "./Navigation/NavBar";
import { Footer } from "./Footer/Footer";
<<<<<<< HEAD
import { BrowserRouter as Router } from "react-router-dom";
import { MainSection } from "./MainSection";
=======
import { Carousel } from "./Testimonials/Carousel";
import { Product } from "./Products/Product";
import { ProductPage } from "./ProductPage/ProductPage";
>>>>>>> 4a461253c541bf9149ddeae34c41d129405f2d6a

/**
 * Component representing the main page
 * @return {JSX.Element}
 * @constructor
 */
export function App() {
  return (
    <Router>
      <section>
        <NavBar />
        <MainSection />
        <Footer />
      </section>
    </Router>
  );
}
