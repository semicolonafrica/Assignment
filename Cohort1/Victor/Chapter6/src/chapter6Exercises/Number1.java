package chapter6Exercises;

import java.util.Scanner;

public class Number1 {
	
	public static void minimum3() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers(whole or decimal");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float number3 = input.nextFloat();
		
		System.out.println("Minimum input is: "+Number1.minimum3(number1, number2, number3));
//		
		input.close();
	}
	public static float minimum3(float number1, float number2, float number3) {
	
		float minimumNumber1 = (float) Math.min(number1, Math.min(number2, number3));
		return minimumNumber1;
	}

}
