package exercise10_12;

import exercise8_8.Date1;

public class CommissionEmployee extends Employee {

	
	private double grossSales;
	
	private double commissionRate;
	
	private double bonus =0.0;
	
	public CommissionEmployee(String firstName, String lastName, String number,double rate,double sales,Date1 date) {
		super(firstName, lastName, number,date);
		// TODO Auto-generated constructor stub
		
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales is greater than zero");
		}
		
		if(commissionRate < 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		
		this.commissionRate = rate;
		this.grossSales = sales;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales is greater than zero");
		}
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate < 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		

		this.commissionRate = commissionRate;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double earning() {
		return bonus +( getCommissionRate() * getGrossSales());
		
		
	}
	
	public String toString() {
		return String.format("%s : %s %s%n%n%s: %s%n%n%s: %.2f%n%n%s: %.2f%n%n%s: %.2f%n%n","Employee",getFirstName(),getLastName(),"Security number",
				getSocialSecurityNumber(),"Gross Sales",getGrossSales(),"Commision Rate",getCommissionRate(),"Salary",earning());
	}
	
	public void printEmployeeDetails() {
		System.out.printf("%n%s:%n%n%s%n", "Employees' Information",toString());
	}
}
