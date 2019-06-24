package exercise6_22;
import java.util.Scanner;
public class TemperatureConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Temperature:");
		int temperature = input.nextInt();
		
	//	TemperatureConversion.checkTemperature(temperature, temperature);
	//	System.out.println(TemperatureConversion.fahrenheit(temperature));
		
		System.out.println(TemperatureConversion.celsius(temperature));
	}
}
