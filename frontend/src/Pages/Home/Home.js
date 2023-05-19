import { HeroSection } from "../../components/HeroSection/HeroSection";
import { Product } from "../../components/Showcase/ShowcaseCard";
import { Carousel } from "../../components/Testimonials/Carousel";
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
