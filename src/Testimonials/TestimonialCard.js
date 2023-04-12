import { Rating } from "./Rating";
import "./TestimonialCard.css";

/**
 * Creates a TestimonialCard component
 * @constructor
 * @returns {JSX.Element}
 */
export function TestimonialCard({ testimonialInfo }) {
  return (
    <item>
      <Rating />
      <p>{testimonialInfo.comment}</p>
      <container class="portrait-container">
        <img
          src={require("../assets/img/" + testimonialInfo.name + ".jpg")}
          alt="A customer"
        />
        <h3>{testimonialInfo.name}</h3>
      </container>
    </item>
  );
}
