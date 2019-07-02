package exercise6_22;

public class Temperature {  
	public static double celsius(int fahrenheit) {
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		return celsius;
	}
	
	public static double fahrenheit(int celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return fahrenheit;
	}
}
