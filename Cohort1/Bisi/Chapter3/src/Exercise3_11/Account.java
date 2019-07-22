package Exercise3_11;


public class Account {
	 private String name; 
	 private double balance;
		 
	 public Account(String name, double balance) {
	 this.name = name;				
	 	if (balance > 0.0) { 
	 		this.balance = balance; 
	 	}
	 }		
	 public void deposit(double depositAmount) {
		 if (depositAmount > 0.0) { 
			 balance = balance + depositAmount; 
	 	}
	 }		 
	 public void withDraw(double withdrawAmount) {
		 if(withdrawAmount > balance) {
			 balance = balance;
			 System.out.println("Withdrawal amount exceeded account balance");
			 }
		 else if(withdrawAmount < balance) {
			 balance = balance - withdrawAmount;
		 }
	 }
	 public double getBalance() {
		 return balance;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return name;
	 }
	 public static void displayAccount(Account accountToDisplay) {
		 // place the statement that displays
		 // accountToDisplay's name and balance here
		 }
}


