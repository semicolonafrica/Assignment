/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Exercise7, Question 7.8e
 Purpose: For calculating sum of double values
*/

package chapter7.exercise78;

import java.security.SecureRandom;
public class DisplayNumber {
	static SecureRandom random = new SecureRandom();
	public static void main(String[] args) {
		displayNumber();
	}
	public static void displayNumber() {
		double largest = 0.00;
		double[] w = new double[9];
		double number1 = random.nextDouble() + random.nextInt(10);
		w[0] = number1;
		System.out.printf("%.2f%n",w[0]);
		double smallest = w[0];
		
		for(int counter =1; counter < w.length; counter++){
			double number = random.nextDouble() + random.nextInt(10);
			w[counter] = number;
			System.out.printf("%.2f%n",w[counter]);
			if(largest < w[counter]) {
				largest = w[counter];
			} 	
			if(smallest > w[counter]) {
				smallest = w[counter];
			}
			
		}
		System.out.printf("The smallest is: %.2f%n", smallest);
		System.out.printf("The largest is: %.2f%n", largest);
	}
}
