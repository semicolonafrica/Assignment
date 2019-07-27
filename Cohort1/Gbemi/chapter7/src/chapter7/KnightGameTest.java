/**5
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class KnightGameTest {
	public static void main(String[] args) {
		
		
		KnightGame player1=new KnightGame();
		
		Scanner input= new Scanner(System.in);
		
		for(int count=0;count<10;count++) {
			System.out.println("Enter number of move");
			int value=input.nextInt();
			
			player1.knightMove(value);

		}
		player1.displayBoard();
		
	
//		int value=input.nextInt();
	}

}
