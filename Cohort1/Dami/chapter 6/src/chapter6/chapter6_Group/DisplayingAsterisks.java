package chapter6.chapter6_Group;
import java.util.Scanner;
public class DisplayingAsterisks {
	

	public static int squareOfAsterisks(int x) {
		Scanner input = new Scanner(System.in);
		if(x == 0) {
			System.out.println("Number cannot be 0. Try again!");
			x = input.nextInt();
		}
		if(x % 2 == 1) {
			System.out.println("Nah! Even numbers only. Try again!");
			x = input.nextInt();
		}
		for(int i = 1; i <= x; i++) {
			for(int a = 1; a <= x; a++) {
				System.out.print("*");
			}
			System.out.println();
		} return x;
	}
}
