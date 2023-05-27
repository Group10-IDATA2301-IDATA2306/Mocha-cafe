package no.ntnu.mocha.security;


import static org.springframework.security.config.Customizer.withDefaults;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Creates AuthenticationManager - set up authentication type.
 */
@Configuration
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private AuthenticationFilter authenticationFilter;
  

/**
   * This method will be called automatically by the framework to find out what authentication to use.
   * Here we tell that we want to load users from a database
   *
   * @param auth Authentication builder
   * @throws Exception
   */
  @Autowired
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService);
  }

  /**
   * This method will be called automatically by the framework to find out what authentication to use.
   *
   * @param http HttpSecurity setting builder
   * @throws Exception
   */
  @Bean
  public SecurityFilterChain configureAuthorizationFilterChain(HttpSecurity http) throws Exception {
    // Allow JWT authentication
    http.cors().and().csrf().disable()
        .authorizeHttpRequests()
        .requestMatchers("/api/authenticate").permitAll()
        .requestMatchers("/api/signup").permitAll()
        .requestMatchers("/api/products").permitAll()
        .anyRequest().authenticated()
        .and().sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);
    return http.build();
  }

  /**
   * This is needed since Spring Boot 2.0, see
   * 
   * @return
   * @throws Exception
   */
  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
    return config.getAuthenticationManager();
  }

  /**
   * This method is called to decide what encryption to use for password checking
   *
   * @return The password encryptor
   */
  @Bean
  public PasswordEncoder getPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
