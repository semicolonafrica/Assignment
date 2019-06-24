package exercise622;

import java.util.Scanner;

public class TemperatureConversions {
	
	public static double calCelsius(double fahrenheit) {
		double celsius = 0;
		celsius = 5.0 / 9.0 * (fahrenheit - 32);
		return celsius;
	}
	public static double calfahrenheit(double celsius) {
		double fahrenheit;
		fahrenheit = ((9.0 / 5.0) * celsius) + 32;
		return fahrenheit;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the value to convert: ");
		
		double temp = input.nextDouble();
		
		System.out.println("Enter true for Fahrenheit: ");
		 boolean exact = input.nextBoolean();
		 
		 if(exact == true) {
			 System.out.println(TemperatureConversions.calfahrenheit(temp));
		 }
		 else {
			 System.out.println(TemperatureConversions.calCelsius(temp));
		 }
		 
		input.close();

	}

}
