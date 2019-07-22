package exercise4_31;

import java.util.Scanner;

public class Palindrome {
	
	public void checkPalindrome() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = in.nextInt();
		
		int initialNum = num;
		int remainder = 0;
		int reversed = 0;
		
		while(num > 0) {			
			remainder = num % 10;			
			reversed = reversed * 10 + remainder;			
			num = num/10;
		}			
		if(reversed == initialNum) {
			System.out.println("This is a Palindrome");
		}
		else if(reversed != initialNum) {
			System.out.println("This is not a Palindrome");
		}
		else {
			System.out.println();
		}
	}
}
