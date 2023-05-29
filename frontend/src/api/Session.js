import { HttpInterface } from "./HttpInterface";

/**
 * Represents a login-session and contains the JSON
 * Web Token which where provided upon a successful login.
 */
class Session {
  constructor(jwt) {
    this.jwt = jwt;
    this.auth = false;
  }
}

export const SESSION = new Session("");
