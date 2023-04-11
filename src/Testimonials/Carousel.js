import "./Carousel.css";
import { TestimonialCard } from "./TestimonialCard";
import testimonails from "../assets/testimonials.json";

/**
 * Creates a Carousel component
 * @constructor
 * @returns {JSX.Element}
 */
export function Carousel() {
  return (
    <container class="testimonial-section">
      <h2>What our customers say</h2>
      <carousel>
        <TestimonialCard props={testimonails[0]} />
        <TestimonialCard props={testimonails[3]} />
        <TestimonialCard props={testimonails[2]} />
      </carousel>
    </container>
  );
}
