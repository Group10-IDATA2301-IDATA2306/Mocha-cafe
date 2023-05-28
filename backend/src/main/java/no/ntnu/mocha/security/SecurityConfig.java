package no.ntnu.mocha.security;



import static org.springframework.security.config.Customizer.withDefaults;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import no.ntnu.mocha.service.UserDetailsServiceImpl;


/**
 * Creates AuthenticationManager - set up authentication type.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

  @Autowired
  private UserDetailsServiceImpl userDetailsService;

  @Autowired
  private AuthenticationFilter authenticationFilter;

  @Autowired
  private AuthEntryPoint exceptionHandler;


  private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

  /**
   * This method will be called automatically by the framework to find out what
   * authentication to use.
   * Here we tell that we want to load users from a database
   *
   * @param auth Authentication builder
   * @throws Exception
   */
  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
      auth.userDetailsService(userDetailsService)
              .passwordEncoder(bCryptPasswordEncoder);
  }

  /**
   * Creates and returns an in-memory user details service with two pre-defined
   * users.
   * 
   * @return An in-memory user details service with two pre-defined users.
   */
  @Bean
  public UserDetailsService getUserDetailsService() {
      UserDetails user = User.builder()
              .username("user")
              .password(bCryptPasswordEncoder.encode("user"))
              .roles("USER")
              .build();

      UserDetails admin = User.builder()
              .username("admin")
              .password(bCryptPasswordEncoder.encode("admin"))
              .roles("ADMIN")
              .build();

      return new InMemoryUserDetailsManager(user, admin);
  }

    /**
     * Configures the AuthenticationManager instance and returns it.
     * 
     * @param http An HttpSecurity instance to configure the AuthenticationManager
     *             instance.
     * @return An AuthenticationManager instance.
     */
    @Bean
    public AuthenticationManager getAuthenticationManager(HttpSecurity http) throws Exception {
        http.getSharedObject(AuthenticationManagerBuilder.class)
            .userDetailsService(userDetailsService)
            .passwordEncoder(bCryptPasswordEncoder);
        
        return http.getSharedObject(AuthenticationManagerBuilder.class).build();
    }

  /**
   * This method will be called automatically by the framework to find out what
   * authentication to use.
   *
   * @param http HttpSecurity setting builder
   * @throws Exception
   */
  @Bean
  @SuppressWarnings(value = { "all" })
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
            .cors(withDefaults())
            .sessionManagement(management -> management
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            /* 
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers(HttpMethod.POST, "/login", "/users")
                .permitAll()
                .anyRequest()
                .authenticated()
            ) */
            .authorizeHttpRequests()
            .requestMatchers(HttpMethod.POST, "/login", "/users")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
            .exceptionHandling(handling -> handling
                .authenticationEntryPoint(exceptionHandler)
            )
            .addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);

      return http.build();
  }

  /**
   * Returns a CorsConfigurationSource object that is used to configure
   * Cross-Origin Resource Sharing (CORS) for the application.
   * The configuration sets allowed origins, methods, and headers and
   * specifies whether or not to allow credentials.
   * 
   * @return a CorsConfigurationSource object with CORS configuration settings
   */
  @Bean
  CorsConfigurationSource corsConfigurationSource() {
      UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
      CorsConfiguration config = new CorsConfiguration();
      config.setAllowedOrigins(Arrays.asList("*"));
      config.setAllowedMethods(Arrays.asList("*"));
      config.setAllowedHeaders(Arrays.asList("*"));
      config.setAllowCredentials(false);
      config.applyPermitDefaultValues();

      source.registerCorsConfiguration("/**", config);
      return source;
  }
}
