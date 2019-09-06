package examples;

/** Fig 1.8 Comparison
compare integers using if statements, relational operators
and equality operators */
/** Author: Simeon O.
Created: 30'04'2019, 4.07PM */

import java.util.Scanner; // program uses class scanner

public class Comparison {
    
	// main method begins execution of Java application
    public static void main(String[] args) {
        //create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // readfirst numbeer from user

        System.out.print("Enter Second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user

        if (number1 == number2) {
        	System.out.printf("%d == %d%n", number1, number2); // read if both are equal
        }

        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2); // read if both are not equal
        }

        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2); // read if number 1 is great than number 2
        }

        if (number1 > number2) {
            System.out.printf("%d < %d%n", number1, number2); // read if number 1 is less than number 2
        }

        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2); // read if number 1 is greater than or equals to number 2
        }

        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2); // read if number 1 is less than or equals to number 2
        }
        
        input.close();
    } // end main method
} // end class Comparison
