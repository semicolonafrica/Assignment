package chapter6.exercise6_23;

//Write a method minimum3 that returns the smallest of three floatingpoint
//numbers. Use the Math.min method to implement minimum3. Incorporate the method into an
//application that reads three values from the user, determines the smallest value and displays the result.

public class MinimumNumber {
	
		public static void findMinimumNumber(double num1, double num2, double num3) {
			
		double total = Math.min(num1,(Math.min(num2, num3)));
	
		System.out.printf("minimum number %f", total);
		}
	
}
