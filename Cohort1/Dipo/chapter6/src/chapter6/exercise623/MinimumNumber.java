package chapter6.exercise623;
import java.util.Scanner;
public class MinimumNumber {
	
	public static void minimum3() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		float num1 = input.nextInt();
		System.out.println("Enter num2: ");
		float num2 = input.nextInt();
		System.out.println("Enter num3: ");
		float num3 = input.nextInt();
		
		System.out.println("The minimum number is  " + MinimumNumber.minimum3(num1, num2, num3));
		
		
		
	}
	
	
	public static float minimum3(float num1, float num2, float num3) {
		
		float minimum = Math.min(num1, Math.min(num2, num3));
		
		return minimum;
	}

}
