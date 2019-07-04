package chapter7.exercises;
//Program to sum double values in a command Line argument using Enhanced For Loop
//Program written by Oyemade Temitope
//Exercise 7.16
//4th of July 2019

public class SumArrayUsingEnhancedForLoop {

	public static void main(String[] args) {
		
		double sumTotal = 0; 
		
		for(String x : args) {
			
			sumTotal = sumTotal + Double.parseDouble(x);	
		}
		
		System.out.printf("Sum of the numbers = %.2f", sumTotal);

	}

}
