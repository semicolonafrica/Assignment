package chapter6;

import java.util.Scanner;

public class ReverseDigitTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number to reverse: ");
		int num = input.nextInt();
		System.out.print(ReverseDigit.getDigit(num));
		input.close();
	}

}
