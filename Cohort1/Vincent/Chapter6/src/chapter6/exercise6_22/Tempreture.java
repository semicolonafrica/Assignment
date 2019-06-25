package chapter6.exercise6_22;

import java.util.Scanner;

public class Tempreture {
	
	public static void convertTempreture() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter celsius:");
		double celsius = input.nextDouble();
		
		System.out.println("enter fahrenheit");
		double fahrenheit = input.nextDouble();
		
		System.out.printf("The tempreture in farenheit: %f\n",Tempreture.calculatecelsius(fahrenheit));
		System.out.printf("The tempreture in celsius: %f",Tempreture.calculatefarenheit(celsius));
	
	}

	
	public static double calculatefarenheit(double  celsius) {
		 
		double fahrenheit = 5.0 / 9.0 * (celsius - 32);
		return celsius;
	}
	
	public static double calculatecelsius(double fahrenheit) {
	
		double celsius = 9.0 / 5.0 * (fahrenheit + 32);
		return fahrenheit;		

	}
	
	

}
