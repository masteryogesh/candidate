/**
 * 
 */
package se.nss.candidate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yokum
 *
 */

@SpringBootApplication
public class Applicaiton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Applicaiton.class, args);
		Logger logger = LoggerFactory.getLogger(Applicaiton.class);
		System.out.println("Candidate application started");
		logger.info("Candidate application started");

	}

}
