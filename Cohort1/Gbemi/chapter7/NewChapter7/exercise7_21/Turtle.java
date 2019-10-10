package exercise7_21;

public class Turtle {
	
	
	private Pen turtlePen;
	
	
	private int direction;
	
	private int currentRow=0;
	
	private int currentColumn =0;
	
	private TurtleOrientation currentOrientation = TurtleOrientation.COLUMN_RIGHT;
	
	
	public void setCurrentOrientation(TurtleOrientation currentOrientation) {
		this.currentOrientation = currentOrientation;
	}


	public TurtleOrientation getCurrentOrientation() {
		return currentOrientation;
	}

	
	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}

	
	
	public Pen getTurtlePen() {
		return turtlePen;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int row) {
		this.currentRow = row;
	}

	public int getCurrentColumn() {
		return currentColumn;
	}

	public void setCurrentColumn(int column) {
		this.currentColumn = column;
	}

	

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void moveForward(int numberOfSpace,SketchPad sketchingPad) {
		
		if( sketchingPad==null||numberOfSpace <=0 || numberOfSpace >  sketchingPad.getFloor().length) {
			throw new IllegalArgumentException("Number of step should be within bounds of the floor!!!");
			
		}
		this.getTurtlePen().setCurrentPosition(PenPosition.DOWN);
		
		
		if(this.getCurrentOrientation()== TurtleOrientation.COLUMN_RIGHT) {
		
		
		int tempCurrentColumn = this.getCurrentColumn();
		
		sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] =1;
		
		for(int i =1; i<numberOfSpace; i++) {
			
			tempCurrentColumn +=1;
			sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] =1;
			
		}
		
		this.setCurrentColumn(tempCurrentColumn);
		
	 }
		else if(this.getCurrentOrientation()== TurtleOrientation.ROW_DOWN) {
			
			int tempCurrentRow = this.getCurrentRow();
			sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] =1;
			
			for(int i =1; i<numberOfSpace; i++) {
				
				tempCurrentRow +=1;
				sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] =1;
				
			}
			
			this.setCurrentRow(tempCurrentRow);
			
		}
			 else if(this.getCurrentOrientation()== TurtleOrientation.COLUMN_LEFT) {
					
					
					int tempCurrentColumn = this.getCurrentColumn();
					
					sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] =1;
					
					for(int i =1; i<numberOfSpace; i++) {
						
						tempCurrentColumn -=1;
						sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] =1;
						
					}
					
					this.setCurrentColumn(tempCurrentColumn);
					
				 }
			
		
		else if(this.getCurrentOrientation()== TurtleOrientation.ROW_UP) {
			
			int tempCurrentRow = this.getCurrentRow();
			sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] =1;
			
			for(int i =1; i<numberOfSpace; i++) {
				
				tempCurrentRow -=1;
				sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] =1;
				
			}
			
			this.setCurrentRow(tempCurrentRow);
			
			
		}
		
	
	
	}
		public void turnRight(){
			if (this.getCurrentOrientation()== TurtleOrientation.COLUMN_RIGHT) {
				this.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
			}
			else if(this.getCurrentOrientation()== TurtleOrientation.ROW_DOWN) {
				this.setCurrentOrientation(TurtleOrientation.COLUMN_LEFT);
			}
			
			else if (this.getCurrentOrientation()== TurtleOrientation.COLUMN_LEFT) {
				this.setCurrentOrientation(TurtleOrientation.ROW_UP);
			}
			
		
			
		
	}
	
	
	
	

}
