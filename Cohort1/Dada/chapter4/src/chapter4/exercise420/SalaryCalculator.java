package chapter4.exercise420;

import java.util.Scanner;
public class SalaryCalculator {
	double hourlyRate = 0;
	int numbersOfHoursWorked = 0;
	double grossPay = 0;
	int numberOfEmployee = 3;
	double overtime = 0;

	public void calculateGrossPay() {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		
		while(counter < numberOfEmployee) {
			System.out.println("Enter number of hours worked: ");
			numbersOfHoursWorked = input.nextInt();
			System.out.println("Enter number of hourly rate: ");
			hourlyRate = input.nextDouble();
			
			if(numbersOfHoursWorked <= 40) {
				grossPay = hourlyRate * numbersOfHoursWorked;
				System.out.printf("Gross Payment is: %.2f%n", grossPay);
//				return grossPay;
				
			}
			else if (numbersOfHoursWorked > 40) {
				overtime = numbersOfHoursWorked - 40;
				overtime = overtime * hourlyRate * 0.5;
				grossPay = (hourlyRate * 40) + overtime;
				System.out.printf("Gross Payment is: %.2f%n", grossPay);
//				return grossPay;
			}
			counter++;
		}
//		return grossPay;
		
		
	}

}
