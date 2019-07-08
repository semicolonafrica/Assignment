package exercise6_21;

import java.util.Scanner;

public class SeperatingDigitTest {

	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		
		
		System.out.println("Enter integer: ");
		int number = insert.nextInt();
		if(number>1 || number<99999) {
			System.out.println(SeperatingDigit.displayDigits(number));
		}
		insert.close();
	}

}
