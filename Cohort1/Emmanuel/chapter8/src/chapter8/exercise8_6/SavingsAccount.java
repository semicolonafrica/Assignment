package chapter8.exercise8_6;

public class SavingsAccount {
	static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static double getAnnaulInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public double  calculateMonthlyInterest() {
		//double newSavings = getSavingsBalance();
		double monthlyInterest = getSavingsBalance() * annualInterestRate/12;
		
		return monthlyInterest;	
	}
	
	public double getSavings() {
		savingsBalance += calculateMonthlyInterest();
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double newValue) {
	newValue = annualInterestRate;
	}

}
