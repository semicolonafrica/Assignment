package exercise216;

/** Compare two integer and find larger number or if they are equal
 * Author Simeon O.
 * Created: 10'06'2019, 2:07PM
 */

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("Enter first number: ");
		x = input.nextInt();
		
		System.out.print("Enter seconf number: ");
		y = input.nextInt();
		
		if (x > y)
			System.out.printf("%d is larger", x);
		
		if (x < y)
			System.out.printf("%d is larger", y);
		
		if (x == y)
			System.out.printf("These numbers are equal");
		
		input.close();
	}

}
