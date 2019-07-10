package exercise6_25;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void primeNumber(int num){
		int i = 2; i++;			
		if(num % i != 0) {		
		System.out.println("Number input is Prime:");
		} else {
			System.out.println("Number input is not a Prime number!");	
	}
		}

	
	public static void allPrimeNumbers(int num) {
		
		System.out.println("Prime numbers are:");				
		for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					System.out.print(i);
					System.out.print(" ");
					}	
		}
	}

	public static int rootPrimeNumber(int num){
		
		if(Math.sqrt(num) == 1) {	
			
		System.out.println("Number input is Prime:" + num);
		} else
			
			System.out.println("Number input is not a Prime number!");
			
		return num;
		}		

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Put in your value:");
	int value = input.nextInt();
	
//	allPrimeNumbers(value);
	
	primeNumber(value);
	
	//rootPrimeNumber(value);
	}

}