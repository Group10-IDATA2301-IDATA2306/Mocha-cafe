package no.ntnu.mocha;

import java.net.InetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import no.ntnu.mocha.domain.repository.RoleRepository;
import no.ntnu.mocha.domain.repository.UserRepository;

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

	@Autowired
	UserRepository urepository;

	@Autowired
	RoleRepository roleRepository;

	/* Represents the environment in which the application is running. */
	@Autowired
	private Environment environment;

	private static final Logger logger = 
		LoggerFactory.getLogger(MochaApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(MochaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/* Inject IP address and assigned port of active server instance. */
		String ip   = InetAddress.getLocalHost().getHostAddress();
		String port = environment.getProperty("local.server.port");

		/* Log initial status to STDOUT. */
		logger.info("Server instance initialized: " + ip + ":" + port);
	}
}
