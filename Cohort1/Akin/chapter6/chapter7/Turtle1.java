package chapter7;

	public class Turtle1 {

	enum Pen {UP, DOWN};
	Pen position;
	int direction = 1;
	int col = 0;
	int row = 0;
	
	int[][] floor = new int[20][20];
	char shape;
	
	public void penUp() {
		
		position = Pen.UP;
		System.out.println("pen is up");
		
	}
	
	public void penDown() {
		
		position = Pen.DOWN;
		System.out.println("pen is down");
		
	}
	
	
	public void turnRight() {
		
		if(direction == 4) {
			direction = 1;
		}
		else {
			direction++;
		}
		if(direction == 1) {
			System.out.println("Turtle is facing North.");
		}
		else if(direction == 2) {
			System.out.println("Turtle is facing East.");
		}
		else if(direction == 3) {
			System.out.println("Turtle is facing South.");
		}
		else if(direction == 4) {
			System.out.println("Turtle is facing West.");
		}
	}
	
	public void turnLeft() {
		
		if(direction == 1) {
			direction = 4;
		}
		else {
			direction--;
		}
		if(direction == 1) {
			System.out.println("Turtle is facing North.");
		}
		else if(direction == 2) {
			System.out.println("Turtle is facing East.");
		}
		else if(direction == 3) {
			System.out.println("Turtle is facing South.");
		}
		else if(direction == 4) {
			System.out.println("Turtle is facing West.");
		}
	}
	
	public void moveForward(int spaces) {
		if(direction == 1) {
			for(int i = 1; i <= spaces; i++) {
				floor[row][col] = 1;
				row--;
			}
		}
		else if(direction == 2) {
			for(int i = 1; i <= spaces; i++) {
				floor[row][col] = 1;
				col++;
			}
		}
		else if(direction == 3) {
			for(int i = 1;i <= spaces;i++) {
				floor[row][col] = 1;
				row++;
			}
		}
		else if(direction == 4) {
			for(int i = 1;i <= spaces;i++) {
				floor[row][col] = 1;
				col--;
			}
		}
		
	}
	
	public void displayArray() {
		for(int i = 0; i < floor.length;i++) {
			for(int j = 0; j < floor[i].length;j++) {
				if(floor[i][j] == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void displayPosition() {
		System.out.println("The current position is (" + row + ", " + col + ")");
	}
	
	
	
}
