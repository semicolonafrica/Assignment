package exercise226;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("Enter first number: ");
		x = input.nextInt();
		
		System.out.print("Enter second number: ");
		y = input.nextInt();
		
		if (x % y == 0)
			System.out.printf("%d is a multiple of %d", x, y);

		if (x % y != 0)
			System.out.printf("%d is not multiple of %d", x, y);

		input.close();
		
	}

}
