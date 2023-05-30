import "./Showcase.css";
import { ShowcaseCard } from "./ShowcaseCard";
import React, { useEffect, useState } from "react";
import axios from "axios";

const jsonTestshowcaseData = {
  id: "2",
  name: "Black Coffe",
  price: "122",
  description:
    "This delicious Brazilian coffee is sealed for freshness, giving you the ultimate coffee drinking experience.Enjoy the unique Brazilian flavor in every sip!",
};

/**
 * A section of showcased products
 *
 * @return {JSX.Element}
 * @constructor
 */
export function Showcase() {
  // const [showcaseData, setshowcaseData] = useState([]);

  // // fetches showcaseData once the component is mounted
  // useEffect(() => {
  //   fetchshowcaseData();
  // }, []);

  // // fetches product showcaseData using swagger api
  // const fetchshowcaseData = async () => {
  //   try {
  //     const response = await axios.get(
  //       "https://group10.web-tek.ninja:8080/products/order?order=popularity"
  //     );
  //     setshowcaseData(response.showcaseData);
  //     console.log(response.showcaseData);
  //   } catch (error) {
  //     console.error(error);
  //   }
  // };

  return (
    <div className="product-section">
      <h2>Popular Releases</h2>
      <div className="product-container">
        <ShowcaseCard props={jsonTestshowcaseData} />
        {/* <ShowcaseCard props={showcaseData[0]} />
        <ShowcaseCard props={showcaseData[1]} />
        <ShowcaseCard props={showcaseData[2]} /> */}
      </div>
    </div>
  );
}
