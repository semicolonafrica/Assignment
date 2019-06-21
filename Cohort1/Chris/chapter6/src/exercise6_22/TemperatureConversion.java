package exercise6_22;

import java.util.Scanner;

public class TemperatureConversion {
	
	public static double celsius(double fahrenheit) {
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		return celsius;
	}
	
	public static double fahrenheit(double celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1 to convert to fahrenheit or 2 to convert to celsius: ");
		int enter = input.nextInt();
		
		while(enter < 0 || enter > 2) {
			System.out.println("\nError!! Enter 1 to convert to fahrenheit or 2 to convert to Celsius: ");
			enter = input.nextInt();
			
		}
		
		if(enter == 1) {

			System.out.println("\nEnter temperature: ");
			double temp = input.nextDouble();
			System.out.println("\nFahrenheit equivalent is: "+ TemperatureConversion.fahrenheit(temp)+" degrees F");
		}else if(enter == 2){
			

			System.out.println("\nEnter temperature: ");
			double temperature = input.nextDouble();
			System.out.printf("%nCelsius equivalent is: %.2f%s",TemperatureConversion.celsius(temperature)," degrees C");
			input.close();
		}else {
			
		}
	}

}
