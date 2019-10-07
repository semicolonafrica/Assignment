package exercise10_12;
import exercise8_14.Date2;

public class BaseCommPoly extends CommissionEmployeePoly {
	private double baseSalary;
	
	
	public BaseCommPoly(String firstName, String lastName,
			 String socialSecurityNumber,Date2 birthDate, double grossSales,
			 double commissionRate, double baseSalary)
	 {
	 super(firstName, lastName, socialSecurityNumber,birthDate, grossSales, commissionRate);
			
	 
		if (baseSalary < 0.0) // validate baseSalary
		 throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	 }
	
	 // set base salary
	 public void setBaseSalary(double baseSalary)
	 {
	 if (baseSalary < 0.0) // validate baseSalary
	 throw new IllegalArgumentException("Base salary must be >= 0.0");
	 
	 this.baseSalary = baseSalary;
	 }
	 
	  // return base salary
	 public double getBaseSalary()
	  {
	  return baseSalary;
	  
	  }
	 
	 
	 @Override
	 public double earnings()
	 {
	 return getBaseSalary() + super.earnings();
	 }
	 // return String representation of BasePlusCommissionEmployee object
	 @Override
	 public String toString()
	 {
	 return String.format("%s %s; %s: $%,.2f",
	 "base-salaried", super.toString(),
	 "base salary", getBaseSalary());
	 }

}
