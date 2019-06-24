package chapter6Exercises;

import java.util.Scanner;

public class GreatestDivisor {
	
//	(Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
//	integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
//	common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
//	information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
//	into an application that reads two values from the user and displays the result.
//	6.28 Write a method qualityPoints that inputs a student’s average and returns
	
	public static void gcd() {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first number");
		int number1 = input.nextInt();
		System.out.println("Enter second number");
		int number2 = input.nextInt();
		
		System.out.println("The greatest divisor of " + number1 + " and " + number2 + " is: "+ GreatestDivisor.gcd(number1, number2));
		input.close();
	}
	
	public static int gcd(int number1, int number2) {
	
		if(number2 == 0)
			return number1;
		else {
		int number3 = number1 % number2;
				return gcd(number2, number3);
		}
	}
}
