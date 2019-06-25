package chapter6.exercise622;


public class Temperature {
	
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

}
