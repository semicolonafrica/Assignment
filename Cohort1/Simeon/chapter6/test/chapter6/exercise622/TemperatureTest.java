package chapter6.exercise622;

import java.util.Scanner;

public class TemperatureTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input the value to convert: ");
		
		double temp = input.nextDouble();
		
		System.out.println("Enter true for Fahrenheit: ");
		 boolean exact = input.nextBoolean();
		 
		 if(exact == true) {
			 System.out.println(Temperature.calfahrenheit(temp));
		 }
		 else {
			 System.out.println(Temperature.calCelsius(temp));
		 }
		 
		input.close();

	}


}
