package Chapter6.exercise6_22;
import java.util.Scanner;
public class TemperatureConvertorTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter temperature value in fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		
		TemperatureConvertor.getCelsius(fahrenheit);
		System.out.println(fahrenheit + " degrees fahrenheit is equal to " + TemperatureConvertor.getCelsius(fahrenheit) + " degrees celcius"  );
		
		
		System.out.println("Enter temperature value in celsius: ");
		double celsius = input.nextDouble();
		
		
		TemperatureConvertor.getFahrenheit(celsius);
		System.out.println(celsius + " degrees celsius is equal to " + TemperatureConvertor.getFahrenheit(celsius) + " degrees fahrenheit"  );
		
		
	}

}
