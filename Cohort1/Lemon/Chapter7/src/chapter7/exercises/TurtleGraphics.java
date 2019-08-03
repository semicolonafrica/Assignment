package chapter7.exercises;

public class TurtleGraphics {	
	 int [][] floor = new int [20] [20];
	
	 int row = 0;
	 int col = 0;
	 int direction = 1;
	private	enum Pen{UP,DOWN}; //type that represent when pen is up or down
	
	  Pen status;// contains pen up or down 
	
	public  void moveUp(int space) {
		for(int i=0; i<space; i++) {
			if(status == Pen.DOWN) {
				++floor[row][col];
			}
			--row;
		}
	}	
	public  void moveDown(int space) {
		for(int i=0; i<space; i++) {
			if(status == Pen.DOWN) {
				++floor[row][col];
			}
			++row;
		}
	}	
	public  void penDown() {
		status=Pen.DOWN;
		System.out.println("Pen is down");
	}	
	public void penUp() {
		status=Pen.UP;
		System.out.println("Pen is up");
	}

	public void moveForward(int no_of_spaces) {

		switch (direction) {

		case 1:
			try {
				for (int x = 0; x < no_of_spaces; x++) {

					if (status == Pen.DOWN)
						floor[row][col] = 1;

					if (status == Pen.UP)
						floor[row][col] = 0;

					row--;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				row = 0;
			}

			break;
		case 2:
			try {
				for (int x = 0; x < no_of_spaces; x++) {

					if (status == Pen.DOWN)
						floor[row][col] = 1;

					if (status == Pen.UP)
						floor[row][col] = 0;

					col++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				col = 0;
			}
			break;
		case 3:
			try {
				for (int x = 0; x < no_of_spaces; x++) {
					if (status == Pen.DOWN)
						floor[row][col] = 1;

					if (status == Pen.UP)
						floor[row][col] = 0;
					row++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				row = 0;
			}
			break;
		case 4:
			try {

				for (int x = 0; x < no_of_spaces; x++) {

					if (status == Pen.DOWN)
						floor[row][col] = 1;

					if (status == Pen.UP)
						floor[row][col] = 0;

					col--;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Border exceeded");
				col = 0;
			}
		}
	}

	public void displayArray(char sign) {
		for(int i=0; i<floor.length; i++) {
			for(int x=0; x<floor[i].length; x++) {
				if(floor[i][x] ==1) {
					System.out.print(sign);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}	
	public void turnRight() {
		direction++;
		if(direction >4) {
			direction =1;
		}
		turtleFace();
	}
	public void turnLeft() {
		
		if(direction ==1) {
			direction =4;
		}else 
			direction --;
		turtleFace();
	}
	
	public void turtleFace() {
		
		if(direction == 1) {
			System.out.println("Turtle is facing North");
		}
		if(direction == 2) {
			System.out.println("Turtle is facing East");
		}
		if(direction == 3) {
			System.out.println("Turtle is facing South");
		}
		if(direction == 4) {
			System.out.println("Turtle is facing West");
		}
	}
	
	public void displayPosition() {
		System.out.printf("turtle Position is:(%d%5d)%n",row,col);
	}	
}