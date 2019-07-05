/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Exercise7, Question 7.8b
 Purpose: Sum of array elements
*/


package chapter7.exercise78;

import java.security.SecureRandom;
public class TotalElements {
	static SecureRandom random = new SecureRandom();
	static double total;
	

	public static void main(String[] args) {
		sumOfElements();
		sumOfElements1();
		sumOfElements2();

	}
	public static void sumOfElements() { // Question 7.8(c)
		double[] c = new double[100];
		total = 1.20;
		for(int i=0; i < c.length; i++) {
			total += 2;
			c[i] = total;
			//System.out.println("Sum: " + c[i]);
		}
		System.out.println("Total1: " + total);
	}
	public static void sumOfElements1() { // Question 7.8(c) Version2
		double[] c = new double[100];
		c[0] = 1.20;
		total = 0.00;
		for(int i=0; i < c.length; i++) {
			if(i > 0) {
			c[i] = c[i-1] + 2;
			}
			if(i == 0) {
				c[i] = c[0];
			}
			total += c[i];
			//System.out.println("Value: " + c[i]);
			//System.out.printf("Sum: %.2f%n", total);
			//System.out.println();
		}
		//System.out.println();
		System.out.println("Total2: " + total);
	}
	public static void sumOfElements2() { // Question 7.8(c) Version3
		double[] c = new double[100];
		//c[0] = 1.20;
		total = 0.00;
		for(int i=0; i < c.length; i++) {
			double a = 1.2 + random.nextInt(10);
			c[i] = a;
			total += c[i];
			System.out.println("Value: " + c[i]);
			System.out.printf("Sum: %.2f%n", total);
			System.out.println();
		}
		System.out.printf("Total3: %.2f%n", total);
	}
	

}
