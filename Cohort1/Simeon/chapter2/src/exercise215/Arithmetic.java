package exercise215;

/**Ex 2.15 Arithmetic calculations
adding, subtracting and multiplying numbers
Author: Simeon O.
Created: 30'04'2019 11.18AM */

import java.util.Scanner; // program uses class Scanner

public class Arithmetic {
	
	// main method begins Execution of java application
	public static void main(String[] args) {
	
		// create first scanner to obtain input from command window
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user

        int sum = number1 + number2; // add numbers then store total sum

        int subtraction = number1 - number2; // subtract numbers and store answer

        int multiplication = number1 * number2; // multiply both numbers then store answer

        System.out.printf("Sum is %d%nSubtraction is %d%nMultiplication is %d%n", sum, subtraction, multiplication); 
        // display sum, subtraction, multiplication respectively
        
        input.close();

    } // end main method
} // end class Arithmetic