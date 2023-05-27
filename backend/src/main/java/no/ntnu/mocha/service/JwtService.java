package no.ntnu.mocha.service;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;


/**
 * Represents an JSON Web Token (JWT) service which generates
 * JWT Tokens upon user authentication, and to validate JWTs
 * provided by the client to ensure the credibility of the
 * given requests.
 *
 * @author  Group 10
 * @since   14.05.2023
 * @version 14.05.2023
 */
@Component
public class JwtService {

	static final long EXPIRATIONTIME = 86400000; // 1 day in ms

	static final String PREFIX = "Bearer";

	// Generate secret key. Only for the demonstration
	// You should read it from the application configuration
	static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	
	// Generate JWT token
	public String getToken(String username) {
		return Jwts.builder()
			  .setSubject(username)
			  .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
			  .signWith(key)
			  .compact();
  	}

	// Get a token from request Authorization header,
    // parse a token and get username
	public String getAuthUser(HttpServletRequest request) {
        String token = request.getHeader(HttpHeaders.AUTHORIZATION);
        String user = null;

        if (token != null) {
            user = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token.replace(PREFIX + " ", ""))
                .getBody()
                .getSubject();
        }
        return user;
	}
}
