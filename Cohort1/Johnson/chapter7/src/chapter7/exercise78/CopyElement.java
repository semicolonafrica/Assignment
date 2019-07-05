/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Exercise7, Question 7.8b
 Purpose: Copy elements of one array into another array
*/


package chapter7.exercise78;

public class CopyElement {

	public static void main(String[] args) {
		copyElement2();
	}
	public static void copyElement2() { // Question 7.8 (d)
		int[] a = new int[11];
		int[] b = new int[34];
		
		System.out.println("List of the 11 elements:");
		for(int i=0; i < a.length; i++) {
				int even = 2 * i;
				a[i] = even;
				System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("List of the 34 elements:");
		for(int j = 0; j < b.length; j++) {
			
			if(j < 11) {
				int even = 2 * j;
				b[j] = even;
				System.out.println(b[j]);
			}
			if(j > 10) {
				int odd = 1 + (2 * j);
				b[j] = odd;
				System.out.println(b[j]);
			}
		}
		//System.out.println();
	}

}
