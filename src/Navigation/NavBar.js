
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
        <i class="fa fa-coffee fa-5x" aria-hidden="true" id="logo"></i>
        <page>
            <h4>HOME</h4>
            <h4>PRODUCTS</h4>
            <h4>ABOUT US</h4>
            <h4>CONTACT</h4>
        </page>
        <i class="fa fa-shopping-cart fa-5x" aria-hidden="true" id="cart"></i>
    </nav>
    );
}


