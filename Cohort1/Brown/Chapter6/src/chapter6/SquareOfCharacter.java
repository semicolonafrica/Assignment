package Chapter6.exercise6_19;

import java.util.Scanner;

public class SquareOfCharacter {
	
public static void squareOfCharacter() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer value for a side of a square: ");
		int side = input.nextInt();
		System.out.println("Enter any Character: ");
		char fill = input.next().charAt(0);
		
		for(int i =0; i < side; i++) {
			for(int j =0; j < side; j++) {
				System.out.print(fill);
			}
			System.out.println("");
		}
	}

		public static void main(String[] args) {
			SquareOfCharacter.squareOfCharacter();
}
	
}
