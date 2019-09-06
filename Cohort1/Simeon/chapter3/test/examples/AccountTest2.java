package examples;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {

		Account2 count1 = new Account2("Jane Tola", 45.00);
		Account2 count2 = new Account2("Simeon Akola", -67.45);
		
		// display initial balance of each object
		displayAccount(count1);
		displayAccount(count2); 
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for count1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		
		System.out.printf("%nadding %.2f to count1 balance%n%n",
				depositAmount);
		count1.deposit(depositAmount); // add to count1's baance
		
		// display balances
		System.out.printf("%s balance: $%.2f%n", 
				count1.getName(), count1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				count2.getName(), count2.getBalance());
		
		System.out.print("Enter deposit amount for count2 "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		
		System.out.printf("%nadding %.2f to count2 balance%n%n",
				depositAmount);
		count2.deposit(depositAmount); // add to count1's baance
		
		// display balances
		System.out.printf("%s balance: $%.2f%n", 
				count1.getName(), count1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				count2.getName(), count2.getBalance());

		input.close();
	} // end method main
	
	public static void displayAccount(Account2 accountToDisplay) {
		System.out.printf("%s balance: $%.2f%n", 
				accountToDisplay.getName(), accountToDisplay.getBalance());
		
	}

} // end class Account2Test
