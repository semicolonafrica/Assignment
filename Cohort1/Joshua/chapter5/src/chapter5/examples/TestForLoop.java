/**
 * 
 */
package chapter5.examples;

/**
 * @author user
 *
 */
public class TestForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		int number = 2;
		
//		for(int counter = 1; counter <= 10; counter++) 
//			System.out.printf("%d " , counter);
		
		for(number = 2; number <= 20; total += number, number+=2);
		System.out.printf("%d%d " , number, total);
		

	}

}
