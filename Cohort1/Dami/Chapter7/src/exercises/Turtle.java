package exercises;

public class Turtle {
	//Floor class of 20 by 20 array.
	int[][] floor = new int[20][20];
	int direction = 1;
	int row = 0;
	int col = 0;
	
	//Enum class for pen positions.
	enum Pen{UP, DOWN}
		Pen position;
	
	//Methods for pen positions
	public void penUp() {
		position = Pen.UP;
		//return position;
	System.out.println("Pen is Up");
	}
	
	
	public void penDown() {
		position = Pen.DOWN;
		//return position;
		System.out.println("Pen is down");
	}
	
	
	//Turtle Direction Methods
	// Method TurnRight (Clockwise turn)
	public void turnRight() {
		++direction;
		if(direction > 4) {
			direction = 1;
		}
		
		if (direction == 1) {
			System.out.printf("%s%n", "True North! Turtle is facing Sabo-Yaba");			
		}
		if (direction == 2) {
			System.out.printf("%s%n", "East! Turtle is facing Yabatech");			
		}
		if (direction == 3) {
			System.out.printf("%s%n", "South! Turtle is facing Unilag");			
		}
		if (direction == 4) {
			System.out.printf("%s%n", "West! Turtle is facing Oyingbo");			
		}
		
	}
	
	//Method TurnLeft (Anti-Clockwise turn)
	public void turnLeft() {
		if (direction == 1) {
			direction = 4;
		}
		else {
			direction--;
		}
		if (direction == 1) {
			System.out.printf("%s%n", "True North! Turtle is facing Sabo-Yaba");			
		}
		if (direction == 2) {
			System.out.printf("%s%n", "East! Turtle is facing Yabatech");			
		}
		if (direction == 3) {
			System.out.printf("%s%n", "South! Turtle is facing Unilag");			
		}
		if (direction == 4) {
			System.out.printf("%s%n", "West! Turtle is facing Oyingbo");			
		}
	}
	
	//Method Move Forward
	public void moveForward(int x) {
		switch(direction) {
			case 1: 
				for(int i = 0; i < x ; i++) {
					if(position == Pen.DOWN) {
						++floor[row][col];
						}
					row--;
				}
				break;
			case 2:
				for(int i = 0; i < x ; i++) {
					if(position == Pen.DOWN) {
						++floor[row][col];
					} 
					col++;
				}
				break;
			case 3:
				for(int i = 0; i < x ; i++) {
					if(position == Pen.DOWN) {
						++floor[row][col];
					} 
					row++;
				}
				break;
			case 4:
				for(int i = 0; i < x ; i++) {
					if(position == Pen.DOWN) {
						++floor[row][col];
					}
					col--;
				}
				break;
		}
	}

	//Method to Display Array
	public void displayArray() {
		for(int i = 0; i < floor.length; i++) {
			
			for(int a = 0; a < floor[i].length; a++) {
				
				if (floor[i][a] == 1) {
					System.out.printf("%s", "*");
				}
			else 
				System.out.print(" ");
					
			}	
		System.out.println();
		}
	}

	// Method to display turtle position
	public void printLocation() {
		System.out.printf("Turtle position is: (%3d%3d)%n", row, col);
	}


}

