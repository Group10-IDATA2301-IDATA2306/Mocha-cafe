import { useState, useEffect } from "react";
import "./Navbar.css"

/**
 * A collection of links to navigate the webpage
 * 
 * @return {JSX.Element}
 * @constructor
 */

export function NavBar(){
    
    const [itemsInCart,setNumberOfItemsInCart] = useState(2);

    useEffect(loadItemsInCart);

    return( 
    <nav>
        <logo class="fa fa-coffee fa-5x" aria-hidden="true" id="logo"></logo>
        <h4>HOME</h4>
        <h4>PRODUCTS</h4>
        <h4>ABOUT US</h4>
        <h4>CONTACT</h4>
        <container class="cart-container">
            <i class="fa fa-shopping-cart fa-5x" aria-hidden="true" id="cart-icon"></i>
            <counter>{itemsInCart}</counter>
        </container>
    </nav>
    );


    /**
     * 
     */
    function loadItemsInCart(){

        // Send request to API for the number of items in the users cart
        // E.g queryCartItems().length

        // Dummy number to showcase functionality
        var numberOfItems = 1;

        setNumberOfItemsInCart(numberOfItems)
    }

}


