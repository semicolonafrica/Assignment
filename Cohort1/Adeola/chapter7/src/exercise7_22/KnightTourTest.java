package exercise7_22;
import java.util.Scanner;
public class KnightTourTest {

	public static void main(String[] args) {
		ChessBoard play = new ChessBoard();
		Scanner input = new Scanner(System.in);
		int moveNumber = 0;
		for(int move = 0 ;move<64; move ++) {
			System.out.println("enter move number");
			moveNumber = input.nextInt();
			play.moveKnight(moveNumber);
		}
		play.displayBoard();
		input.close();
	}
}
