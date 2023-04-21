import { NavBar } from "./components/Navigation/NavBar";
import { Footer } from "./components/Footer/Footer";
import { BrowserRouter as Router } from "react-router-dom";
import { MainSection } from "./MainSection";

/**
 * Component representing the main page
 * @return {JSX.Element}
 * @constructor
 */
export function App() {
  return (
    <Router>
      <section>
        <NavBar />
        <MainSection />
        <Footer />
      </section>
    </Router>
  );
}
