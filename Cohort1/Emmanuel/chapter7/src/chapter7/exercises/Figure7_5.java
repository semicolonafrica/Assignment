/**
 * 
 */
package chapter7.exercises;

/**
 * @author USER
 *
 */
public class Figure7_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		int total = 0;
		
		for(int counter = 0; counter < array.length; counter++) {
			total+= array[counter];
			
		}
		System.out.printf("The total is: %d%n ", total);

	}

}
