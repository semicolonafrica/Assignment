/**
 * 
 */
package chapter4.exercise4_38;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class FactorialE {

	
	
	
	public int calFactorial(int number){
		
		int counter = 1;
		int factorial=1;
		
			while(counter <= number) {
			factorial = counter * factorial;
						
			counter++;
			}
			return factorial;
	}
	public int calFactorialE(int number) {
		int constant = 0;
		int counter =1;
		int factorial = 1;
		
		    while(counter <= number) {
		    	
		    	factorial = counter * factorial;
		    	constant = constant + factorial;
		    	
		    	counter++;
		    }
		    return constant + 1;
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		
		FactorialE fact = new FactorialE();
		
		System.out.println(fact.calFactorial(number));
		System.out.println(fact.calFactorialE(number));
	
			}
		

		
			
	}


	

