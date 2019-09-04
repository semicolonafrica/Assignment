/**
 * 
 */
package exercise7_21;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Olabisi
 *
 */
public class Turtle {

	private int direction;	
	private int currentRow = 0;
	private int currentColumn = 0;
	private TurtleOrientation currentOrientation = TurtleOrientation.COLUMN_RIGHT;	
	private Pen turtlePen;
	
	public void setCurrentOrientation(TurtleOrientation newOrientation) {
		this.currentOrientation = newOrientation;
	}
	
	public TurtleOrientation getCurrentOrientation() {
		return this.currentOrientation;
	}
	
	public void setDirection(int buhari) {
		this.direction = buhari;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public void setTurtlePen(Pen somePen) {
		this.turtlePen = somePen;
	}
	
	public Pen getTurtlePen() {
		return turtlePen;
	}

	/**
	 * @return the row
	 */
	public int getCurrentRow() {
		return currentRow;
	}

	/**
	 * @param row the row to set
	 */
	public void setCurrentRow(int row) {
		this.currentRow = row;
	}

	/**
	 * @return the column
	 */
	public int getCurrentColumn() {
		return currentColumn;
	}

	/**
	 * @param column the column to set
	 */
	public void setCurrentColumn(int column) {
		this.currentColumn = column;
	}
	
	public void moveForward(int numberOfSteps, SketchPad sketchingPad) {
		if(sketchingPad == null || numberOfSteps <= 0 || numberOfSteps > sketchingPad.getFloor().length) {
			throw new IllegalArgumentException("Sketching pad is required and number of steps should be within bounds of the floor");
		}
			
		this.getTurtlePen().setCurrentPosition(PenPosition.DOWN);
		if(this.getCurrentOrientation() == TurtleOrientation.COLUMN_RIGHT) {
			int tempCurrentColumn = this.getCurrentColumn();
			sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] = 1;
			
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentColumn += 1;
				sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] = 1;
			}
			this.setCurrentColumn(tempCurrentColumn);
		} else if(this.getCurrentOrientation() == TurtleOrientation.ROW_DOWN){
			int tempCurrentRow = this.getCurrentRow();
			sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] = 1;
			
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentRow += 1;
				sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] = 1;
			}
			this.setCurrentRow(tempCurrentRow);
		} else if(this.getCurrentOrientation() == TurtleOrientation.COLUMN_LEFT){
			int tempCurrentColumn = this.getCurrentColumn();
			sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] = 1;
			
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentColumn -= 1;
				sketchingPad.getFloor()[this.getCurrentRow()][tempCurrentColumn] = 1;
			}
			this.setCurrentColumn(tempCurrentColumn);
		} else if(this.getCurrentOrientation() == TurtleOrientation.ROW_UP){
			int tempCurrentRow = this.getCurrentRow();
			sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] = 1;
			
			for(int i = 1; i < numberOfSteps; i++) {
				tempCurrentRow -= 1;
				sketchingPad.getFloor()[tempCurrentRow][this.getCurrentColumn()] = 1;
			}
			this.setCurrentRow(tempCurrentRow);
		}
	}
	
	public void turnRight() {
		if(this.getCurrentOrientation() == TurtleOrientation.COLUMN_RIGHT) {
			this.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
		} else if(this.getCurrentOrientation() == TurtleOrientation.ROW_DOWN){
			this.setCurrentOrientation(TurtleOrientation.COLUMN_LEFT);
		} else if(this.getCurrentOrientation() == TurtleOrientation.COLUMN_LEFT){
			this.setCurrentOrientation(TurtleOrientation.ROW_UP);
		}
		
	}
	
	public void turnLeft() throws FileNotFoundException {
		FileNotFoundException anException = new FileNotFoundException("I didn't even bother looking");
		throw anException;
	}
	
	public void displayCurrentPosition() throws SQLException {
		try {
			this.turnLeft();
		} catch(FileNotFoundException fnex) {
			throw new SQLException(fnex);
		}
	}
}
