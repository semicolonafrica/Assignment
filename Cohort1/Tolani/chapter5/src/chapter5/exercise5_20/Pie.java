/**
 * 
 */
package chapter5.exercise5_20;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Pie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		
		int number = input.nextInt();
		
		double pi = 0.0;
		double j = -1.0;
		
		for(double i =1.0; i<=number; i=i+2) {
			
			j*=-1;
			//j = -1*-1
			
			pi += (4/i)*j;
			
			System.out.println(pi);
		}
		input.close();
	}

}
