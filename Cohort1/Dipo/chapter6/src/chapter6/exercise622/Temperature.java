package chapter6.exercise622;
import java.util.Scanner;
public class Temperature {
	
	public static void convertTemperature() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Temperature in fehrenheit: ");
		double fahrenheit = input.nextInt();
		
		System.out.println("Enter Temperature in celcius: ");
		double celsius = input.nextInt();
		
		//if(temperature >= 32 && temperature <= 212 ) {
		System.out.println("The Temperature in celcius is " + Temperature.convertCelsius(fahrenheit));
		//}
		
		//if(temperature >= 0 && temperature <= 100) {
		System.out.println("The Temperature in fahrenheit is " + Temperature.convertFahrenheit(celsius));
		//}
		
		
	}
	
	public static double convertCelsius(double fahrenheit) {
		
		double celsius = 5.0/9.0 * (fahrenheit - 32);
		
		return celsius;
	}
	
	public static double convertFahrenheit(double celsius) {
		
		double fahrenheit = 9.0/5.0 * (celsius + 32);
		
		return fahrenheit;
	}
	
	

}
