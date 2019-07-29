package chapter7.exercises;

import java.util.Scanner;

public class FibonacciTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of Terms(Integer): ");
		int numberOfTerms = input.nextInt();
		
		System.out.print("Enter the number of Terms(Double): ");
		int numberOfTerm = input.nextInt();
		//Fibonacci.fibonacci(numberOfTerms);
		
		System.out.println();
		System.out.println();
		
		Fibonacci.fibonacciModified(numberOfTerm);
		
		input.close();
	}

}
