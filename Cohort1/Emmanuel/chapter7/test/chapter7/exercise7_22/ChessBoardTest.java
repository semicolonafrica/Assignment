/**
 * 
 */
package chapter7.exercise7_22;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class ChessBoardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ChessBoard player = new ChessBoard();
		int count = 0;
		
		while(count < 10) {
			int moveNumber = input.nextInt();
			player.moveKnight(moveNumber);
			
			count++;
		}
		player.displayKnightMovement();

	}

}
