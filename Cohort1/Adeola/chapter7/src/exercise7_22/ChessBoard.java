package exercise7_22;

public class ChessBoard {
	int[][] chessArray = new int[8][8];
	
	Knight knight = new Knight();
	int currentRow =0;
	int currentCol =0;
	
	public void moveKnight(int moveNumber) {
		currentRow += knight.moveVertical(moveNumber);
		currentCol += knight.moveHorizontal(moveNumber);
		
		if(currentRow <8 && currentRow >=0) {
			if(chessArray[currentRow][currentCol]==0) {
				chessArray[currentRow][currentCol]=1;
				System.out.println("you are on prosition ("+ currentRow + ","+ currentCol + ")." );
			}
			else {
				System.out.println("you have been there before");
				System.out.println("you are on prosition ("+ currentRow + ","+ currentCol + ")." );
			}
		}
		else {
			System.out.println("you are out of the board");
		}
	}
	
	public void displayBoard() {
		for(int row = 0; row< chessArray.length;row++) {
			for(int col = 0; col <chessArray[row].length; col++) {
				System.out.print(chessArray[row][col]+ " ");
			}
			System.out.println();
		}
	}
	
}
