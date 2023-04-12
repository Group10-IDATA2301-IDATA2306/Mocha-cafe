import { HeroSection } from "../../HeroSection/HeroSection";
import { Product } from "../../Showcase/ShowcaseCard";
import { Carousel } from "../../Testimonials/Carousel";
import { Showcase } from "../../Showcase/ShowCase";
import "./Home.css";

export function Home() {
  return (
    <>
      <HeroSection />
      <Showcase />
      <Carousel />
    </>
  );
}
