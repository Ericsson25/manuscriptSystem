package manuscript.module.user.management.registration;

import manuscript.module.user.management.request.UserRegistrationRequest;
import manuscript.module.user.management.response.UserRegistrationResponse;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationService {

	UserRegistrationResponse createRegistration(UserRegistrationRequest request);
}
