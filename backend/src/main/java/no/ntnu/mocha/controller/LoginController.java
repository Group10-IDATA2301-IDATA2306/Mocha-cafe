package no.ntnu.mocha.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import no.ntnu.mocha.DTO.UserDto;
import no.ntnu.mocha.service.JwtService;


/**
 * Represents a Login Controller class that provides RESTful
 * services to the /login endpoint with HTTP /POST mapping
 * for login requests.
 * 
 * @author  Group19
 * @since   16.04.2023
 * @version 16.04.2023
 */
@RestController
@CrossOrigin
public class LoginController {

    
    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;


	/**
     * Receives an HTTP POST request with the user's credentials and authenticates them. If the
     * authentication is successful, it generates a token and sets the budget ID and authorization headers.
     *
     * @param credentials An object that holds the user's credentials (username and password).
     * @return An HTTP response entity that includes a token in the Authorization header and the budget ID.
     */
    @PostMapping(value = "/login")
	public ResponseEntity<?> getToken(@RequestBody UserDto userDto) {

		UsernamePasswordAuthenticationToken creds = new UsernamePasswordAuthenticationToken(
			userDto.getUsername(),
			userDto.getPassword()
		);
		Authentication auth = authenticationManager.authenticate(creds);

		// Generate token
		String jwts = jwtService.getToken(auth.getName());


		// Build response with the generated token
		return ResponseEntity.ok()
			.header(HttpHeaders.AUTHORIZATION, "Bearer " + jwts)
			.header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Authorization")
			.build();
	}


	/**
     * Returns the authentication manager.
     *
     * @return The authentication manager.
     */
	public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }
}

