package exercise10_12;

import exercise8_8.Date1;

public class SalaryEmployee extends Employee {
	
	private double weeklySalary;
	
	private double bonus = 0.0;

	public SalaryEmployee(String firstName, String lastName, String number,double salary,Date1 birthDate) {
		super(firstName, lastName, number,birthDate);
		if(salary <= 0.0) {
			throw new IllegalArgumentException("Weekly Salary must be greater than zero");
		}
		this.weeklySalary = salary;
		
	}
	
	public void setWeeklySalary(double salary) {
		if(salary <= 0.0) {
			throw new IllegalArgumentException("Weekly Salary must be greater than zero");
		}
		this.weeklySalary = salary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double earning() {
		
		return bonus + getWeeklySalary();
	}
	
	public String toString() {
		return String.format("%s : %s %s%n%n%s: %s%n%n%s: %.2f","Employee",getFirstName(),getLastName(),"Security number",
				getSocialSecurityNumber(),"Salary",getWeeklySalary());
	}
	
	public void printEmployeeDetails() {
		System.out.printf("%n%s:%n%n%s%n", "Employees' Information",toString());
	}
}
