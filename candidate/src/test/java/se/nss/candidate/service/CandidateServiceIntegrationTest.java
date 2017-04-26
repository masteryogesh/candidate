/**
 * 
 */
package se.nss.candidate.service;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yokum
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = se.nss.candidate.Applicaiton.class, webEnvironment = WebEnvironment.DEFINED_PORT)
public class CandidateServiceIntegrationTest {

	private static final String ENDPOINT = "http://localhost:8080/candidate/create";

	@Test
	public void givenRequestForCandidate_toCreateCadidate_noException() {
		given().params("email", "emailtest1", "name", "test1").post(ENDPOINT).then().assertThat().statusCode(200)
				.body("name", equalTo("test1")).and().body("email", equalTo("emailtest1"));

	}

	@Test
	public void givenRequestForCandidate_toCreateCadidate_withException() {
		given().params("email", "emailtest1").post(ENDPOINT).then().assertThat().statusCode(500);

	}
}
