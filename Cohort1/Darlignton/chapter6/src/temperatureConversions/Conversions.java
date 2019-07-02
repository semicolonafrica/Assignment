package temperatureConversions;

public class Conversions {
	public static int fahrenheitToCelsius(int fahrenheit) {
		return (int) (5.0 / 9.0 * (fahrenheit - 32));
	}
	
	public static int celsiusToFahrenheit(int celsius) {
		return (int) (9.0 / 5.0 * celsius + 32);
	}

}



//Use the methods from parts (a) and (b) to write an application that enables the user ei-
//ther to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
//Celsius temperature and display the Fahrenheit equivalent.