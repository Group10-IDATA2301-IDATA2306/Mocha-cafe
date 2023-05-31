import "./UnderConstruction.css";

/**
 * A component that previews a given location on Google maps
 *
 * @return {JSX.Element}
 * @constructor
 */
export function UnderConstruction() {
  return (
    <section className="under-construction-section">
      <article className="info-box">
        <h2>Page under construction!</h2>
        <i class="fa fa-cogs" aria-hidden="true"></i>
      </article>
    </section>
  );
}
