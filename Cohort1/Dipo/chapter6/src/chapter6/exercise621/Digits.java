package chapter6.exercise621;
import java.util.Scanner;
public class Digits {
	
	public void separateDigits() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number (1-99999): ");
		int number = input.nextInt();
		
		//System.out.println(SeparateDigits.displayDigit(number));
	//}
	
	//public void digitCondition() {
		 //number = 0;
		
		if (number <= 99999 && number >= 1 ) { 
			displayDigit(number);
		}
		else 
			System.out.println("Input number between 1 and 99999: ");
		
	}
	// method for quotient
	public int quotient( int a, int b ) {
		
		return (a/b);
	}
	
	// method for remainder
	public int modulus( int a, int b) {
		
		return (a % b);
	}
	
	// method to display the digits
	public void displayDigit( int number) {
		
		int divisor = 1;
		int digit;
		String store = "";
		
		for(int i = 1; i < number; i *= 10 ) 
			divisor = i;
			
		while (divisor >= 1) {
				digit = quotient( number, divisor );
				store += digit + " ";
				number = modulus( number, divisor );
				divisor = quotient( divisor, 10);
		}
		
		System.out.println(store);
	
	}
	
	

}
