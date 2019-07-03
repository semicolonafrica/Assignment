package calculator;



public class CreditLimitCalculator {
	private int accountNumber;
	private int initialBalance = 87;
	private int charges = 67;
	private int totalCredits = 64;
	private int creditLimit = 98;
	private int newBalance;

public CreditLimitCalculator(int accountNumber, int initialNumber, int charges, int totalCredits, int creditLimit, int newBalance) {
	
}

	
	public int checkNewBalance() {
		newBalance = initialBalance + charges - totalCredits;
		
		if(newBalance < creditLimit) {
			System.out.println("credit limit exceeded ");
	
		}
		else {
			System.out.print("new balance");
		}
		return newBalance;
	}
	
	

	
}
