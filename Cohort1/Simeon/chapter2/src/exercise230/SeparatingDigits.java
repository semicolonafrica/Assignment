package exercise230;

import java.util.Scanner;

public class SeparatingDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("Enter number with 5 digits: ");
		x = input.nextInt();
		
		
		System.out.print(x / 10000);
		System.out.print("   " + x % 10000 / 1000);
		System.out.print("   " + x % 1000 / 100);
		System.out.print("   " + x % 100 / 10);
		System.out.print("   " + x % 10 / 1);

		input.close();
	}

}
