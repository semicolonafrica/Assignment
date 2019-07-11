package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class Temperature {

	private static boolean correct;

	public static double checkCelcius(double x) {

		double celcius = 5.0 / 9.0 * (x - 32);

		return celcius;
	}

	public static double checkFahrenheit(double y) {

		double fahrenheit = 9.0 / 5.0 * (y + 32);

		return fahrenheit;
	}

	public static void checkTemperature(double y) {
		if (correct == false) {
			System.out.println(checkFahrenheit(y));
		}

		else {
			System.out.println(checkCelcius(y));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Temperature ");
		double value = input.nextDouble();

		System.out.println("Enter true(celcius) or false(fahrenheit) ");
		correct = input.nextBoolean();

		checkTemperature(value);
//		checkFahrenheit(value);
//		checkCelcius(value);
	}
}