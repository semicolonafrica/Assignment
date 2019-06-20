package exercise4_18;

public class Clc {

	private int accountNumber;
	private int balanceAtBeginning;
	private int charges;
	private int credits;
	private int creditLimit;
	private int newBalance;
		
	// creating a Constructor Class
	public Clc(int accountNumber, int balanceAtBeginning, int charges, int credits, int creditLimit) {
		this.accountNumber = accountNumber;
		this.balanceAtBeginning = balanceAtBeginning;
		this.charges = charges;
		this.credits = credits;
		this.creditLimit = creditLimit;
	}

	// creating Setters and Getters
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalanceAtBeginning() {
		return balanceAtBeginning;
	}
	public void setBalanceAtBeginning(int balanceAtBeginning) {
		this.balanceAtBeginning = balanceAtBeginning;
	}

	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}

	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

//	public void setNewBalance(int newBalance) {
//		this.newBalance = newBalance;
//	}
	
	// Method to Calculate using the IF statement
	public int calNewBalance() {
	if(creditLimit < balanceAtBeginning) {
		newBalance = balanceAtBeginning + charges - credits;
	}	
	if(creditLimit > balanceAtBeginning) {
		newBalance = balanceAtBeginning;
		System.out.println("Credit limit exceeded!");
	}
	return newBalance;
	}	
}

