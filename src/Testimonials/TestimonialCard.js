import { Rating } from "./Rating";
import "./TestimonialCard.css";

/**
 * Creates a TestimonialCard component
 * @constructor
 * @returns {JSX.Element}
 */
export function TestimonialCard({ props }) {
  return (
    <item>
      <Rating />
      <p>{props.comment}</p>
      <container class="portrait-container">
        <img
          src={require("../assets/img/" + props.name + ".jpg")}
          alt="A customer"
        />
        <h3>{props.name}</h3>
      </container>
    </item>
  );
}
