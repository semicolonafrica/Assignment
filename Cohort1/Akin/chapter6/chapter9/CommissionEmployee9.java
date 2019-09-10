package chapter9;

public class CommissionEmployee9 extends Employee9{

	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	public CommissionEmployee9(String firstName, String lastName,int socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
	}
	
	public void setGrossSales(double grossSales){
	     if(grossSales < 0.0){
	       throw new IllegalArgumentException(
	       "Gross sales must be >= 0.0"
	       );
	     }
	     this.grossSales = grossSales;
	   }

	   //return gross sales amount
	   public double getGrossSales(){
	     return grossSales;
	   }

	   public void setCommissionRate(double commissionRate)
	   {
	     if (commissionRate <= 0.0 || commissionRate >= 1.0) {
	       throw new IllegalArgumentException(
	        "Commission rate must be > 0.0 and < 1.0"
	       );
	     }
	     this.commissionRate = commissionRate;
	   }

	   public double getCommissionRate(){
	     return commissionRate;
	   }

	   public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double earnings(){
	     return getCommissionRate() * getGrossSales();
	   }

	    @Override
	    public String toString()
	    {
	        return String.format("%s %s%n%s: %.2f%n%s",super.toString(),getBaseSalary());
	    }
}
