/**
 * 
 */
package chapter5.examples;

/**Fig. 5.5:Sum.java
 * summing integers with the for statement
 * @author user
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int total = 0;
		
		//total even numbers from 2 to 20.
		
		System.out.println("Even Numbers \t  total");
		
	for(int number =2; number <= 20; number += 2) {
		
		System.out.printf(" %d%n ", number);
		total += number;
		
	System.out.printf(" %20d%n ", total);
	}
	
	
//	public int calcTotal() {
//		
//		int total1 = 0;
//		
//		//total even numbers from 100 to 2.
//		
//		System.out.println("Even Numbers \t  total");
//		
//	for(int number =3; number <= 100; number -= 3) {
//		
//		System.out.printf(" %d%n ", number);
//		total += number;
//		
//	System.out.printf(" %20d%n ", total);
//	}
//	//}
	}
}
