package chapter6.chapter6_Group;

public class Temperature {

	// Conversion from Fahrenheit to Celcius.
	public static double celcius(int fahrenheit) {
		double celcius = 5.0 / 9.0 * (fahrenheit - 32);
		
		return celcius;

	}
	
	//Conversion from Celcius to Fahrenheit.
	public static double fahrenheit(int celcius) {
		double fahrenheit = 9.0 / 5.0 * celcius + 32;
		
		return fahrenheit;
	}
	
	
}
