package chapter3.exercise3_12;

public class Account {

	private double balance;

    public Account(double initialBalance){
        if(initialBalance > 0.0)
        balance = initialBalance;
    }
    public void credit(double amount) {
    	balance= balance + amount;
    }
    public void debit(double amount) {
    	balance = balance - amount;
    	
    	if(amount > balance) {
    		System.out.println("debit exceeded the balance");
    	}
    }
    public double getBalance() {
        return balance;
    }
    
}
