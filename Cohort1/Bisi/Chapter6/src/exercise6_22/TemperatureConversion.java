package exercise6_22;

public class TemperatureConversion {
	
	public static double celsius(int number) {		
	
	double celsius = 5.0 / 9.0 * (number - 32);
		System.out.println("This temperature is in C");
		return celsius;
	}
	public static double fahrenheit(int number) {
	
	double fahrenheit = 9.0 / 5.0 * (number + 32);
		System.out.println("This temperature is in F");
		return fahrenheit;
	}
}
