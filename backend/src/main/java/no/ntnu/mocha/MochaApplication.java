package no.ntnu.mocha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h1>Mocha Application</h1>
 * 
 * <p>Represents the main class for the 
 * Spring Boot Application "Mocha Application" with the 
 * CommandLineRunner interface.</p>
 * 
 * @version	21.03.2023
 * @since	21.03.2023
 */
@SpringBootApplication
public class MochaApplication implements CommandLineRunner {

	private static final Logger logger = 
		LoggerFactory.getLogger(MochaApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(MochaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
