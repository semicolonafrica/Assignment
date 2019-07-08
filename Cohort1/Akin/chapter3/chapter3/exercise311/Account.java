/**
 * 
 */
package chapter3.exercise311;

/**
 * @author Akinlolu
 *
 */
public class Account {

	private String name;
	private double balance;
	
	
	

	public Account(String name, double accountBalance) {
		this.name = name;
		if(balance > 0) {
		this.balance = accountBalance;
		}
	}

	public double withdraw(double amountToWithdraw) {
		if(amountToWithdraw > balance) {
			System.out.println("Onyeoshi!!!");
		}
		if (amountToWithdraw <= balance) {
		balance -= amountToWithdraw;
		
		}
		return balance;
	}
	

	public void deposit(double depositAmount) {
		if(depositAmount < 0) {
			System.out.println("Don't be silly! You don't have money");
		}
		if(depositAmount > 0) {
			balance += depositAmount;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}




	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}




}
