package exercise233;

import java.util.Scanner;

public class BodyMassIndexCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int weight;
		double height;

		System.out.print("Enter your weight(in Kilograms): ");
		weight = input.nextInt();
		
		System.out.print("Enter your height(in Meters): ");
		height = input.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.printf("YOUR BMI VALUE:\t%.1f%n", bmi);
		System.out.println();
		
		System.out.println("BMI VALUES");
		System.out.println("Underweight:\tless than 18.5");
		System.out.println("Normal:\tbetween 18.5 and 24.9");
		System.out.println("Overweight:\tbetween 25 and 29.9");
		System.out.println("Obese:\t30 or greater");
		
		input.close();
	}

}
