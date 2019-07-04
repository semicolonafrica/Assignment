/**
 * 
 */
package chapter6.exercise614;

import java.util.Scanner;

/**
 * @author Olayinka oloko
 */
 public class exponentiation{
	 
	 
	 public static int integerPower(int base, int exponent){
		 int power = 1;
		 for(int i = 1; i<=exponent; i++ )
			 power = power*base;
		 return power;
	 }
	 
	 public static void main(String[]args) {
		 Scanner expo = new Scanner(System.in);
		 System.out.println("Enter Base number");
		int base = expo.nextInt();
		
		System.out.println("Enter Exponent number");
		int exponent = expo.nextInt();
		
		System.out.println(integerPower(base, exponent));
		
		expo.close();
	 }
 }