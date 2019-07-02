/**
 * 
 */
package chapter6.Exercises;

/**
 * @author user
 *
 */
public class RandomNumbersTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 RandomNumbers obj = new RandomNumbers();
		
		 System.out.printf("Range \t\t Random Numbers %n");
		 System.out.printf("2 to 10 %13d%n", obj.choose1());
		 System.out.printf("3 to 11 %13d%n", obj.choose2());
		 System.out.printf("6 to 22  %13d", obj.choose3());
	}

}
