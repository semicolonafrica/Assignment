package exercise6_25;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static int primeNumbers(int num){
				
		if(num % 2 == 1) {		
		System.out.println("Number input is Prime:" + num);
		} else
			System.out.println("Number input is not a Prime number!");
		return num;
		}	
	
	public static void allPrimeNumbers(int number) {
		
		System.out.println("Prime numbers are:");
		
		if( number % 2 == 1) {			
		
		for(number = 2; number <= 100; number++) {
			int count = 1;
			number ++;
				System.out.println(number);
				}
		}
		
	}
	public static int rootPrimeNumbers(int num){
		
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
	
	//PrimeNumbers.allPrimeNumbers(value);
	
//	PrimeNumbers.primeNumbers(value);
	
	PrimeNumbers.rootPrimeNumbers(value);
	}

}