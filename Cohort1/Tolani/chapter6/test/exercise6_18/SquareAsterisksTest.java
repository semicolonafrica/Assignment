package exercise6_18;

import java.util.Scanner;

public class SquareAsterisksTest {

	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		System.out.println("Enter value: ");
		int number = insert.nextInt();
		SquareAsterisks.printSquareAsterisks(number);
		
		insert.close();
	}

}
