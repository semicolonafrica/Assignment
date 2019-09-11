/**
 * 
 */
package chapter7.exercise7_21;

/**
 * @author Emmanuel Akinbode
 *
 */
public class TurtleGraphic {
	
	private enum Turtle {PENUP,PENDOWN}
	static Turtle command;
	static int [][] shapes = new int[20][20];
	private static int direction = 0;
	private static int row = 0;
	private static int col= 0;
	
	public  static void penDown() {
		Turtle command = Turtle.PENDOWN;
		System.out.println("Pen is down");	
		
	}
	
	public  static void penUp() {
		Turtle command = Turtle.PENUP;
		System.out.println("Pen is up");	
	}
	
	public static void turnRight() {
		
		if(direction == 4) {
			direction = 1;
		}
		showDirection();
		direction++;
	}
	
	public static void turnLeft() {
		
		if(direction == 1) {
			direction = 4;
		}
		showDirection();
		direction--;
	}
	
	 public static void currentPosition() {
		 System.out.printf("Current position is: %d%d ", row, col);
	 }
	 
	 public static void turtleMovement(int move) {
		 
		
			switch(direction) {
			
			case 1:
				 for(int i = 0; i < move; i++) {

						if(command == Turtle.PENDOWN)  
						shapes[row][col] = 1;

						if(command == Turtle.PENUP)
							shapes[row][col] = 0;

						row--;
					}
				 break;
			case 2:
				 for(int i = 0; i < move; i++) {

						if(command == Turtle.PENDOWN)  
						shapes[row][col] = 1;

						if(command == Turtle.PENUP)
							shapes[row][col] = 0;

						col++;
					}
				 break;
			
			case 3:
				 for(int i = 0; i < move; i++) {

						if(command == Turtle.PENDOWN)  
						shapes[row][col] = 1;

						if(command == Turtle.PENUP)
							shapes[row][col] = 0;

						row++;
					}
				 break;
			case 4:
				 for(int i = 0; i < move; i++) {

						if(command == Turtle.PENDOWN)  
						shapes[row][col] = 1;

						if(command == Turtle.PENUP)
							shapes[row][col] = 0;

						col--;
					}
				 break;
				 
			}
			
		}
	 
	 public static void displayBoard() {
		 
			for(int row =0; row < shapes.length; row++) {
				for(int col =0; col<shapes[row].length; col++) {
					
					if(shapes[row][col] == 1) {
						System.out.print("*");
					}else {
						System.out.print("");
					}	

				}
			}
	 }
	
	public static void showDirection() {
		
		if(direction == 1) {
			System.out.println("Direction is North");
		}
		else if(direction == 2) {
			System.out.println("Direction is East");
		}
		else if(direction == 3) {
			System.out.println("Direction is South");
		}
		else if(direction == 4) {
			System.out.println("Direction is West");
		}
	}
	 
	
}
