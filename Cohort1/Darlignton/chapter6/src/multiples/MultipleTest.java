package multiples;

import java.util.Scanner;

public class MultipleTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		MultiPlayer obj = new MultiPlayer();
		
		System.out.print("ENTER NUMBER OF PLAYERS: ");
		int set1 = input.nextInt();
		System.out.print("Enter number of second set of players");
		int set2 = input.nextInt();
		
		obj.detectPlayers(set1, set2);
	}

}
