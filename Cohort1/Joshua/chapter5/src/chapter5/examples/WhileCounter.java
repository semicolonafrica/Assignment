/**
 * 
 */
package chapter5.examples;

/**Fig. 5.1: Whilecounter.java
 * counter controlled repetition with the while repetition statement
 * @author user
 *
 */
public class WhileCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0; // declare and initialize control variable
		while(counter <= 10) { //loop continuation condition
			System.out.printf("%d  ", counter);
			counter++; // counter increment
		}
 System.out.println();
	}

}
