import "./Product.css"

/**
 * A collection of products
 * 
 * @return {JSX.Element}
 * @constructor
 */
export function Product(){

    return( 
        <container className="product-section">

            <h2>Trending products</h2>
            <container className="product-container">
                <card id="product1">
                    {/* <img src={product1} alt="a product"/> */}
                </card>
                <card id="product2">
                    {/* <img src={product2} alt="a product"/> */}
                </card>
                <card id="product3">
                    {/* <img src={product3} alt="a product"/> */}
                </card>
            </container>
        </container>
   );
}







