package exercise7_22;

public class Knight {
	
	private int [] vertical = new int [8];
	private int [] horizontal = new int [8];
	
	public Knight() {
	
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
}
	
	
	
	private int currentRow=0;
	private int currentColumn=0;
	
	
	
	public int getCurrentRow() {
		return currentRow;
	}
	public void setCurrentRow(int currentVerical) {
		this.currentRow = currentVerical;
	}
	public int getCurrentColumn() {
		return currentColumn;
	}
	public void setCurrentColumn(int currentHorizontal) {
		this.currentColumn = currentHorizontal;
	}

	
	public void setVertical(int[] vertical) {
		this.vertical = vertical;
	}
	public int[] getVertical() {
		return vertical;
	}
	
	public void setHorizontal(int[] horizontal) {
		this.horizontal = horizontal;
	}
	public int[] getHorizontal() {
		return horizontal;
	}
	
	public void knightMove(int moveNumber, ChessBoard board) {
		
		if(moveNumber <0 || moveNumber>getHorizontal().length) {
			throw new IllegalArgumentException("You have move out of the board!!!");
		}
	
	
	currentRow+=vertical[moveNumber];
	//currentRow =0;
	currentColumn+=horizontal[moveNumber];
	
	if(board.getBoard()[currentRow][currentColumn]!=1) {
		
		board.getBoard()[currentRow][currentColumn] = 1;
	
	}
	
	
	
	
	
	
	}
}
