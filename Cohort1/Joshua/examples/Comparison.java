/**Fig. 2.15: Comparison.java
 * Compare integers using if statements , relational operators and equality operators.
 */

/**
 * @author Joshua
 *
 */
import java.util.Scanner;

public class Comparison {
	
// Main method begins execution of java application.
	public static void main(String[] args) {
		
		// create scanner to obtain input from command line.
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to compare
		int number2; // second number to compare
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); //read first number from user
		
		System.out.print("Enter second number: "); // prompt
		number2 = input.nextInt(); // read second number from user.
		
		
		if(number1 == number2)
			System.out.printf(" %d == %d%n" , number1, number2);
		
		if(number1 != number2)
			System.out.printf(" %d != %d%n" , number1, number2);
		
		if(number1 < number2)
			System.out.printf(" %d < %d%n" , number1, number2);
		
		if(number1 > number2)
			System.out.printf(" %d > %d%n" , number1, number2);
		
		if(number1 <= number2)
			System.out.printf(" %d <= %d%n" , number1, number2);
		
		if(number1 > number2)
			System.out.printf(" %d >= %d%n" , number1, number2);
		
		
		
	}// end method main

} // end class comparison
