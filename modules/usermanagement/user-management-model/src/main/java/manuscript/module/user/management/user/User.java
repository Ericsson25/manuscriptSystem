package manuscript.module.user.management.user;

import java.sql.Date;

/**
 * 
 * @author Balazs Kovacs
 *
 */
public class User {

	private String userName;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Gender gender;
	private String phoneNumber;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String firstName, String lastName, Date birthDate, Gender gender, String phoneNumber) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
	}

}
