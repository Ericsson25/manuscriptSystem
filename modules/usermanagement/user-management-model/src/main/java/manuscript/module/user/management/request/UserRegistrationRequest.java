package manuscript.module.user.management.request;

import manuscript.module.user.management.user.Address;
import manuscript.module.user.management.user.User;

public class UserRegistrationRequest {

	private User user;
	private Address address;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserRegistrationRequest [user=" + user + ", address=" + address + "]";
	}

}
