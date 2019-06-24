package exercise6_26;

import java.util.Scanner;

public class ReverseDigitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert =new Scanner(System.in);
		System.out.println("Enter number:");
		int number = insert.nextInt();
		System.out.println(ReverseDigit.displayDigits(number));
	}

}
