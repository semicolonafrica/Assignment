package exercise6_22;

public class Temperature {

	public static double fahrenheit(double celsius) {
		
		double fahrenheit = ((9.0 / 5.0) * celsius) + 32;
		
		return fahrenheit;
	}
	
	public static double celsius(double fahrenheit) {
		
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		
		return celsius;
	}
	
	
}
	