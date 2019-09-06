package exercise418;

public class CreditCard {

	private int acountNumber;
	private int balance;
	private int totalItemsCharged;
	private int totalCredit;
	private int creditLimit;
	
	
	public int getAcountNumber() {
		return acountNumber;
	}

	public void setAcountNumber(int acountNumber) {
		this.acountNumber = acountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTotalItemsCharged() {
		return totalItemsCharged;
	}

	public void setTotalItemsCharged(int totalItemsCharged) {
		this.totalItemsCharged = totalItemsCharged;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int newBalance() {
		int newBal = 0;
		newBal = balance + totalItemsCharged - totalCredit;
		return newBal;
	}
	
	public void checkCreditLimit() {
		int newBal = newBalance();
		if (newBal > creditLimit) {
			System.out.println("Credit limit exceeded");
		}
	}
}
