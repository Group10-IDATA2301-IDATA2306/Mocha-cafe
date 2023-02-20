package no.ntnu.mocha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import no.ntnu.mocha.domain.repository.CategoryRepository;
import no.ntnu.mocha.domain.repository.MediaRepository;
import no.ntnu.mocha.domain.repository.ProductRepository;

@SpringBootApplication
public class MochaApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MochaApplication.class);

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	MediaRepository mediaRepository;

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MochaApplication.class, args);
	}

	/**
	 * Sets in data into the database before the application starts.
	 * Uses this to test if it works.
	 */
	@Override
	public void run(String... args) throws Exception {
		// Add category objects and save these to db


		// Add product object object and link to category and save these to db
	}

}
