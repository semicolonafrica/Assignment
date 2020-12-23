/**
 * 
 */
package exercises;

/**Pseudocode(Exercise 5.13)
 * determine the factorial of 1 - 20
 * initialize a variable, fact of type long
 * print number in tabular form
 * for(counter = 1; counter<=20; counter++)
 * fact = fact *counter;
 * print in tabular form
 * @author Group 2 (Me and Christian)
 *
 */
public class Factorials {

	
	public static void main(String[] args) {
		long fact = 1;
		System.out.println("\tNumber" + "\tResult");
		
		for(int counter = 1; counter <= 20; counter++) {
			fact = fact * counter;
		System.out.println("\t" + counter + "\t" + fact);
		}
// The difficulty is the occurrence of negative and positive results from 21! to 64!, then zero from 65! to 100!
	}

}
