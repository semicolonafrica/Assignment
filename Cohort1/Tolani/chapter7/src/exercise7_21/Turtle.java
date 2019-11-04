package exercise7_21;

public class Turtle {
	
	private int direction;
	
	
	private int row = 0;
	
	private int column = 0;
	
	private TurtleOrientation currentOrientation = TurtleOrientation.COLUMN_RIGHT;
	
	private Pen turtlePen;
	
	
	
	public void setDirection(int newDirection) {
		
		this.direction = newDirection;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public void setTurtlePen(Pen myPen) {
		this.turtlePen = myPen;
	}
	
	public Pen getTurtlePen() {
		return turtlePen;
	}

	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * @return the column
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * @param column the column to set
	 */
	
	
	public void setColumn(int column) {
		this.column = column;
	}

	/**
	 * @return the currentOrientation
	 */
	public TurtleOrientation getCurrentOrientation() {
		return currentOrientation;
	}

	/**
	 * @param currentOrientation the currentOrientation to set
	 */
	public void setCurrentOrientation(TurtleOrientation currentOrientation) {
		this.currentOrientation = currentOrientation;
	}

	public void moveForward(int numberOfSteps,SketchPad sketchingPad) {
		
		if(sketchingPad == null || numberOfSteps <= 0 || numberOfSteps > sketchingPad.getFloor().length) {
			throw new IllegalArgumentException("Sketching pad and Number of steps should be withn 20");
		}
		this.getTurtlePen().setCurrentPosition(PenEnum.DOWN);
		if(this.currentOrientation == TurtleOrientation.COLUMN_RIGHT) {
		int currentColumn = this.getColumn();
		sketchingPad.getFloor()[this.getRow()][currentColumn] = 1;
		
		for(int i = 1;i < numberOfSteps; i++) {
			currentColumn +=1;
			sketchingPad.getFloor()[this.getRow()][currentColumn] =1;
		}
		
		this.setColumn(currentColumn);
		
		}
		else if(this.currentOrientation == TurtleOrientation.ROW_DOWN){
			int currentRow = this.getRow();
			sketchingPad.getFloor()[currentRow][this.getColumn()] = 1;
			
			for(int i = 1;i < numberOfSteps; i++) {
				currentRow +=1;
				sketchingPad.getFloor()[currentRow][this.getColumn()] =1;
			}
			
			this.setRow(currentRow);
			
		}
		
		else if(this.currentOrientation == TurtleOrientation.COLUMN_LEFT){
			int currentColumn = this.getColumn();
			sketchingPad.getFloor()[this.getRow()][currentColumn ] = 1;
			
			for(int i = 1;i < numberOfSteps; i++) {
				currentColumn -=1;
				sketchingPad.getFloor()[this.getRow()][currentColumn] = 1;
			}
			
			this.setColumn(currentColumn);
			
		}
		
		else if(this.currentOrientation == TurtleOrientation.ROW_UP){
			int currentRow = this.getRow();
			sketchingPad.getFloor()[currentRow][this.getColumn()] = 1;
			
			for(int i = 1;i < numberOfSteps; i++) {
				currentRow -=1;
				sketchingPad.getFloor()[currentRow][this.getColumn()] =1;
			}
			
			this.setRow(currentRow);
			
		}
		
	}
	
	public void turnRight() {
		if(this.currentOrientation==TurtleOrientation.COLUMN_RIGHT ) {
			this.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
		}else if(this.currentOrientation==TurtleOrientation.ROW_DOWN ) {
			this.setCurrentOrientation(TurtleOrientation.COLUMN_LEFT);
		}else if(this.currentOrientation==TurtleOrientation.COLUMN_LEFT ) {
			this.setCurrentOrientation(TurtleOrientation.ROW_UP);
		}
		
	}
	
}
