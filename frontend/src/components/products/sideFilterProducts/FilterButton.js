import { useState } from "react";
import { Link as RouterLink } from "react-router-dom";

import Box from "@mui/material/Box";
import Drawer from "@mui/material/Drawer";
import List from "@mui/material/List";
import Divider from "@mui/material/Divider";
import ListItem from "@mui/material/ListItem";
import ListItemIcon from "@mui/material/ListItemIcon";
import ListItemText from "@mui/material/ListItemText";

import DehazeIcon from "@mui/icons-material/Dehaze";
import MailIcon from "@mui/icons-material/Mail";
import HomeIcon from "@mui/icons-material/Home";
import VpnKeyIcon from "@mui/icons-material/VpnKey";
import DashboardIcon from "@mui/icons-material/Dashboard";
import { Dehaze } from "@mui/icons-material";
import SortIcon from "@mui/icons-material/Sort";
import Button from "react-bootstrap/Button";

const FilterButton = () => {
  const [state, setState] = useState(false);

  return (
    <>
      <SortIcon className="sort_btn" onClick={() => setState(true)} />
      <h4>FILTER</h4>

      <Drawer anchor={"left"} open={state} onClose={() => setState(false)}>
        <Box sx={{ width: 300 }}>
          <List>
            <ListItem>
              <Button className="buttonFilter1" onClick={() => setState(false)}>
                Home
              </Button>
            </ListItem>
          </List>
        </Box>
      </Drawer>
    </>
  );
};

export default FilterButton;
