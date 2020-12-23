package chapter6.exercise622;

import java.util.Scanner;

public class TemperatureConversions {

		public double convertToCelsius(double fahrenheit) {
			double celsius = (5.0/9.0) * (fahrenheit - 32);
			return celsius;
		}
		
		public double convertToFahrenheit(double celsius) {
			double fahrenheit = (9.0/5.0) * (celsius - 32);
			return fahrenheit;
			
		}
		Scanner input = new Scanner(System.in);
		public void temperatureConversion() {
			System.out.println("To convert to celsius enter 1 or 2 for fahrenheit: ");
			int number = input.nextInt();
				
			if(number == 1) {
				System.out.println("Enter temperature in fahrenheit: ");
				double fahrenheit = input.nextDouble();
				double displayCelsius = convertToCelsius(fahrenheit);
//				System.out.println(displayCelsius);
				System.out.printf("Temperature in celsius is: %.2f", + displayCelsius);
				
			}
			else if(number == 2) {
				System.out.println("Enter temperature in celsius: ");
				double celsius = input.nextDouble();
				double displayFahrenheit = convertToFahrenheit(celsius);
//				System.out.println(displayFahrenheit);
				System.out.printf("Temperature in fahrenheit is: %.2f", + displayFahrenheit);
				
			}
		} 
}

