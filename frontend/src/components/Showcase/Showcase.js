import "./Showcase.css";
import { ShowcaseCard } from "./ShowcaseCard";
import React, { useEffect, useState } from "react";
import axios from "axios";

const jsonTestData = {
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
  return (
    <div className="product-section">
      <h2>New Releases</h2>
      <div className="product-container">
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
        <ShowcaseCard props={jsonTestData} />
      </div>
    </div>
  );
}
