package chapter6.exercises;

import java.util.Scanner;

public class Minimum {

	
	
	public static float minimum3(float num1, float num2, float num3) {		 
		
		float smallest = Math.min(num1, Math.min(num2, num3));
		
		return smallest;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three floating point numbers you want to compare");
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		float num3 = input.nextFloat();
		
		System.out.printf("The smallest number is %.2f", minimum3(num1, num2, num3));
		input.close();
	}

}
