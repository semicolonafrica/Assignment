/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Exercise7, Question 7.15
 Purpose: for commandline argument
*/

package chapter7.exercise715;

public class CommandLineArgument2 {

	public static void main(String[] args) { //allows the user to enter value in the cmd line
		int value = 0;
		int arrayLength = 10;
	
		if(args.length != 0) {
			value = Integer.parseInt(args[0]); // Convert the String entered in the command line in the position args[0], args[2] etc into integer (i.e. "10" to 10) 
			arrayLength = value; // variable arrayLength is now equal to the value entered 
		}
		else {
			arrayLength = arrayLength; // if no value is entered in the commandline arrayLength should remain 10
		}
		int[] array = new int[arrayLength];	
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		// output each array element's value
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		System.out.println();
	}
}	
