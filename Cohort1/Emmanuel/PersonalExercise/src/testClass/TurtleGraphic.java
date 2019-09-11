package testClass;

	
	public class TurtleGraphic {

		private static int[][] floor = new int[20][20];
		private static int row = 0; 
		private static int col = 0; 
		private static int direction = 1;

		private enum Turtle{UP, DOWN};
		static Turtle command;
		
		
		public void Position() {
			row = 0;
			col = 0;

		}

		public void penUP() {
			 command = Turtle.UP;
			 System.out.println("PEN UP");
		}

		public void penDOWN() {
			command = Turtle.DOWN;
			System.out.println("PEN DOWN");
		}

		public void displayPosition() {
			System.out.printf("Turtle position: %d, %d", row,col);
		}

		public void displayArrayFloor() {

			for(int rows = 0; rows < floor.length; rows++) {

				for(int col = 0; col < floor[rows].length; col++) {


					if(floor[rows][col] == 1) {
						System.out.print("*");
					}
					else
						System.out.print(" ");

				}
				System.out.println();
			}
		}


		public void directionTurnRight() {


			   direction++;
			if (direction > 4) {
				direction = 1;
			}
			turtleDirection();

		}
		public void directionTurnLeft() {


			if(direction == 1) {
				direction = 4;
			}
			else 
				direction--;
			turtleDirection();
		}
		
		public void turtleDirection() {
			if(direction == 1) {
				System.out.println("Turtle direction is North");
			}
			else if(direction == 2)
				System.out.println("Turtle direction is East");
			else if(direction == 3)
				System.out.println("Turtle direction is South");
			else if(direction == 4)
				System.out.println("Turtle direction is West");

		}


		public void forwardMovement(int spaces) {

			switch(direction) {

			case 1: 
				
				for(int count = 0; count < spaces; count++) {

					if(command == Turtle.DOWN)  
					floor[row][col] = 1;

					if(command == Turtle.UP)
						floor[row][col] = 0;

					row--;
				}
				
				
				break;
			case 2:
				
				for(int count = 0; count < spaces; count++) {

					if(command == Turtle.DOWN) 
					floor[row][col] = 1;

					if(command == Turtle.UP)
						floor[row][col] = 0;

					col++;
				}
				
				
				break;
			case 3: 
			
				for(int count = 0; count < spaces; count++) {
					if(command == Turtle.DOWN)
					floor[row][col] = 1;

					if(command == Turtle.UP)
						floor[row][col] = 0;
					row++;
				}
				break;
				
			case 4: 
				

				for(int count = 0; count < spaces; count++) {

					if(command == Turtle.DOWN)
					floor[row][col] = 1;

					if(command == Turtle.UP)
						floor[row][col] = 0;

					col--;
				}
				

			
}
		}
	}
