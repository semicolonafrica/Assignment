package chapter6.chapter6_Group;
import java.util.Scanner;
public class TemperatureImplementation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type 1: to convert from Celcius to Fahrenheit");
		System.out.println("Type 2: to convert from Fahrenheit to Celcius");
		
		int picker = input.nextInt();
		if(picker <1 || picker > 2) {
			System.out.println("Wrong, See the instruction displayed above,");
			
			picker = input.nextInt();
		}
		
		System.out.println("Enter Temperature ");
		int controller = input.nextInt();
		
		if(controller == 1) {
			System.out.println("Converting your temperature from: " + controller + "F to " + Temperature.celcius(controller) + "C");
		}
		else {
			System.out.println("Converting your temperature from: " + controller + "C to " + Temperature.fahrenheit(controller) + "F");

		}

	}

}
