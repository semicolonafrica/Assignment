/**
 * 
 */
package chapter5.examples;

/**classwork with nonso
 * @author user
 *
 */
import java.util.Scanner;
public class Calculator {
	
	public double calculateInterest() {
		int principal;
		double rate;
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		principal = input.nextInt();
		System.out.println("Enter rate: ");
		rate = (double)input.nextInt()/100;
		System.out.println("Enter year: ");
		year = input.nextInt();
		
		double amount;
		double temp_value = 1.0;
		
		for(int counter = 0; counter < year; counter++) {
			temp_value = temp_value * (1 + rate);
		}
		amount = principal * temp_value;
		System.out.printf("%.2f%n " , amount);
		return amount;
	}
		
}
