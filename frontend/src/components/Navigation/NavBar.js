import { useState, useEffect } from "react";
import "./Navbar.css";
import { ActiveLink } from "./ActiveLink";
import { useNavigate } from "react-router-dom";

/**
 * A collection of links to navigate the webpage.
 *
 * @return {JSX.Element}
 * @constructor
 */
export function NavBar() {
  const [itemsInCart, setNumberOfItemsInCart] = useState(2);
  const navigate = useNavigate();

  useEffect(loadItemsInCart);

  // Check if the user is logged in
  const isLoggedIn = true; // Replace this with your logic to determine if the user is logged in

  // Render the user icon and its associated link based on login status
  const renderUserIcon = isLoggedIn ? (
    <ActiveLink to="/logout">
      <i className="fa fa-user fa-5x" aria-hidden="true" id="user-icon"></i>
    </ActiveLink>
  ) : (
    <ActiveLink to="/login">
      <i className="fa fa-user fa-5x" aria-hidden="true" id="user-icon"></i>
    </ActiveLink>
  );

  return (
    <div className="navbar-container">
      <i className="fa fa-bars fa-4x" aria-hidden="true" id="bars-icon"></i>
      <i className="fa fa-coffee fa-5x" aria-hidden="true" id="logo"></i>
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
      <div className="user-cart-container">
        {renderUserIcon}
        <div className="cart-container">
          <ActiveLink to="/cart">
            <i
              className="fa fa-shopping-cart fa-5x"
              aria-hidden="true"
              id="cart-icon"
            ></i>
          </ActiveLink>
          <div className="item-counter">{itemsInCart}</div>
        </div>
      </div>
    </div>
  );

  /**
   *
   */
  function loadItemsInCart() {
    // Send request to API for the number of items in the users cart
    // E.g queryCartItems().length

    // Dummy number to showcase functionality
    const numberOfItems = 1;

    setNumberOfItemsInCart(numberOfItems);
  }
}
