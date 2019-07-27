/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
public class KnightGame {
	
	private static int knight [][]= new int[8][8];
	
	private static int vertical[]=new int[8];
	
	private static int horizontal[]=new int[8];
	
	int currentRow=0;
	int currentColumn=0;
	public  void displayBoard() {
		
		for(int row=0;row<knight.length;row++) {
			
			for(int col=0;col<knight[row].length;col++) {
				
				
				if(knight[row][col]== 1)
				System.out.print("k");
				else 
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	
	public void knightMove(int moveNumber) {
				horizontal[0] = 2;
				horizontal[1] = 1 ;
				horizontal[2] = -1 ;
				horizontal[3] = -2; 
				horizontal[4] = -2 ;
				horizontal[5] = -1 ;
				horizontal[6] = 1 ;
				horizontal[7] = 2 ;
		
				vertical[0] = -1;
				vertical[1] = -2;
				vertical[2] = -2;
				vertical[3] = -1;
				vertical[4] = 1;
				vertical[5] = 2;
				vertical[6] = 2;
				vertical[7] = 1;
				
				
				
				
				currentRow+=vertical[moveNumber];
				currentColumn+=horizontal[moveNumber];
				
				try {
					if(knight[currentRow][currentColumn]!=1) {
				++knight[currentRow][currentColumn];
					}
					else {
						System.out.println("you have move here before!!!");
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("you have move out of the board!!!");
					
				}
				
		System.out.printf("Knight position is: (%d, %d)", currentRow, currentColumn);
				
	
				
	
	}
}
