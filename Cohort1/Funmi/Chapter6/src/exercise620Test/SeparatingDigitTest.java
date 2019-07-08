package exercise620Test;
import java.util.Scanner;

import exercise621.SeparatingDigit;

public class SeparatingDigitTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		 System.out.println("Enter the numbers intend to seperate: ");
		 number = input.nextInt();
		 
		SeparatingDigit.displayDigit(number);
		 
		input.close();

	}

}
