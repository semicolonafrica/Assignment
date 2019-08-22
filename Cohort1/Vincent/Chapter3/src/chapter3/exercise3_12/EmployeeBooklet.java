package chapter3.exercise3_12;

public class EmployeeBooklet {
	
	private String firstName;
	private String LastName;
	private double monthlySalary;
	private double increaseSalary = 0.10;
	private double months= 12;
	public EmployeeBooklet(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public double calculateSalary() {
		double calculate = monthlySalary + increaseSalary;
		
		double calculateYearlySalary = calculate * months;
		
		return calculateYearlySalary;
		
	}
	
	
}
