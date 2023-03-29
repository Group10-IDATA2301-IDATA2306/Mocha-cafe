import React from "react";

function ProductCart({ products }) {
    return (
        <div className="cartProductsWrapper">
            {products.map((product) => (
                <div key={product.pID} class="cartProductEl">
                    <div class="cartProductElDetails">
                        <img src={product.imgURL} alt={product.name}
                            class="cartProductElImg"/>
                            <div class="cartProductElTitleAndCount">
                                <h3 class="cartProductElTitle">
                                    {product.name}
                                </h3>
                                <input type="text" value="2" class="cartProductElCount"/>
                            </div>
                    </div>
                    <div class="cartProductElPrice">
                        {product.price}
                    </div>
                    <button class="cartProductElRemoveBtn">
                        X
                    </button>
                </div>
            ))}
        </div>
    );
}

export default ProductCart;