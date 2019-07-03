/**
 * 
 */
package chapter6.Exercises;

/**Exercise 6.13
 * @author Group 1 ( Emmanuel and Me)
 *
 */
import java.security.SecureRandom;
public class RandomNumbers {

	SecureRandom random = new SecureRandom();
	
	public int choose1() {
		int num1 = 2 + 2 * random.nextInt(5);
		return num1;
	}
	
	public int choose2() {
		int num2 = 3 + 2 * random.nextInt(5);
		return num2;
	}
	
	public int choose3() {
		int num3 = 6 + 2 * random.nextInt(5);
		return num3;
	}
	
}
