 package chapter7.exercise7_21;

public class Turtle {

	private int  [][] floor = new int [20][20];
	private enum Pen {UP ,DOWN};
	Pen position;
	private int direction = 1;
	private int row = 0;
	private int col = 0;
	public void penUp() {
		position= Pen.UP;

		 System.out.println("Pen is UP");
	}

	public void penDown() {
		position = Pen.DOWN;	
		 System.out.println("Pen is DOWN");
	}
	
	public void turnRight() {
		++direction;
		if (direction > 4) {
			direction = 1;
		}
		switch (direction){
		case 1:
			System.out.println(" direction is on the North");
			break;
		case 2:
			System.out.println(" direction is on the East");
			break;
		case 3: 
			System.out.println("direction is on the east South");
			break;
		case 4:
			System.out.println(" derection is on the West");
		
		}
	
			
		}
		
		
	
	public void turnLeft() {
		--direction;
		if(direction == 1) {
			direction = 4;
		}
		switch (direction){
		case 4:
			System.out.println(" derection is on the West");
			break;
		case 3:
			System.out.println("direction is on South");
			break;
		case 2:
			System.out.println("direction is East");
			break;
		case 1:
			System.out.println("direction is North");
	}
		

	}

	public void moveForward(int space) {
		
		if(direction == 1) {
			for( int number = 0; number < space; number++) {
			
				if(position == Pen.DOWN) {
					floor[row][col] = 1;	
				}
				row--;
			}
		}
		
	   if(direction == 2) {
		   for(int number = 0; number < space; number++) {
			   
			   if(position == Pen.DOWN) {
				   floor[row][col] = 1;   
				   
			   }
		   	col++;
		   }
	   }
	
	   if(direction == 3) {
		   for(int number = 0; number < space; number++) {
			   
			   if(position == Pen.DOWN) {
				   floor[row][col] = 1;   
			   }
		   	row++;
		   }
	   }
	
	   if(direction == 4) {
		   for(int number = 0; number < space; number++) {
			   
			   if(position == Pen.DOWN) {
				   floor[row][col] = 1;   
			   }
		   	col--;
		   }
	   
	
	   	}
	
}
		public void displayArray() {
			for(int allrow = 0; allrow < floor.length; allrow++) {
				for(int allcol= 0; allcol < floor[allrow].length; allcol++) {
					if(floor[allrow][allcol] ==  1)
						System.out.print("*");
					else
						System.out.print(" ");			
			}
			      		System.out.println();
		}
	}

		public void  displayTurtle() {
			
			System.out.printf("Turtle position is: %3d%3d%n", row, col);
		}


} 