import { HeroSection } from "../../HeroSection/HeroSection";
import { Carousel } from "../../Testimonials/Carousel";
import { Showcase } from "../../Showcase/Showcase";
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
