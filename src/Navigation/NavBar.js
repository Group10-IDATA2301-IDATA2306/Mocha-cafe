import { useState, useEffect } from "react";
import "./Navbar.css"
import { ActiveLink } from "./ActiveLink";

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
            <ActiveLink to="/">
                <h4>HOME</h4>
            </ActiveLink>
            <ActiveLink to="/products">
                <h4>PRODUCTS</h4>
            </ActiveLink>
            <ActiveLink to="/about">
                <h4>ABOUT US</h4>
            </ActiveLink>
            <ActiveLink to="/contact">
                <h4>CONTACT</h4>
            </ActiveLink>
            <container class="cart-container">
                <ActiveLink to="/cart">
                    <i class="fa fa-shopping-cart fa-5x" aria-hidden="true" id="cart-icon"></i>
                </ActiveLink>
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


