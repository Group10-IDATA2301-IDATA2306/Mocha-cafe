
import "./Navbar.css"

/**
 * A collection of links to navigate the webpage
 * 
 * @return {JSX.Element}
 * @constructor
 */
export function NavBar(){

    return( 
    <nav>
    <logo class="fa fa-coffee fa-5x" aria-hidden="true"></logo>
    <h3>HOME</h3>
    <h3>PRODUCTS</h3>
    <h3>ABOUT US</h3>
    <h3>CONTACT</h3>
    </nav>
    );
}


