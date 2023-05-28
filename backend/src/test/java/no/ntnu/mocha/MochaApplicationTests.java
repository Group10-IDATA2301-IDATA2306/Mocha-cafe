package no.ntnu.mocha;

import java.security.Key;
import java.util.Base64;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@SpringBootTest
class MochaApplicationTests {

	static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

	@Test
	void contextLoads() {
		byte[] data =  key.getEncoded();
		String encoded = Base64.getEncoder().encodeToString(data);
		System.out.println("\n\n\n" + encoded + "\n\n\n");
	}

}
