import React, { useState, useEffect } from "react";

function ProductList() {
    const [products, setProducts] = useState([]);

    useEffect(() => {
        fetch("./json/CartProducts.json")
            .then((response) => response.json())
            .then((data) => setProducts(data.products));
    }, []);

    return (
        <div>
            {products.map((product) => (
                <li key={product.pID}>
                    <h2>{product.name}</h2>
                    <p>{product.description}</p>
                    <p>{product.price}</p>
                </li>
            ))}
        </div>
    );
}

export default ProductList;
