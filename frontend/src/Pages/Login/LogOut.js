import { Link, useNavigate } from "react-router-dom";

export function LogOut() {
  const navigate = useNavigate();

  // Handle logout action
  const handleLogout = () => {
    // Perform any necessary logout logic here
    // For example, clear user session, reset state, etc.
    // Navigate to the login page after logout
    navigate("/login");
  };

  return (
    <div>
      <h1>Welcome to Mocha!</h1>
      <button onClick={handleLogout}>Logout</button>
    </div>
  );
}
