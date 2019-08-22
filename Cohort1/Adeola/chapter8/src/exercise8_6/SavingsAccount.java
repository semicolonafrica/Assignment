package exercise8_6;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double calculateMonthlyInterest() {
		double interest = (savingsBalance * (annualInterestRate/100))/12;
		savingsBalance = savingsBalance + interest; 
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double i) {
		annualInterestRate= i;
	}
}
