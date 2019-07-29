package chapter7.exercises;

import java.util.Scanner;

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
	}	
	public void penUp() {
		status=Pen.UP;
	}	
	public  void moveRight(int space) {
		for(int i=0; i<space; i++) {
			if(status == Pen.DOWN) 
				++floor[row][col];
				col++;
			
		}		
	}	
	public void moveLeft(int space) {
		for(int i=0; i<space; i++) {
			if(status == Pen.DOWN)
			++floor[row][col];
			col--;
		}
	}	
	public void moveForward(int space) {
		
		switch(direction) {
			case 1:
				moveUp(space);
				break;
			case 2:
				moveRight(space);
				break;
			case 3:
				moveDown(space);
				break;
			case 4:
				moveLeft(space);
				break;
		}
	}	
	public void displayArray() {
		for(int i=0; i<floor.length; i++) {
			for(int x=0; x<floor[i].length; x++) {
				if(floor[i][x] ==1) {
					System.out.print("$");
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
	public void turnLeft() {
		direction--;
		if(direction >4) {
			direction =1;
		}
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
	
	public void displayTurtle() {
		Scanner input = new Scanner(System.in);
		
		int numb = 0;
		
		System.out.println("Enter your Command choice(9 to end):");
		System.out.println("(1)	Pen up");
		System.out.println("(2)	Pen down");
		System.out.println("(3)	Turn right");
		System.out.println("(4)	Turn left");
		System.out.println("(5)	Move 10 spaces forward");
		System.out.println("(6)	Display  the shape");
		
		while(numb != 9) {
			numb = input.nextInt();
			switch(numb) {
				case 1:
					System.out.println("Turtle faces North");
					penUp();
					break;
				case 2:
					System.out.println("Turtle faces South");
					penDown();
					break;
				case 3:
					System.out.println("Turtle faces East");
					turnRight();
					break;
				case 4:
					System.out.println("Turtle faces West");
					turnLeft();
					break;
				case 5:
					System.out.println("Enter number of spaces");
					int value = input.nextInt();
					moveForward(value);
				case 6:
					displayArray();
					break;
			}
		}		
	}
}