package exercise10_12;
import exercise8_14.Date2;

public class CommissionEmployeePoly extends EmployeePolymorphism {
	private double grossSales;
	private  double commissionRates;
	
	
	
	public CommissionEmployeePoly(String firstName,String lastName,String socialSecurityNumber,Date2 birthDate,double grossSales,double commissionRates) {
		
		
		super(firstName,lastName,socialSecurityNumber,birthDate);
		this.commissionRates = commissionRates;
		this.grossSales = grossSales;
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
	
	public double getGrossSales() {
		return grossSales;
	}



	public double getCommissionRates() {
		return commissionRates;
	}
	
	@Override
	public double earnings() {
		return getCommissionRates() * getGrossSales();
	}
	
	@Override
	public String toString()
	{
	return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
	"commission employee", super.toString(),
	"gross sales", getGrossSales(),
	"commission rate", getCommissionRates());
	}

}
