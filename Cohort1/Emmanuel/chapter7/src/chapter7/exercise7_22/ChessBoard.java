/**
 * 
 */
package chapter7.exercise7_22;

/**
 * @author Emmanuel Akinbode
 *
 */
public class ChessBoard {
	
	int [][] chess = new int [8][8];
	int currentRow = 0;
	int currentColumn = 0;
	
	Knight knightobj = new Knight();
	
	public void moveKnight(int moveNumber) {
		
		
		
		try {
			if(moveNumber < 8 && moveNumber >=0) {
				currentRow += knightobj.getVertical(moveNumber);
				currentColumn += knightobj.getHorizonatal(moveNumber);
			}
		if(chess[currentRow][currentColumn] == 0) {
			chess[currentRow][currentColumn] = 1;
		}
		else {
			System.out.println("You have visited the square");
		}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You have gone out of chess board");
		}
			
		System.out.printf("The value of current position is: %d%2d%n", currentRow,currentColumn);

}
	public void displayKnightMovement() {
		
		for(int row = 0; row < chess.length; row++) {
			for(int col = 0; col < chess[row].length; col++) {
				
				if(chess[row][col]== 1) {
					System.out.print("k");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}    
	}
}