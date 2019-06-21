package exercise6_13;
/*statements to display random numbers
 *  from each of the following sets
 */
import java.security.SecureRandom;

public class RandomNumber {

	public static void main(String[] args) {
		
		SecureRandom generate = new SecureRandom();
		// to generate random even numbers between 2 to 10
		int number = 2 + 2 * generate.nextInt(5);
		System.out.printf("The number generated is: %d%n%n", number);
		
		int number2 = 3 + 2 * generate.nextInt(5);
		System.out.printf("The number generated is: %d%n%n", number2);
		

		int number3 = 6 + 4 * generate.nextInt(5);
		System.out.printf("The number generated is: %d%n", number3);


	}

}
