package exercise8_6;

public class SavingsAccount {
	private static double annualInterestRate = 0.04;
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public double getSavingsBalance() {
		savingsBalance = savingsBalance + calculateMonthlyInterest(); 
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double calculateMonthlyInterest() {		
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		return monthlyInterest;
	}
	public static double modifyInterestRate() {
		double annualInterestRate = 6;
		return annualInterestRate;		
	}	
}
