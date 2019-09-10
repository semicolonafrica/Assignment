package chapter9;

public class Employee9 {
	private String firstName;
    private String lastName;
    private int socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    
    public Employee9(String firstName, String lastName, int socialSecurityNumber) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.socialSecurityNumber = socialSecurityNumber;
    }

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
   
	   @Override //indicate that this method
	   public String toString(){
	     return String.format("%s: %s %s%n%s: %s",
	     "commission employee",getFirstName(),getLastName(),
	      "social security number",getSocialSecurityNumber()

	      );
	   }
   
 }
