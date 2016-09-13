package manuscript.module.user.management.registration;

import org.springframework.stereotype.Service;

import manuscript.module.user.management.registration.UserRegistrationService;
import manuscript.module.user.management.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Override
	public UserRegistrationResponse createRegistration(UserRegistrationRequest request) {
		UserRegistrationResponse response = new UserRegistrationResponse();
		response.setDummy("köszi megjött");
		return response;
	}

}
