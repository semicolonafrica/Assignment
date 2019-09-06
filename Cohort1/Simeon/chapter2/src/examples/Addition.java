package examples;

//Fig 1.6: Addition.java
//Adding numbers using Integers
/** Author: Simeon O.
Created: 30'04'2019, 10.46AM */

import java.util.Scanner; // program uses class scanner

public class Addition {
 
	// main method begins execution of Java Application
	public static void main(String[] args) {
     
		// create scanner to obtain the first input from the command window
     	Scanner input = new Scanner (System.in);

     	System.out.print("Enter first integer: "); // prompt
     	int number1 = input.nextInt(); // read first number from user

     	System.out.print("Enter second integer: "); // prompt
     	int number2 = input.nextInt(); // read second number from user

     	int sum = number1 + number2; // add numbers, then store total sum

     	System.out.printf("Sum is %d%n", sum); 
     	
     	input.close(); // display sum
	
	} // end main method
} // end class addition