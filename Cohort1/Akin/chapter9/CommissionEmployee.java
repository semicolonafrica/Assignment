package chapter9;

public class CommissionEmployee extends Object {

    private String firstName;
    private String lastName;
    private int socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
   // end constructor
   public String getFirstName(){
     return firstName;
   }

   public String getLastName(){
     return lastName;
   }
   public void setSocialSecurityNumber(int socialSecurityNumber){
	     this.socialSecurityNumber = socialSecurityNumber;
	   }

   public int getSocialSecurityNumber(){
     return socialSecurityNumber;
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

   public double earnings(){
     return getCommissionRate() * getGrossSales();
   }

   @Override //indicate that this method
   public String toString(){
     return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
     "commission employee",getFirstName(),getLastName(),
      "social security number",getSocialSecurityNumber(),
      "gross sales",getGrossSales(),
      "commission rate", getCommissionRate()
      );
   }
 } //end class CommissionEmployee

