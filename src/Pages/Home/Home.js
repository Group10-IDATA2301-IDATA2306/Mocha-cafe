import { HeroSection } from "../../Hero/HeroSection";
import { Product } from "../../Products/Product";
import { Carousel } from "../../Testimonials/Carousel";
import './Home.css';

export function Home() {
    return (
        <>
            <HeroSection/>
            <Product/>
            <Carousel/>
        </>
    );
}