import "./Footer.css"

/**
 * Creates the footer for the application
 * 
 * @returns {JSX.Element}
 * @constructor
 */
export function Footer(){
    return(
        <footer>

            <container id="about-us-section">
                <h3>About us</h3>
                <i class="fa fa-angle-down fa-4x"></i>
            </container>   
            
            <container id="contact-us-section">
                <h3>Contact us</h3>
                <i class="fa fa-angle-down fa-4x"></i>
            </container>
            
            <container id="info-section">
                <h3>Info</h3>
                <i class="fa fa-angle-down fa-4x"></i>
            </container>

            <container id="footer-icons">
                <i class="fa fa-facebook fa-5x" aria-hidden="true"></i>
                <i class="fa fa-instagram fa-5x" aria-hidden="true"></i>
                <i class="fa fa-twitter fa-5x" aria-hidden="true"></i>
            </container>
            
        </footer>


    );

}