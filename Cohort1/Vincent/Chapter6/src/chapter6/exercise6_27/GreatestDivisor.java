package chapter6.exercise6_27;

import java.util.Scanner;

public class GreatestDivisor {
	
	public static void gcd() {
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int number1 =0;
		int number2 = 0;
		
		while (number1 != -1 && number2 != -1) {
			
			System.out.println("enter number1");
			number1 = input.nextInt();
			
			System.out.println("enter number2");
			number2 = input.nextInt();
			counter++;
			
			System.out.println();
			
			System.out.printf("The greatest divisor is: %d%n",GreatestDivisor.gcd(number1, number2));
		}
	}

	
		public static int gcd(int number1, int number2) {
			
			int number3;
			if (number2 == 0) {
				return number1;
			}
			else
			number3  = number1 % number2;
			return  gcd(number2,number3); 
		}
}
