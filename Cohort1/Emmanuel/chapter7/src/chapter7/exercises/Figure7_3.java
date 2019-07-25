/**
 * 
 */
package chapter7.exercises;

/**
 * @author USER
 *
 */
public class Figure7_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.printf("%s%8s%n", "Counter", "Values");
		
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5s%8s%n", counter, array[counter]);
		}

	}

}
