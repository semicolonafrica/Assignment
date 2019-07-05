/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Exercise7, Question 7.8a
 Purpose: Display element 
*/

package chapter7.exercise78;

import java.security.SecureRandom;
public class DisplayValue {
	static SecureRandom random = new SecureRandom();
	
	public static void main(String[] args) {
		System.out.println("The value of element 6 is: " + displayElementA());
		displayElementC();
	}
	public static int displayElementA() { // Question 7.8(a), version1
		//int[] f = new int[8];
		int[] f = {2, 4, 6, 8, 10, 12, 14, 16};
		return f[6];
	}
	public static void displayElementC() { // Question 7.8(a) version2
		int[] f = new int[8];
		for(int i = 0; i< f.length; i++) {
			int number = 1 + random.nextInt(6);
			f[i] = number;
			System.out.println(f[i]);
		}
		System.out.println("The element in the sixth position is: " + f[5]);
		
	}
}