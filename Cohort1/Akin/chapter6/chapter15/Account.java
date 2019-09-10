package chapter15;

public class Account {
	
	private int accountNumber;
	private String firstName;
	private String lastName;
	private double balance;
	
	//initializes an account with default values
	public Account() { this(0,"","", 0.0); }

	public Account(int accountNumber, String firstName, String lastName, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
		
}
