/**
 * 
 */
package exercise9_3;

/**
 * @author User
 *
 */
public class CommissionEmployee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private  double commissionRates;
	
	
	
	public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRates) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		this.grossSales=grossSales;
		this.commissionRates=commissionRates;
	}



	public String getLastName() {
		return lastName;
	}



	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}



	public double getGrossSales() {
		return grossSales;
	}



	public double getCommissionRates() {
		return commissionRates;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setGrossSales(double grossSales) {
		
		if(grossSales<0.0)
			throw new IllegalArgumentException("Gross sales must be greater than 0");
		this.grossSales = grossSales;
	}



	public void setCommissionRates(double commissionRates) {
		
		if(commissionRates <= 0.0|| commissionRates >=1.0)
			throw new IllegalArgumentException("must be within a range ");
			
		this.commissionRates = commissionRates;
	}
	
	
	public double earning() {
		return getGrossSales() * getCommissionRates();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","commission employee",
				getFirstName(), getLastName(),"social security number",getSocialSecurityNumber(),"gross sales",getGrossSales(),"commission rate", getCommissionRates());
	}
	

}
