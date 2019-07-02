/* Author: ADEBAYO Johnson
 Date: 24/06/2019 
 Location of exercise:  Exercise 6, Question 6.27
 Purpose: For Greatest Common Divisor
*/
package chapter6.exercise627;

import java.util.Scanner;
public class GreatestCommonDivisor {
	
	static int factor1 =0;
	static Scanner input = new Scanner(System.in);
	static int num2;
	static int smallest1; // declaring the smallest1
	public static int obtainSmallest() { // To obtain and return the smallest among the numbers entered
		System.out.println("Enter first number: ");
		int smallest = input.nextInt();
		smallest1 = smallest; // To store the first number entered
		System.out.println("Enter second number: ");
		num2 = input.nextInt();
		
		if(smallest < num2) {
			smallest = smallest;
		}
		else {
			smallest = num2;
		}
		return smallest;
		
	}
	public static void highestCommonDivisor() { //To obtain highest common divisor
		int smallest = obtainSmallest();
		//for(int i =1; i<=smallest; i++) { //if you want to include the smallest as part of the divisor e.g. 12 & 24
		for(int i =1; i<smallest; i++) { // looping to obtain the divisors
			if(smallest%i == 0 && num2%i == 0) {
				factor1 = i;
			}	
		}
		System.out.println("\nHighest divisor of " + smallest1 + " & " + num2 + " is: " + factor1);	
	}
	public static void main(String[] args) {
		highestCommonDivisor();
	}
}
