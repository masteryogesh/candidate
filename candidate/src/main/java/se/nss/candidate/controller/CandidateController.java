/**
 * 
 */
package se.nss.candidate.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import se.nss.candidate.entity.Candidate;
import se.nss.candidate.service.CandidateService;

/**
 * @author yokum
 *
 *         create?email=[email]&name=[name]:create a new candidate with an
 *         auto-generated id and email and name as passed values.
 *         delete?id=[id]: delete the candidate with the passed id.
 *         get-by-email?email=[email]: retrieve the id for the candidate with
 *         the passed email address. update?id=[id]&email=[email]&name=[name]:
 *         update the email and the name for the candidate indentified by the
 *         passed id.
 */

@RestController
@RequestMapping(value = "/candidate", produces = "application/json")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;

	public CandidateController() {

	}

	/**
	 * /create --> Create a new Candidate and save it in the database.
	 * 
	 * @param email
	 *            Candidate email
	 * @param name
	 *            Candidate name
	 * @return A string describing if the user is succesfully created or not.
	 */
	@RequestMapping("/create")
	@ResponseBody
	public Candidate create(String email, String name) {
		Candidate candidate = null;
		try {
			candidate = new Candidate(email, name);
			candidate = candidateService.save(candidate);
		} catch (Exception ex) {
			throw new se.nss.candidate.web.support.MyResourceNotFoundException();
		}
		// return "Candidate succesfully created! (id = " + candidate.getId() +
		// ")";
		return candidate;
	}

	/**
	 * /delete --> Delete the candidate having the passed id.
	 * 
	 * @param id
	 *            The id of the candidate to delete
	 * @return A string describing if the candidate is succesfully deleted or
	 *         not.
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			Candidate candidate = new Candidate(id);
			candidateService.delete(candidate);
		} catch (Exception ex) {
			return "Error deleting the user: " + ex.toString();
		}
		return "candidate succesfully deleted!";
	}

	/**
	 * /get-by-email --> Return the id for the candidate having the passed
	 * email.
	 * 
	 * @param email
	 *            The email to search in the database.
	 * @return The candidate id or a message error if the candidate is not
	 *         found.
	 */
	@RequestMapping("/get-by-email")
	@ResponseBody
	public String getByEmail(String email) {
		String candidateId;
		try {
			Candidate candidate = candidateService.findByEmail(email);
			candidateId = String.valueOf(candidate.getId());
		} catch (Exception ex) {
			return "Candidate not found";
		}
		return "The Candidate id is: " + candidateId;
	}

	/**
	 * /update --> Update the email and the name for the candidate in the
	 * database having the passed id.
	 * 
	 * @param id
	 *            The id for the candidate to update.
	 * @param email
	 *            The new email.
	 * @param name
	 *            The new name.
	 * @return A string describing if the candidate is succesfully updated or
	 *         not.
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String updateUser(long id, String email, String name) {
		try {
			Optional<Candidate> candidate = candidateService.findOne(id);
			if (candidate.isPresent()) {
				candidate.get().setEmail(email);
				candidate.get().setName(name);
				candidateService.save(candidate.get());
			}

		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "User succesfully updated!";
	}

}
