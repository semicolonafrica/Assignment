package asterisks;

import java.util.Scanner;

public class SquareAppTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("ENTER SIDES: ");
		int number = input.nextInt();
		
		SquareApp.squareOfAsterisks(number);
	}

}
