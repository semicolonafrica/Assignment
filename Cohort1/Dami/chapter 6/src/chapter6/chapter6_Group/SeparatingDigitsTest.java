package chapter6.chapter6_Group;

import java.util.Scanner;

public class SeparatingDigitsTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type number");
		int number = input.nextInt();
		
		System.out.println(SeparatingDigits.displayDigit(number));
		//input.close();
		
	}

}

