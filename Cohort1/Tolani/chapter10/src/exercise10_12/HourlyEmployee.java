package exercise10_12;

import exercise8_8.Date1;

public class HourlyEmployee extends Employee {
	
	private int hours;
	
	private double wages;
	
	private double bonus = 0.0;

	public HourlyEmployee(String firstName, String lastName, String number,double wages,int workHours,Date1 birthDate) {
		super(firstName, lastName, number,birthDate);
		// TODO Auto-generated constructor stub
		
		if(this.wages < 0.0) {
			throw new IllegalArgumentException("Wages must be greater than zero");
		}
		if(hours < 0.0 || hours >= 168) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		this.hours = workHours;
		this.wages = wages;
	}

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		
		if(wages < 0.0) {
			throw new IllegalArgumentException("Gross sales is greater than zero");
		}

		this.wages = wages;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		
		if(hours < 0.0 || hours > 168) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		this.hours = hours;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double earning() {
		 double earnings = 0.0;
		 
		 if(hours <= 40) {
			 earnings = bonus + (this.hours * this.wages);
			 
		 }
		 
		 if(hours > 40) {
			 earnings = bonus + (1.5 * (this.hours * this.wages));
		 }
		
		 return earnings;
	}
	
	public String toString() {
		return String.format("%s : %s %s%n%n%s: %s%n%n%s: %.2f","Employee",getFirstName(),getLastName(),"Security number",
				getSocialSecurityNumber(),"Salary",earning());
	}
	
	public void printEmployeeDetails() {
		System.out.printf("%n%s:%n%n%s%n", "Employees' Information",toString());
	}
	
	
	
	

}
