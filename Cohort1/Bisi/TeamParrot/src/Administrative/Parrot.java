package Administrative;

public class Parrot {
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	
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
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String signUp() {
		String register = firstName + lastName + userName + passWord;
		return register;
	}
	public String loginIn() {
		String details = userName + passWord;
		return details;
	}
	public String createProfile() {
		
	}
	public String editProfile() {
		
	}
	public String logOut() {
		
	}
	

}
