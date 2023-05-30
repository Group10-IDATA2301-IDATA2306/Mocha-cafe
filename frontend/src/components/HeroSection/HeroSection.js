import "./HeroSection.css";

/**
 * Component representing the Hero section of the homepage
 * @return {JSX.Element}
 * @constructor
 */
export function HeroSection() {
  return (
    <hero-section>
      <content>
        <main-title>Try our new exciting flavors</main-title>
        <button className="hero-section-button">Find out more</button>
      </content>
    </hero-section>
  );
}
