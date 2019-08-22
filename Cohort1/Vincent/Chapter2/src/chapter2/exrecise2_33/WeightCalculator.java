package chapter2.exrecise2_33;

import java.util.Scanner;
//BMI VALUES
//Underweight: less than 18.5
//Normal: between 18.5 and 24.9
//Overweight: between 25 and 29.9
//Obese: 30 or greater

public class WeightCalculator {

	public static void main(String[] args) {
		
       Scanner input = new Scanner(System.in);
       System.out.println("BMI VALUES\n\nUnderweight: less than 18.5\nNormal: between 8.5 and 24.9\nOverweight: between 25and 29.9\nObese: 30and greater");
       
       Double bodyIndex;
       System.out.println();
		
		
		System.out.println("enter number");
		double weightKilo = input.nextDouble();
		System.out.println("enter number");
		double heightMet = input.nextDouble();
		
		double height = Math.sqrt(heightMet);
		
		bodyIndex = weightKilo / height;
		
		System.out.println( bodyIndex);
		
		
		if(bodyIndex < 18.5)
			System.out.println("You are Underweight!");
		else if(bodyIndex == 18.5 || bodyIndex < 24.9)
			System.out.println("your weight is Normal");
		else if(bodyIndex == 25 || bodyIndex < 29.9)
			System.out.println("You are Overweight");
		else if(bodyIndex >= 30)
			System.out.println("obesity");
		else
			System.out.println();
		
		
		
	}

}
