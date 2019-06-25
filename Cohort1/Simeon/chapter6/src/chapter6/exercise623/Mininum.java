package chapter6.exercise623;

import java.util.Scanner;

public class Mininum {
	
	public static float minimum3() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		float x = input.nextFloat();
		
		System.out.print("Enter first value: ");
		float y = input.nextFloat();
		
		System.out.print("Enter first value: ");
		float z = input.nextFloat();
		
		float result = Math.min(x, y);
		
		result = Math.min(result, z);
		
		input.close();
		
		return result;
	}

}
