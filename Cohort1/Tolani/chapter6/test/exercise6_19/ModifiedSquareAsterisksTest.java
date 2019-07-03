package exercise6_19;

import java.util.Scanner;

public class ModifiedSquareAsterisksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		System.out.println("Enter value: ");
		int number = insert.nextInt();
		System.out.println("Enter character: ");
		char character = insert.next().charAt(0);
		
		ModifiedSquareAsterisks.printSquareAsterisks(number, character);
		
		insert.close();

	}

}
