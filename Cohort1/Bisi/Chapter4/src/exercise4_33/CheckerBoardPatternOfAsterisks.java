package exercise4_33;
import java.util.Scanner;
public class CheckerBoardPatternOfAsterisks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 1; 
		System.out.print("Enter number: ");	
		int number = in.nextInt();
		
		while(count <= number) {
			System.out.print("* ");
				System.out.print(" ");
		if(count == number) {
				System.out.println();
			}
			count++;
		}
	}
}
