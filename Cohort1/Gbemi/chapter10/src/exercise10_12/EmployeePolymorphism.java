package exercise10_12;
import exercise8_14.Date2;

public abstract class EmployeePolymorphism {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	private  Date2 birthDate;
	
	
	public EmployeePolymorphism( String firstName,String lastName,String socialSecurityNumber,Date2 birthDate){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
		
		
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
	
	


	public void setBirthDate(Date2 birthDate) {
		this.birthDate = birthDate;
	}


	public Date2 getBirthDate() {
		return birthDate;
	}
	
	public String toString() {
		return String.format("%s %s%nsocial security number: %s%n%s", 
				getFirstName(),getLastName(),getSocialSecurityNumber(),birthDate.toString());
	}
	
	
	public abstract double earnings();
	

}
