package manuscript.module.user.management.registration.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public interface UserRegistrationMapper {

	String getUserName(@Param("userName") String userName);
}
