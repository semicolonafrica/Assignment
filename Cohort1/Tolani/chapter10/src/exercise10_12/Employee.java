package exercise10_12;

import exercise8_8.Date1;



public abstract class Employee {
	
	private final String firstName;
	
	private final String lastName;
	
	private final String socialSecurityNumber;
	
	private final Date1 birthDate;
	
	
	public Employee(String firstName,String lastName,String number,Date1 date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = number;
		this.birthDate = date;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public Date1 getBirthDate() {
		return birthDate;
	}
	public abstract double earning();
	
	public abstract String toString();
	
	public abstract void printEmployeeDetails();
	

}
