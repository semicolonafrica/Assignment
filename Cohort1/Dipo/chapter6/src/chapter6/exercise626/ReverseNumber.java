package chapter6.exercise626;
import java.util.Scanner;
public class ReverseNumber {
	
	public static void reverse() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number to reverse: ");
		int number = input.nextInt();
		
		ReverseNumber.reverse(number);
	}
	
	public static int reverse(int n) {
		
		int remainder;
		int quotient;
		int m = 0;
		
		quotient = n;
		
		do {
			remainder = quotient % 10;
			quotient = quotient / 10;
			m = m * 10 + remainder;
		}	
		while(quotient > 0);
		
			System.out.println(n +" is reverse to " + m);
	
		return m;
	}

}
