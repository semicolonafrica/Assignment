package Chapter6.exercise6_22;

public class TemperatureConvertor {
	
	
		public static double getCelsius(double fahrenheit) {
			
			double celsius = 5.0 / 9.0 * (fahrenheit - 32);
			return celsius;
		}
		
		public static double getFahrenheit(double celsius) {
			
			double fahrenheit = 9.0 / 5.0 * celsius + 32;
			return fahrenheit;
		}
}
