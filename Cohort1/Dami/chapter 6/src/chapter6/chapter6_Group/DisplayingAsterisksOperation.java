package chapter6.chapter6_Group;
import java.util.Scanner;
public class DisplayingAsterisksOperation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Asterisks");
		int counter = input.nextInt();
		
		int square = DisplayingAsterisks.squareOfAsterisks(counter);
	}

}
