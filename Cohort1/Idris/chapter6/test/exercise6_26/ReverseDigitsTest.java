package exercise6_26;

import java.util.Scanner;
public class ReverseDigitsTest {
	public static void main(String[] args) {
		Scanner accept = new Scanner(System.in);
		
		System.out.println("Enter number ot be reversed: ");
		int digit = accept.nextInt();
		
		System.out.println("The revers of "+digit+" is "+ReverseDigits.turn(digit));
		accept.close();
	}

}
