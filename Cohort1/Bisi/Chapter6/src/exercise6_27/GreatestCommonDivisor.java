package exercise6_27;

import java.util.Scanner;

public class GreatestCommonDivisor {
	
	public static int gCD(int num, int value,int i) {
		
		for(i = 1; i <= num && i <= value; i++) {
			
			if(num % i == 0 && value % i == 0) {
				int result = i;
				}
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		
		System.out.print("Enter first value:");
		int value = in.nextInt();
		

		System.out.print("Enter second value:");
		int value1 = in.nextInt();
		
		System.out.print("Greatest Common Divisor of this is: ");
		
		System.out.print(GreatestCommonDivisor.gCD(value1, value1, value1));
	}
}