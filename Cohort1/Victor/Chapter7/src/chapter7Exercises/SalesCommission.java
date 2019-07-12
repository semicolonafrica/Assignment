package chapter7Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class SalesCommission {
	
	public static void generateCommission() {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of sales persons");
		int numberOfSalesPersons = input.nextInt();
		
		int [] frequency = new int [11];
		int [] sales = new int [numberOfSalesPersons]; 
		
		for(int roll=0; roll <sales.length; roll++) {
			
			sales [roll]= 200 + randomNumbers.nextInt(1000);
				if(sales[roll]/100>=10)
					++frequency[10];
				else
					++frequency[sales[roll]/100];
		}
		System.out.printf("%s\t%s%n", "Range", "Sales Persons");
		for (int salesNumber = 2; salesNumber<frequency.length; salesNumber++) {
			System.out.printf("%d%s%d%10d%n",salesNumber*100,"-",salesNumber*100+99,frequency[salesNumber]);
		}
	}
	public static void main(String[]args) {
		SalesCommission.generateCommission();
	}
	

}
