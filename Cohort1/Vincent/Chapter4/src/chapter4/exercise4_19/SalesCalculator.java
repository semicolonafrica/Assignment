package chapter4.exercise4_19;
import java.util.Scanner;
public class SalesCalculator {
	
	public int calculateSales() {
		int total = 0; 
		int amountSold = 0;
		double commision= 0.9;
		double salary;
		int fixedSalary = 200;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount sold for each item");
		amountSold = input.nextInt();
		
			while(amountSold != -1) {
				total = total + amountSold;
				System.out.println(total);
				
			System.out.println("Enter amount sold for each item");
			amountSold = input.nextInt();
			}
			
			 salary = total * 0.9;
			 salary += fixedSalary;
			 System.out.printf("the salary for salesPerson is: %.2f", salary);
			return amountSold;
	}

}
