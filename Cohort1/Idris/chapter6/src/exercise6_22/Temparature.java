package exercise6_22;

public class Temparature {
	public static double calculateCelcius(double a) {
		double celsius = 5.0/9.0*(a - 32);
		return celsius;
	}
	public static double calculateFahrenheit(double b) {
		double fahrenheit = 9.0 / 5.0 * b + 32;
		return fahrenheit;
	}

}
