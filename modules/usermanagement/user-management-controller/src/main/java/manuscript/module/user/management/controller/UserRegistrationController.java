package manuscript.module.user.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "registration")
public class UserRegistrationController {

	@RequestMapping("/create")
	public void createRegistration() {
		System.out.println("Hello");
	}
}
