package exercise5_32;

import java.util.Scanner;

public class Expenses {

	private double housing;
	private double food;
	private double clothing;
	private double transportation;
	private double education;
	private double healthCare;
	private double vacation;
	
	public double calculateFairTax() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Enter expense category or -1 to terminte input",
				"1- Housing", "2- Food","3- Clothing", "4- Transportation", "5- Education","6- Health Care", "7- Vacation");
		int category = input.nextInt();
		double expenses;
		double totalExpenses = 0;
		double estimatedFairTax;
		
		while(input.hasNext()) {
			
			switch(category) {
			
			case 1:
				System.out.println("Enter all housing expenses or -1 to end: ");
				expenses = input.nextDouble();
				while(expenses != -1) {
					housing += expenses;
					expenses = input.nextDouble();
				}
				System.out.println("Total expenses on housing " +housing);
				System.out.println();
				break;
				
			case 2:
				System.out.println("Enter all food expenses or -1 to end: ");
				expenses = input.nextDouble();
				while(expenses != -1) {
					food += expenses;
					expenses = input.nextDouble();
				}
				System.out.println("Total expenses on food " +food );
				System.out.println();
				break;
				
			case 3:
				System.out.println("Enter all clothing expenses or -1 to end: ");
				expenses = input.nextDouble();
				while(expenses != -1) {
					clothing += expenses;
					expenses = input.nextDouble();
				}
				System.out.println("Total expenses on clothing " +clothing);
				System.out.println();
				break;
				
			case 4:
				System.out.println("Enter all transportation expenses or -1 to end: ");
				expenses = input.nextDouble();
				while(expenses != -1) {
					transportation += expenses;
					expenses = input.nextDouble();
				}
				System.out.println("Total expenses on transportation ");
				System.out.println();
				break;
				
			case 5:
				System.out.println("Enter all  expenses on education or -1 to end: ");
				expenses = input.nextDouble();
				while(expenses != -1) {
					education += expenses;
					expenses = input.nextDouble();
				}
				System.out.println("Total expenses on education ");
				System.out.println();
				break;
				
			case 6:
				System.out.println("Enter all expenses on healthcare or -1 to end: ");
				expenses = input.nextDouble();
				while(expenses != -1) {
					healthCare += expenses;
					expenses = input.nextDouble();
				}
				System.out.println("Total expenses on healthCare ");
				System.out.println();
				break;
	  			
			case 7:
				System.out.println("Enter all expenses on vacation or -1 to end: ");
				expenses = input.nextDouble();
				while(expenses != -1) {
					vacation += expenses;
					expenses = input.nextDouble();
				}
				System.out.println("Total expenses on vacation ");
				System.out.println();
				break;
				
				default: 
					break;
				
				
			}
			
			
			System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Enter expense category or -1 to terminte input",
					"1- Houing", "2- Food","3- Clothing", "4- Transportation", "5- Education","6- Health Care", "7- Vacation");
			category = input.nextInt();
			
		}
			totalExpenses = housing + food + clothing + transportation + education + healthCare + vacation;
			estimatedFairTax = totalExpenses * 0.23;
			
			input.close();
			
			return estimatedFairTax;
			
			
		
	}
	
}
