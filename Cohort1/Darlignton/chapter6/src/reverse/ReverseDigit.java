package reverse;

import java.util.Scanner;

public class ReverseDigit {


	public static String reverseNumber(int number) {

		String reversedNumber = " ";
		int value1 = number % 10;
		int remainder = number / 10;
		int value2 = remainder %10;
		remainder = remainder / 10;
		int value3 = remainder %10;
		remainder = remainder / 10;
		int value4 = remainder % 10;
		reversedNumber = String.format("%d%d%d%d",value1,value2,value3,value4);

		return reversedNumber;
	}


	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("Enter 4 digit number you want to reverse");
			int number = input.nextInt();

			System.out.println(reverseNumber(number));

			input.close();
	}

}