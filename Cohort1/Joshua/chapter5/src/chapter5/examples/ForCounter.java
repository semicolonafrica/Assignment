package chapter5.examples;
/**fig. 5.1: ForCounter.java
 * counter controlled repetition with the for repetition statement
*
*@ Author: 
*
*
*/
public class ForCounter {
	
	public static void main(String[] args) {
		int x =2;
		int y = 10;
		
		// for statement header includes initialization,
		// loop-continuation condition and increment
		for(int counter = 1; counter <= 10; counter++)
		System.out.printf("%d " , counter);
	
		System.out.println("");
		
		for(int j = x; j <= 4 * x * y; j = j * y / x )
			System.out.printf("%d " , j);
		
		System.out.println("");
		
//		for(int p = 2; p <= 4 * 2 * 10; p = 2 * 10 / 2 ) {
//			System.out.printf("%d " , p);
//			
//			System.out.println("");
//		
//				}
		
					}
}
