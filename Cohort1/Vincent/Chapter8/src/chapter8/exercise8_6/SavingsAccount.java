package chapter8.exercise8_6;
//(Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate
//to store the annual interest rate for all account holders. Each object of the class contains a
//private instance variable savingsBalance indicating the amount the saver currently has on deposit.
//Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
//savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
//Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
//value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects,
//saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
//to 4%, then calculate the monthly interest for each of 12 months and print the new balances for
//both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print
//the new balances for both savers.
import java.util.Scanner;
public class SavingsAccount {
	private static double  annualInterestRate;
	private double savingsBalance;
	public SavingsAccount(double  savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double calculateMonthlyInterestRate() {
		
		savingsBalance += savingsBalance * annualInterestRate / 12;
		
		System.out.printf("new balance is: %.2f%n", savingsBalance);
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double annualInterest) {
	     annualInterestRate = annualInterest;
	}

	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the balance to deposit");
		int balance1= input.nextInt();  
		
		SavingsAccount saver1 = new SavingsAccount(balance1);
		
		System.out.println("enter the balance to deposit");
		int balance2 = input.nextInt();  
		SavingsAccount saver2 = new SavingsAccount(balance2);
		
		SavingsAccount.modifyInterestRate(0.4);
		saver1.calculateMonthlyInterestRate();
		
		SavingsAccount.modifyInterestRate(0.4);
		saver2.calculateMonthlyInterestRate();
		
		
	}
}
