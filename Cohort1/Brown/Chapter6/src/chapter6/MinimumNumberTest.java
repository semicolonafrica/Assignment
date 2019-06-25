package Chapter6.exercise6_23;

import java.util.Scanner;

public class MinimumNumberTest {

	public static void main(String[] args) {
		
		System.out.println("Enter three diffrent floating numbers /n to get the smallest");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first Floating point value: ");
		float num1 = input.nextFloat();
		
		System.out.println("Enter second Floating point value: ");
		float num2 = input.nextFloat();
		
		System.out.println("Enter third Floating point value: ");
		float num3 = input.nextFloat();
		
		MinimumNumber.calcMinimumNumber(num1, num2, num3);
		System.out.println("The minimum of the three numbers is " + MinimumNumber.calcMinimumNumber(num1, num2, num3));

	}

}
