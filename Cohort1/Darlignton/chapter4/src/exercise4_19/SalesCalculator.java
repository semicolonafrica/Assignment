package chapter4.exercise4_19;


import java.util.Scanner;

public class SalesCalculator {

	public double calculateSales() {
		
		double numberOfSales;
		double salary;
		double salesAmount;
		double total = 0;
		
		
		salary = 200;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter numberOfsales");
		numberOfSales = input.nextInt();
		
		int salesCounter = 0;

		while(salesCounter < numberOfSales) {
			
			System.out.print("enter amount");
			salesAmount = input.nextInt();
			salesAmount = salesAmount * 0.09;
			total = total + salary;
			salesCounter++;	
		}
		
		return total;
	}		
	
}