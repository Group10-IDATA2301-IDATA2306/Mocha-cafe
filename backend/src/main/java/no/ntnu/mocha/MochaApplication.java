package no.ntnu.mocha;

import io.github.cdimascio.dotenv.Dotenv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h1>Mocha Application</h1>
 * 
 * <p>
 * Represents the main class for the
 * Spring Boot Application "Mocha Application" with the
 * CommandLineRunner interface.
 * </p>
 * 
 * @version 21.03.2023
 * @since 21.03.2023
 */
@SpringBootApplication
public class MochaApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MochaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MochaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Add products objects and save these to db.
		// Product product1 = new Product("1", "2", "3", "Mocha", 120, 20, 5.2, 20.0,
		// "Strong Mocha Coffee", true);

		/*
		 * for(Product product : productRepository.findAll()) {
		 * logger.info(product.getName() + " " + product.getAmount());
		 * }
		 */

		// Dotenv dotenv = Dotenv.configure().load();
		// System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
		// System.setProperty("DB_PORT", dotenv.get("DB_PORT"));
		// System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		// System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		// System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
	}

}
