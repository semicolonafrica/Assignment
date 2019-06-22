package chapter6Exercises;

import java.util.Scanner;

public class Temperature {
	
	public static void convertTemperarture() {
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("Enter Temperature in fahrenheit");
		double fahrenheit = input.nextInt();
		System.out.println("Enter Temperature in celsius");
		double celsius = input.nextInt();
				
			System.out.println("Fahrenheit to celsius is: "+ Temperature.celsius(fahrenheit));	

			System.out.println("Celsius to fahrenheit is: " +Temperature.fahrenheit(celsius));	
	
	}
	
	public static double celsius(double fahrenheit) {
		double celsius = 5.0 / 9.0 * (fahrenheit- 32);
		return celsius;
	}
	public static double fahrenheit(double celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;
	}
	
}
