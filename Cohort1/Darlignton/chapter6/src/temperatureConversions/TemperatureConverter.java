package temperatureConversions;

import java.util.Scanner;

public class TemperatureConverter {
	Scanner input = new Scanner(System.in);
	
	//private enum Status { CELSIUS, FAHRENHEIT};
	
//	private static final int TO_CELSIUS = 1;
//	private static final int TO_FAHRENHEIT = 2;
	
	public void convertTemperature() {
		
		//Status temperatureStatus;
		
		System.out.print("Enter 1 to convert to Celcius, Enter 2 to convert to fahrenheit");
		int convertTo = input.nextInt();
		
		switch(convertTo) {
		case 1:
			System.out.print("Enter temperature to convert to celsius: ");
			int fahrenheit = input.nextInt();
			System.out.printf("%d degree fahrenheit = %d degree celsius ", Conversions.fahrenheitToCelsius(fahrenheit));
			break;
			
		case 2:
			System.out.print("Enter temperature to convert to fahrenheit: ");
			int celsius = input.nextInt();
			System.out.printf("%d degree celsius = %d degree fahrenheit",celsius, Conversions.celsiusToFahrenheit(celsius));
			break;
		}
		
	}
}