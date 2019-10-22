package chapter5.example;

/** Classwork for chapter5
 * 
 * @author Dipo
 *
 */
import java.util.Scanner;
public class Calculator {
	
	public double calculateInterest() {
		int principal;
		double rate;
		int year;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal");
		principal = input.nextInt();
		System.out.println("Enter rate");
		rate = (double)input.nextInt()/100;
		System.out.println("Enter year");
		year = input.nextInt();
		
		double amount = 0;
		double calRate = 1;
	
		
		for(double i = 0.05; i <= rate; i += 0.01) {
			for(int j = 1; j <= year; j++) {
				
				calRate *=(1 + i);
				amount = principal * calRate;
				System.out.printf("%d\t%.2f\t%5.2f%n",j,(i* 100),amount);
				if(j == year) {
					calRate = 1;
				}
			}
			
			System.out.println();
		}	

		return amount;
		
		
	}
	
		
}
