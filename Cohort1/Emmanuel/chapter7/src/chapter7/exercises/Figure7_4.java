/**
 * 
 */
package chapter7.exercises;

/**
 * @author USER
 *
 */
public class Figure7_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ARRAY_LENGTH = 10;
		int [] array = new int[ARRAY_LENGTH];
		
		
		System.out.printf("%s%8s%n", "Counter", "Values");
		
		for(int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 + 2 * counter;
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

}
