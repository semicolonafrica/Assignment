package chapter6.exercise622;

import java.util.Scanner;
public class TemperatureConversion {
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Enter symbol of temperature to convert: ");
		char symbol = input.next().charAt(0);
		if ((symbol == 'F') || (symbol == 'f')  ) {
		System.out.println("Celsius equivalent: " + celsius() + " C");
		}
		if ((symbol == 'C') || (symbol == 'c')  ) {
		System.out.println("fahrenheit equivalent: " + fahrenheit() + " F");
		}
	}
	public static double celsius() {
		//Scanner input = new Scanner (System.in);
		System.out.println("Enter value of fahrenheit temperature: ");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		return celsius;
		
	}
	public static double fahrenheit() {
		//Scanner input = new Scanner (System.in);
		System.out.println("Enter value of celsius temperature: ");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0 / 5.0 * celsius) + 32;
		return fahrenheit;
		
	}

}
