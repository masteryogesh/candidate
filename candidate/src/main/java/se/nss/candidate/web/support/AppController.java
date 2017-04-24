/**
 * 
 */
package se.nss.candidate.web.support;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yokum
 *
 */
@RestController
@RequestMapping("/")
public class AppController {

	@RequestMapping("/")
	String home() {
		return "Candidate application started!";
	}

/*	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Proudly handcrafted by " + "<a href='http://netgloo.com/en'>Netgloo</a> :)";
	}*/
}
