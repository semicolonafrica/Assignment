package chapter6.exercise614;

import java.util.Scanner;
public class Exponentiation {

	public void integerPower() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter base number: ");
		int base = input.nextInt();
		
		
		System.out.println("Enter power: ");
		int exponent = input.nextInt();
		
		if(exponent > 0) {
			exponent = exponent;
		}
		else if(exponent == 0) {
			while (exponent == 0) {
				System.out.println("Enter power: ");
				exponent = input.nextInt();
				if(exponent > 0) {
					break;
				}
				}
		}
		
		int answer = 1;
		
		for(int i = 1; i <= exponent; i++) {
			answer = answer * base;
		}
		System.out.println(base +" exponent " + exponent + " = " +answer);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
