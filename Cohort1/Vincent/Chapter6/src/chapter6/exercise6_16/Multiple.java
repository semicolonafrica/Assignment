package chapter6.exercise6_16;

//Write a method isMultiple that determines, for a pair
//of integers, whether the second integer is a multiple of the first. The
//method should take two integer arguments and return true if the second
//is a multiple of the first and false otherwise. [Hint: Use the remainder
//operator.] Incorporate this method into an application that inputs a series
//of pairs of integers (one pair at a time) and determines whether the second
////value in each pair is a multiple of the first.



public class Multiple {

	public static int isMultiple(int firstNumber, int secondNumber) {
		int total = secondNumber % firstNumber;
		
		if (total > 0.0) {
			System.out.println("it is  not a multiple : false");
		}
		
		else 
			System.out.println(" it is a multiple first number: true");
		
		return total;
			
	}
}
