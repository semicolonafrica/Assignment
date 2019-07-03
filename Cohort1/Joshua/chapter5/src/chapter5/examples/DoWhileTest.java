/**
 * 
 */
package chapter5.examples;

/**Fig. 5.7: DoWhileTest.java
 * Do...while repetition statement
 * @author user
 *
 */
public class DoWhileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 1;
		do {
			System.out.printf("%d ", counter);
			counter ++;
		}
		while(counter <= 10);// end do..while
			System.out.println();
		
		
	}

}
