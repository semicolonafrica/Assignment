package temperatureConversions;

public class Celsius {
	public int fahrenheitToCelsius(int fahrenheit) {
		return (int) (5.0 / 9.0 * (fahrenheit - 32));
	}
	
	public int celsiusToFahrenheit(int celsius) {
		return (int) (9.0 / 5.0 * celsius + 32);
	}

}
