import * as React from "react";
import Accordion from "@mui/material/Accordion";
import AccordionSummary from "@mui/material/AccordionSummary";
import AccordionDetails from "@mui/material/AccordionDetails";
import Typography from "@mui/material/Typography";
import ExpandMoreIcon from "@mui/icons-material/ExpandMore";
import "./Footer.css";

/**
 * Creates the footer for the application
 * with Accordian mui component library.
 *
 * @returns {JSX.Element}
 * @constructor
 */
export function Footer() {
  return (
    <footer>
      <Accordion className="accordion">
        <AccordionSummary
          expandIcon={<ExpandMoreIcon />}
          aria-controls="about-us-content"
          id="about-us-header"
        >
          <Typography sx={{ fontSize: 20 }}>About us</Typography>
        </AccordionSummary>
        <AccordionDetails>
          <Typography sx={{ fontSize: 16 }}>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
            malesuada lacus ex, sit amet blandit leo lobortis eget.
          </Typography>
        </AccordionDetails>
      </Accordion>

      <Accordion className="accordion">
        <AccordionSummary
          expandIcon={<ExpandMoreIcon />}
          aria-controls="contact-us-content"
          id="contact-us-header"
        >
          <Typography sx={{ fontSize: 20 }}>Contact us</Typography>
        </AccordionSummary>
        <AccordionDetails>
          <Typography sx={{ fontSize: 16 }}>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
            malesuada lacus ex, sit amet blandit leo lobortis eget.
          </Typography>
        </AccordionDetails>
      </Accordion>

      <Accordion className="accordion">
        <AccordionSummary
          expandIcon={<ExpandMoreIcon />}
          aria-controls="info-content"
          id="info-header"
        >
          <Typography sx={{ fontSize: 20 }}>Info</Typography>
        </AccordionSummary>
        <AccordionDetails>
          <Typography sx={{ fontSize: 16 }}>
            This website is a result of a university group project, performed in
            the course IDATA2301 Web technologies, at NTNU. All the information
            provided here is a result of imagination. Any resemblance with real
            companies or products is a coincidence.
          </Typography>
        </AccordionDetails>
      </Accordion>

      <div id="footer-icons">
        <i className="fa fa-facebook fa-5x" aria-hidden="true"></i>
        <i className="fa fa-instagram fa-5x" aria-hidden="true"></i>
        <i className="fa fa-twitter fa-5x" aria-hidden="true"></i>
      </div>
    </footer>
  );
}
