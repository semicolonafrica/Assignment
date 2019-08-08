/**
 * 
 */
package chapter7;

/**
 * @author gbemi
 *
 */
public class KnightAccessibility {
	public   int currentRow=0;
	public  int currentCol=0;
	
	public  int[][] accessArray= {{2,3,4,4, 4, 4, 3, 2},
			{3, 4, 6, 6, 6, 6 ,4, 3},
			{4 ,6, 8, 8, 8, 8, 6, 4},
			{4, 6, 8, 8, 8, 8, 6, 4},
			{4, 6, 8, 8 ,8 ,8, 6, 4},
			{4, 6, 8, 8, 8, 8, 6, 4},
			{3, 4, 6, 6, 6, 6, 4, 3},
			{2, 3, 4, 4, 4 ,4, 3, 2}};
	
	
		
	Knight player1=new Knight();
	
	
	public boolean validateMove(int row,int col) {
		
		
		if(row >= 0 && row < 8 && col>=0 && col < 8) {
			
			if(accessArray[row][col] != 0)
				return true;
			
		}
		
		return false;
	}
	
	public void displayBoard() {
		
		for(int row=0;row<accessArray.length;row++) {
			
			for(int column=0;column<accessArray[row].length;column++) {
				
				if(accessArray[row][column] == 0) {
					System.out.print(" k ");
				}
				else {
					System.out.print(" * ");
				}
				
			}
			
			System.out.println();
		}
	}
	
	
	public void moveKnight() {
		
		int tempRow;
		int tempCol;
		
		int moveRow = 0;
		int moveCol = 0;
		
		int smallest=8;
		int access;
		
		for(int k=0;k<64;k++) { 
			
			for(int count=0;count<accessArray.length;count++) {
			
			
				tempRow=currentRow;
				tempCol=currentCol;
				
				tempCol+=player1.getHorizontal(count);
				tempRow+=player1.getVertical(count);
				
				
			
			if(validateMove(tempRow,tempCol)==true) {
				
				
				access = accessArray[tempRow][tempCol];
				
				--accessArray[tempRow][tempCol];
				
				if(access<smallest) {
				
					 moveRow=tempRow;
					 moveCol=tempCol;
					 
					 smallest=access;
						
				}
			}
			
			
			}
//			if(count==7) {
				accessArray[currentRow][currentCol] = 0;
				
				currentRow=moveRow;
				currentCol=moveCol;
				smallest=8;
				
//					}
		
		}
		displayBoard();
	}

}
