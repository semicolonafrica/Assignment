package exercise3_13;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if(salary < 0) {
			salary = 0;
		}
		else{ this.salary = salary;
		}
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
	public double getSalary() {
		return salary;
	}
	public void yearlySalary(double yearlySalary) {
		salary = 12 * salary;
	}
	public void raise(double raise) {
		salary = (0.1 * salary) + salary;
	}
	
}
