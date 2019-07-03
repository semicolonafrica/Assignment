package chapter6.chapter6_Group;
import java.util.Scanner;

public class DisplayingHashOperation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Hash");
		char counter = input.next().charAt(0);
		
		int filled = DisplayingHash.squareOfHash(counter);
	}

}
