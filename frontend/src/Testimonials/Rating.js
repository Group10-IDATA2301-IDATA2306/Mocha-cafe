import "./Rating.css";

/**
 * Creates a Rating component
 * @constructor
 * @returns {JSX.Element}
 */
export function Rating() {
  return (
    <container class="rating">
      <i class="fa fa-star fa-5x" aria-hidden="true"></i>
      <i class="fa fa-star fa-5x" aria-hidden="true"></i>
      <i class="fa fa-star fa-5x" aria-hidden="true"></i>
      <i class="fa fa-star fa-5x" aria-hidden="true"></i>
      <i class="fa fa-star fa-5x" aria-hidden="true"></i>
    </container>
  );
}
