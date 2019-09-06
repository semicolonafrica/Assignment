package exercise225;

import java.util.Scanner;

public class OddEven {

	public static  void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x;
		
		System.out.print("Enter number: ");
		x = input.nextInt();
		
		if (x % 2 == 0)
			System.out.println("Number is Even!");

		if (x % 2 != 0)
			System.out.println("Number is Odd!");
		
		input.close();
	}
}
