import { HeroSection } from "../../HeroSection/HeroSection";
import { Product } from "../../Showcase/ShowcaseCard";
import { Carousel } from "../../Testimonials/Carousel";
import "./Home.css";

export function Home() {
  return (
    <>
      <HeroSection />
      <Product />
      <Carousel />
    </>
  );
}
