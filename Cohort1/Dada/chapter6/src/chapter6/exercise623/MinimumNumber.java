package chapter6.exercise623;

import java.util.Scanner;

public class MinimumNumber {
	
	public float minimum3(float firstNumber, float secondNumber, float thirdNumber) {
		
		
		float minimumNumber = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
		
		return minimumNumber;
		
		
		
		
	}
	public void minimum() {
Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number or -1 to exit the application: ");
		float firstNumber = input.nextFloat();
		
		while(firstNumber != -1) {
		
			System.out.print("Enter second number: ");
			float secondNumber = input.nextFloat();
			
			System.out.print("Enter third number: ");
			float thirdNumber = input.nextFloat();
			
			float minimumNumber = minimum3(firstNumber, secondNumber, thirdNumber);
			
			System.out.println("The smallest number between " + firstNumber
					+ ", " + secondNumber + " and " + thirdNumber + " is " + minimumNumber);
			
			System.out.print("Enter first number or -1 to exit the application: ");
			firstNumber = input.nextFloat();
			
			if(firstNumber == -1) {
				System.out.println("You have exit the application");
				
			}
		}
		
		
	}

}
