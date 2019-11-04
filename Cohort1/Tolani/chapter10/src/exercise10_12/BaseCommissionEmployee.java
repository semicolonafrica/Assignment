package exercise10_12;

import exercise8_8.Date1;

public class BaseCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	
	private double bonus =0.0;
	public BaseCommissionEmployee(String firstName, String lastName, String number, double rate, double sales,double salary,Date1 birthDate) {
		super(firstName, lastName, number, rate, sales,birthDate);
		// TODO Auto-generated constructor stub
		
		if(salary <= 0.0) {
			throw new IllegalArgumentException("Base salary must be greater than zero");
		}
		this.baseSalary = salary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double earning() {
		double salary = bonus + getBaseSalary();
				
		return super.earning() + salary;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s : %s %s%n%n%s: %s%n%n%s: %.2f%n%n%s: %.2f%n%n%s: %.2f%n%n%s: %.2f","Employee",getFirstName(),getLastName(),"Security number",
				getSocialSecurityNumber(),"Gross Sales",getGrossSales(),"Commision Rate",getCommissionRate(),"Base Salary",getBaseSalary(),"Salary",earning());
	}
	
	@Override
	public void printEmployeeDetails() {
		System.out.printf("%n%s:%n%n%s%n", "Employees' Information",toString());
	}

}
