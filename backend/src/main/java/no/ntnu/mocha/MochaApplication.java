package no.ntnu.mocha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import no.ntnu.mocha.domain.entity.Product;
import no.ntnu.mocha.domain.repository.ProductRepository;

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

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MochaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Add products objects and save these to db.
		Product product1 = new Product("1", "2", "3", "Mocha", 120, 20, 5.2, 20.0, "Strong Mocha Coffee", true);

		for(Product product : productRepository.findAll()) {
			logger.info(product.getName() + " " + product.getAmount());
		}
	}

}
