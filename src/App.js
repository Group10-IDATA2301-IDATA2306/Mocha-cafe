import { HeroSection } from "./Main/HeroSection";
import { NavBar } from "./Navigation/NavBar";
import { Footer } from "./Footer/Footer";
import { Carousel } from "./Testimonials/Carousel";
import { Product } from "./Products/Product";

/**
 * Component representing the main page
 * @return {JSX.Element}
 * @constructor
 */
export function App() {
  return (
    <>
      <NavBar />
      <HeroSection />
      <Product />
      <Carousel />
      <Footer />
    </>
  );
}
