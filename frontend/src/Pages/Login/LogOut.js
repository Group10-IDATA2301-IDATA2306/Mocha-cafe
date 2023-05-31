import { Link, useNavigate } from "react-router-dom";

export function LogOut({ setLoggedIn }) {
  const navigate = useNavigate();

  // Handle logout action
  const handleLogout = () => {
    // Perform any necessary logout logic here
    // For example, clear user session, reset state, etc.
    // Update the login status to false
    setLoggedIn(false);
    // Navigate to the login page after logout
    navigate("/login");
  };

  return (
    <div>
      <h1>Welcome to Mocha!</h1>
      <button onClick={handleLogout}>Logout</button>
      <p>
        Click <Link to="/login">here</Link> to log in again.
      </p>
    </div>
  );
}
