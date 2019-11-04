package exercise8_6;

import java.util.Scanner;

public class SavingsAccountTest {

	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		SavingsAccount saver1 = new SavingsAccount(2000.00,4);
		SavingsAccount saver2 = new SavingsAccount(3000.00,4);
		
		System.out.println("Enter number of months: ");
		int noOfMonths = insert.nextInt();
		
		
		
		System.out.println("New balance for saver1 is: " + saver1.calculateMonthlyInterst(noOfMonths));
		
		System.out.println("New balance for saver2 is: " + saver2.calculateMonthlyInterst(noOfMonths));
		
		
		System.out.println("Enter next month: ");
		int nextMonth = insert.nextInt();
		
		SavingsAccount.modifyAnnualInterestRate(5);
		
		System.out.println("New balance for saver1 is: " + saver1.calculateMonthlyInterst(nextMonth));
		
		System.out.println("New balance for saver2 is: " + saver2.calculateMonthlyInterst(nextMonth));
		
		
		

	}

}
