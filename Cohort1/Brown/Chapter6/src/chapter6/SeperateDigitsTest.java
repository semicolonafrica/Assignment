package Chapter6.exercise6_21;

import java.util.Scanner;
public class SeperateDigitsTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int a = input.nextInt();
		
		System.out.println("Enter second integer: " );
		int b = input.nextInt();
		
		SeperateDigits.calculateDivision(a,b);
		SeperateDigits.calculateRemainder(a,b);
		
		System.out.println("The Division Integer is " + SeperateDigits.calculateDivision(a,b));
		System.out.println("The Remainder Integer is " + SeperateDigits.calculateRemainder(a,b));
		
		System.out.println("Enter any digit between 1 and 99999: ");
		int num = input.nextInt();
		
		SeperateDigits.displayDigits(num);


	}

}
