package exercise6_27;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	public static int gCD(int num, int num1) {
		
		Scanner in = new Scanner(System.in);		
		
		System.out.print("Enter first value:");
			num = in.nextInt();
		

		System.out.print("Enter second value:");
			num1 = in.nextInt();
		
				int a = 1;	int result = 1;
		if(num >= a && num1 >= a) {
			if(num % a == 0 && num1 % a == 0) {
				result =+a;
			}			
		}
		return result;
	}
	
	public static void main(String[] args) {
		
			int value = 0;	int value1 = 0;		
		
		System.out.print("Greatest Common Divisor of is: " + gCD(value, value1));
		
		}
}