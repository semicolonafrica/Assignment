package exercise9_14;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate,double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary is greater than zero");
		}
		
		this.baseSalary = baseSalary;
		
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		
		if(baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary is greater than zero");
		}
		
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		return getBaseSalary() + (getGrossSales() * getCommissionRate()); 
	}
	
	@Override
	public String toString() {
		return String.format("%s : %s%n%s: %.2f%n%s:%.2f%n%s: %.2f", "Commission Employee",super.toString(),"Gross sales",getGrossSales(),"Commission rate",
				getCommissionRate(),"Total earnings",earnings());
	}

}
