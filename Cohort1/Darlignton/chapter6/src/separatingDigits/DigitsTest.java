package separatingDigits;

import java.util.Scanner;

public class DigitsTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input number");
		int number = input.nextInt();
		
		System.out.println(Digits.displayDigit(number));
		input.close();
		
	}

}
