package manuscript.module.user.management.registration;

import org.springframework.beans.factory.annotation.Autowired;

import manuscript.module.user.management.registration.mapper.UserRegistrationMapper;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class UserRegistrationDaoImpl implements UserRegistrationDao {

	@Autowired
	UserRegistrationMapper userRegistrationMapper;

	@Override
	public String getUserName(String userName) {
		return userRegistrationMapper.getUserName(userName);
	}

}
