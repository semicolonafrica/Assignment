package chapter8.exercises;

import java.util.Scanner;

public class SavingsAccount {

		public static Scanner input = new Scanner(System.in);
		private static double annualInterestRate;
		private double savingsBalance;
		
		
		public SavingsAccount(double savingsBalance) {
			
			this.savingsBalance = savingsBalance;
		}


		public static double getAnnualInterestRate() {
			return annualInterestRate;
		}


		public static void setAnnualInterestRate(double annualInterestRate) {
			SavingsAccount.annualInterestRate = annualInterestRate;
		}


		public double getSavingsBalance() {
			return savingsBalance;
		}


		public void setSavingsBalance(double savingsBalance) {
			this.savingsBalance = savingsBalance;
		}
		
		
		public double calculateMonthlyInterest() {
			double interest = (savingsBalance * getAnnualInterestRate()) / 12;
			
			return interest;
		}
		
		public double modifySavingsBalance() {
			savingsBalance += calculateMonthlyInterest();
			return savingsBalance;
		}
		
		public static double modifyInterestRate() {
			annualInterestRate = input.nextDouble();
			return annualInterestRate;
		}
}
