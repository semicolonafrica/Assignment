package exercise9_14;

public class Employee {
	private String firstName;
	private String lastName;
	private int socialSecurityNumber;
	
	
	public Employee(String firstName,String lastName,int socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	
	public String toString() {
		return String.format("%s %n%s%d",getFirstName(),getLastName(),getSocialSecurityNumber());
		
	}

}
