package no.ntnu.mocha;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import jakarta.servlet.http.HttpServletRequest;
import no.ntnu.mocha.service.JwtService;
import no.ntnu.mocha.service.UserDetailsServiceImpl;



/**
 * JUnit test class which tests the authentication aspects of the
 * Spring Boot application.
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class AuthenticationTest {

    @Autowired
    private MockMvc mvc;

	@Autowired
	private JwtService jwtService;
  
	@Autowired
	private UserDetailsServiceImpl userDetailsService;



	/**
	 * Retrieves a list of authorities from a JWT.
	 */
	private List<String> getAuthorities(HttpServletRequest request, String jwt) {
		String user = jwtService.getAuthUser(request); 

		return userDetailsService.loadUserByUsername(user)
			.getAuthorities()
			.stream()
			.map(a -> a.getAuthority())
			.collect(Collectors.toList());
	}


    /**
     * Sending HTTP /POST request to the /login endpoint with user credentials
     * which are valid. Expected to return a response from server with status
     * code 200 OK.
     */
    @Test
    public void authentication_request_with_valid_credentials() throws Exception {
        this.mvc
            .perform(
                post("/login")
                    .content("{\"username\":\"user\",\"password\":\"user\"}")
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                )
            .andDo(print()).andExpect(status().isOk());
    }


    /**
     * Sending HTTP /POST request to the /login endpoint with user credentials
     * which are invalid. Expected to return a response from server with status
     * code 401 UNAUTHORIZED.
     */
    @Test
    public void authentication_request_with_invalid_credentials() throws Exception {
        this.mvc
            .perform(
                post("/login")
                    .content("{\"username\":\"hello\",\"password\":\"world\"}")
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                )
            .andDo(print()).andExpect(status().isUnauthorized());
    }


	/**
	 * Asserts that an authenticated user has the role "ROLE_USER" specified
	 * in its JWT.
	 */
	@Test
	public void authenticated_user_has_USER_role() throws Exception {

		byte[] content = "{\"username\":\"user3\",\"password\":\"user3\"}".getBytes();

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
			.post("/login")
			.content(content)
			.contentType("application/json");
		
		String token = this.mvc
			.perform(builder)
			.andReturn().getResponse().getHeader(HttpHeaders.AUTHORIZATION);
		
		HttpServletRequest request = MockMvcRequestBuilders
			.post("/")
			.header(HttpHeaders.CONTENT_TYPE, "application/json")
			.header(HttpHeaders.AUTHORIZATION, token)
			.buildRequest(new MockServletContext());
		
		List<String> authorities = getAuthorities(request, token);


		assertTrue(authorities.contains("ROLE_USER"));
	}
}
