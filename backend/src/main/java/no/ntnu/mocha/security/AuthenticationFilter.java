package no.ntnu.mocha.security;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import io.jsonwebtoken.JwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.core.userdetails.UserDetailsService;


/**
 * Represents an filter class to authenticate all other
 * incoming requests.The AuthencticationFilter class
 * extends Spring Security's OncePerRequestFilter
 * interface that provides doFilterInternal method where
 * the authentication is implemented.
 *
 * @author  Group 10
 * @since   14.05.2023
 * @version 14.05.2023
 */
@Component
public class AuthenticationFilter extends OncePerRequestFilter {
    private final static Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class.getSimpleName());
    
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthEntryPoint authEntryPoint;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

                final String authorizationHeader = request.getHeader("Authorization");
                String username = null;
                String jwt = null;
                try {
                  if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
                    jwt = authorizationHeader.substring(7);
                    username = authEntryPoint.extractUsername(jwt);
                  }
            
                  if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                    UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                    if (authEntryPoint.validateToken(jwt, userDetails)) {
                      UsernamePasswordAuthenticationToken upat = new UsernamePasswordAuthenticationToken(
                          userDetails, null, userDetails.getAuthorities());
                      upat.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                      SecurityContextHolder.getContext().setAuthentication(upat);
                    }
                  }
                } catch (JwtException ex) {
                  logger.info("Error while parsing JWT token: " + ex.getMessage());
                }
                filterChain.doFilter(request, response);
              }
}