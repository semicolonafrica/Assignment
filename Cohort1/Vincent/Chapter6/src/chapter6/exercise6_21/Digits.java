package chapter6.exercise6_21;


public class Digits {
	
	public static String calculateNumbers() {
		
		int number1 = 107;
		int number2 = 3;
		
		int quotient = number1 / number2;
		int reminder = number1% number2;
		String holdValue =  reminder + " " + quotient ;
		return holdValue;
		
	}

	public static void displayNumber() {
		String value = calculateNumbers();
		
		String store = " " ;
		store = " " + value;
		
		System.out.println(store);
	}

}
