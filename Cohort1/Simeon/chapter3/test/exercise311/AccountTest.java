package exercise311;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Account count1 = new Account("Jane Tola", 45.00);
		Account count2 = new Account("Simeon Akola", -67.45);
		
		// display initial balance of each object
		System.out.printf("%s balance: $%.2f%n", 
				count1.getName(), count1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
				count2.getName(), count2.getBalance());
		
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
		
		System.out.print("Enter amount to withdraw: ");
		double withdrawAmount = input.nextDouble();
		
		System.out.printf("%nsubtracting %.2f from count1 balance%n%n",
				withdrawAmount);
		count1.withdraw(withdrawAmount);
		
		System.out.print("Enter amount to withdraw: ");
		withdrawAmount = input.nextDouble();
		
		System.out.printf("%nsubtracting %.2f from count2 balance%n%n",
				withdrawAmount);
		count2.withdraw(withdrawAmount);
		
		
		// display balances
		System.out.printf("%s balance: $%.2f%n", 
			count1.getName(), count1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", 
			count2.getName(), count2.getBalance());
				

		input.close();
	} // end method main

} // end class AccountTest
