package exercise9_14;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	
	private double commissionRate;

	public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate) {
		super(firstName,lastName,socialSecurityNumber);
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales is greater than zero");
		}
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public void setGrossSales(double sales) {
		if(grossSales < 0.0) {
			throw new IllegalArgumentException("Gross sales is greater than zero");
		}
		this.grossSales = sales;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0) {
			throw new IllegalArgumentException("Commission rate must be greater than 0 and less than 1.0");
		}
		
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	
	public double earnings() {
		return getGrossSales() * getCommissionRate(); 
	}
	
	@Override
	public String toString() {
		return String.format("%s : %s%n%s: %.2f%n%s: %.2f %n%s:%.2f", "Commission Employee",super.toString(),"Gross sales",getGrossSales(),"Commission rate",
				getCommissionRate(),"Total earnings",earnings());
	}
	
	
}
