package exercise4_22;

import java.util.Scanner;

import exercise6_22.Temperature;

public class TemperatureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.printf("Press 1 to convert Fahrenheit - Celcusis%nPress 2 to convert Celsius - Fahrenheit%n");
		int select = in.nextInt();
		
		if(select == 1) {
			System.out.println("Fahrenheit temperature is:");
			double fah = in.nextDouble();
			System.out.printf("Celsius equivalent is: %.2f~C",Temperature.celsius(fah));
		}
		else if (select == 2) {
			System.out.println("Celsius temperature is:");
			double cel = in.nextDouble();
			System.out.printf("Fahrenheit equivalent is: %.2f~F",Temperature.fahrenheit(cel));
		}
		in.close();
	}

}
