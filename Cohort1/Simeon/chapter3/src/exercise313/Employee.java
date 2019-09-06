package exercise313;

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {

		this.firstName = firstName;
		this.lastName = lastName;
		
		if (monthlySalary > 0.0)
			this.monthlySalary = monthlySalary;
	}
	
	// set method for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// get method for first name
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		
		if (monthlySalary > 0.0)
			this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	
	// method to calculate yearly salary
	public double yearlySalary() {
		double yearlySalary;
		yearlySalary = monthlySalary * 12;
		
		return yearlySalary;
		
	}
	
	public double raise(double raise) {
		if (raise > 0)
			monthlySalary += monthlySalary * (raise / 100);
		 
		 return monthlySalary;
	}
	
}
