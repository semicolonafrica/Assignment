package chapter6_exercises;

import java.util.Scanner;

public class TemperatureConversion {
//Exercise 6.22
//Program written by Oyemade Temitope
//20th of June 2019
//Program to perform temperature conversion
	
	public static double celsius(int fahrenheit) {
		
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		return celsius;
	}
	
	public static double fahrenheit(int celsius) {
		
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		
		return fahrenheit;
	}
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 for Fahrenheit or 2 for Celsius ");
		int choice = input.nextInt(3);
		
		if(choice ==1) {
			System.out.println("Enter Fahrenheit value");
			int fahreinheit = input.nextInt();
			System.out.printf("%.2f\u00B0C",celsius(fahreinheit));
		}
		
		
		if(choice == 2) {
			System.out.println("Enter celsius value");
			int celsius = input.nextInt();
			System.out.printf("%.2f\u00B0F", (fahrenheit(celsius)));
		}
		input.close();

	}

}
