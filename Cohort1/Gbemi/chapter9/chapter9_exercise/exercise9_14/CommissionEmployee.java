package exercise9_14;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commission;
	
	
	public CommissionEmployee( String firstName,String lastName,int socialSecurityNumber,double grossSales,double commission) {
		
		super(firstName,lastName,socialSecurityNumber);
		this.commission = commission;
		this.grossSales = grossSales;
		
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		
		if(grossSales<=0) 
			throw new IllegalArgumentException("gross sales must be greater than zero");
		
	
		this.grossSales = grossSales;
	}


	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		
		if(commission<=0) {
			throw new IllegalArgumentException("commission must be greater than zero");
		}
		this.commission = commission;
	}
	
	public double calComm() {
		
		return getGrossSales()*getCommission();
	}
	
	
	@Override
	
	public String toString() {
		return String.format("%s%n%s%n%d%n%.2f%n%.2f%n%.2f", getFirstName(),getLastName(),getSocialSecurityNumber(),getGrossSales(),getCommission(),calComm());
	}

}
