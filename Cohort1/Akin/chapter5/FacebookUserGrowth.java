package chapter5.exercise518;

import java.util.Scanner;

public class FacebookUserGrowth {

	private int principal;
	private double rate;
	private int numberOfMonths;
	
	public FacebookUserGrowth(int principal, double rate, int numberOfMonths) {
		this.principal = principal;
		this.rate = rate;
		this.numberOfMonths = numberOfMonths;
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	public static double calculateMonth() {
		
		Scanner input = new Scanner(System.in);
		

		double amount = 0.0; 
		
		System.out.print("Enter the initial principal: ");
		int principal = input.nextInt();
		
		System.out.print("Enter the rate: ");
		double rate = input.nextDouble() / 100;
		
		System.out.print("Enter the number of months: ");
		int month = input.nextInt();
		
		System.out.printf("%n%s%15s", "month", "New Principal");
		System.out.println();
		for(int i = 0; i <= month; i++) {
			
			amount = principal * Math.pow(1 + rate, i);
			
			System.out.printf("%d%10.2f%n", month,amount);
			
		}
		input.close();
		return amount;
	}
	
	
	
}
