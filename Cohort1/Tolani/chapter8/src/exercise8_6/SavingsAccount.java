package exercise8_6;

public class SavingsAccount {
	
	private static double annualInterestRate ;
	
	private double savingsBalance;
	
	public SavingsAccount( double savingsBalance,int annualInterest ) {
		this.savingsBalance = savingsBalance;
		
		annualInterestRate = annualInterest;
	}
	
	public void setSavingsBalance(double savingsBalance) {
		
		this.savingsBalance = savingsBalance;
	}
	
	public double getSavingsBalance() {
		
		return savingsBalance;
	}
	
	public static double modifyAnnualInterestRate(int annualInterest) {
		return annualInterestRate = annualInterest;
	}
	
	
	public double calculateMonthlyInterst(int noOfMonths) {
		
		
		double value = 0;
		
		double newBalance = getSavingsBalance();
		
		
		for(int count =1;count<=noOfMonths;count++) {
			
			
			value = (getSavingsBalance() * (annualInterestRate/100)) / 12;
			
			newBalance = newBalance + value;
			
			//System.out.printf("%d %2f%n",count,newBalance);
			
		}
		this.savingsBalance = newBalance;
		return newBalance;
	}
}
