/**
 * 
 */
package se.nss.candidate;

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
		System.out.println("Candidate application started");

	}

}
