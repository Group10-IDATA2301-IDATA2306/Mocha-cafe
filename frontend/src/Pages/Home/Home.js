import { HeroSection } from "../../components/HeroSection/HeroSection";
import { Showcase } from "../../components/Showcase/Showcase";
import { Carousel } from "../../components/Testimonials/Carousel";
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
