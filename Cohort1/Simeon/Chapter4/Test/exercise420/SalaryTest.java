package exercise420;

import java.util.Scanner;

public class SalaryTest {

	public static void main(String[] args) {
		
		// create scanner object and employee object
		Scanner input = new Scanner(System.in);
		Salary sc = new Salary();
		
		// declare variables
		String name;
		int hours;
		double rates;
		int count = 0;
		
		// calculate for 3 employees 
		while (count != 3) {
			System.out.println("\n-----------------------------\n");
			
			// get inputs from user
			System.out.print("Enter Employee Name: ");
			name = input.nextLine();
			sc.setName(name);
		
			
			
			System.out.print("Enter number of hours worked: ");
			hours = input.nextInt();
			
			System.out.print("Enter hourly rates: ");
			rates = input.nextDouble();
			
			name = input.nextLine();
			
			// sets variables
			
			sc.setHourlyRates(rates);
			sc.setNoOFHours(hours);
			
			System.out.println("\n-----------------------------\n");
			System.out.printf("WORKER %s%n", sc.getName());
			System.out.printf("Hours worked last week: %d%n", sc.getNoOfHours());
			System.out.printf("Rate per hour: %.2f", sc.getHourlyRates());
			System.out.println("\n-----------------------------");
			System.out.printf("Your grossPay: $%.2f", sc.grossPay());
			
			count++;
		}

		input.close();
	}

}
