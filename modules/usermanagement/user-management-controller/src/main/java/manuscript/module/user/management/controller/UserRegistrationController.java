package manuscript.module.user.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author Balazs Kovacs
 *
 */
@Controller
@RequestMapping(value = "registration")
public class UserRegistrationController {

	// @Autowired
	// private UserRegistrationService userRegistrationService;

	@RequestMapping("/create")
	public void createRegistration() {
		System.out.println("Hello");
	}
}
