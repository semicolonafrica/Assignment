package exercise6_21;

import java.util.Scanner;

public class SeparatingDigitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter value: ");
		int number = insert.nextInt();
		
		System.out.println();
		
		System.out.println(SeperatingDigits.displayDigits(number));

		
		insert.close();
	}

}
