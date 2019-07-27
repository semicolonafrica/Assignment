/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
import java.util.Scanner;



public class TurtleGraphics {
	
	private static enum Status {PENDOWN,PENUP}
	private static int[][] floor=new int[20][20];
	private static int row;
	private static int column;
	private static int direction = 1;
	static Status gameState;
	
	public static void displayArray(char sign) {
		
		 for (row=0;row<floor.length;row++) {
			 
			 for(column=0;column<floor[row].length;column++) {
				 
				 if(floor[row][column]== 1) {
					 
					 System.out.print(sign);
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		
	}
	
	
	public static void moveForward(int spaces) {
		
		
		switch(direction) {
		
		case 1:
			for(int count=0;count<spaces;count++) {
				
				if(gameState == Status.PENDOWN) {
					floor[row][column] = 1;
				}
				row--;
			}
			
			break;
		case 2:
			for(int count=0;count<spaces;count++) {
				
				if(gameState == Status.PENDOWN) {
					floor[row][column] = 1;
				}
				column++;
			}
			break;
		case 3:
			for(int count=0;count<spaces;count++) {
				
				if(gameState == Status.PENDOWN) {
					floor[row][column] = 1;
				}
				row++;
			}
			break;
		case 4:
			for(int count=0;count<spaces;count++) {
				
				if(gameState == Status.PENDOWN) {
					floor[row][column] = 1;
				}
				
				column--;
				
			}
				
		}
		printTurtlePosition();
		
	}
	
	public static void moveRight() {
		
		 direction++;
		if(direction>4)
			direction=1;
		
		printDirection();
		
	}
	
	public static void moveLeft() {
		
		if(direction==1) {
			direction+=3;
		}
		else {
			direction--;
		}
		printDirection();
		
	}
	
	public static void penDown() {
		
		gameState =Status.PENDOWN;
	}
	
	public static void penUp() {
		
		gameState = Status.PENUP;
	}
	public static void printDirection() {
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
	public static void printTurtlePosition() {
		
		System.out.printf("Turtle position is, (%d, %d)%n", row, column);
	}
	
//	private static int penup=1;
//	
//	private static int pendown=2;
//	
//	private static int forward=3;
//	
//	private static int moveRight=4;
//	static Scanner accept=new Scanner(System.in);
//	
//	public static String moveForward(char sign) {
//		
//	
//		
//		System.out.println("enter 3 to move forward");
//		int value3=accept.nextInt();
//		System.out.println("enter of spaces");
//		int spaces=accept.nextInt();
//		if(value3==forward) {
//			for(int i=0;i<spaces;i++) {
//				System.out.print(sign);
//				
//			}
//			
//		}
//		return"";
//	}
//	
//	public static void penDown() {
//		System.out.println("enter 2 for pendown");
//		int value2=accept.nextInt();
//		if(value2==pendown) {
//			
//			String write=moveForward('$');
//			
//			System.out.println(write);
//			
//		}
//		
//	}
//	
//	public static void penUp() {
//		System.out.println("enter 1 for penup");
//		int value1=accept.nextInt();
//		
//		if(value1==penup) {
//			String move=moveForward(' ');
//			System.out.println(move);
//		}
//	}
//	
//	public static void moveRight() {
//		System.out.println("enter 4 to move right");
//		int value4=accept.nextInt();
//		System.out.println("enter number of spaces");
//		int spaces=accept.nextInt();
//		if(value4==moveRight) {
//			for(int y=0;y<spaces;y++) {
//				System.out.println(moveForward('*')+"$");
//			}
//		}
//	}
//	public static void getGame() {
//		System.out.println("enter 1 for penup");
//		System.out.println("enter 2 for pendown");
//		System.out.println("enter 3 to move forward");
//		System.out.println("enter 4 to move right");
//		int input=accept.nextInt();
//	int turtle=0;
//	switch(turtle) 
//	{
//	case 1:
//		penUp();
//		break;
//	case 2:
//		penDown();
//		break;
//	case 3:
//		moveForward('*');
//		break;
//	case 4:
//		moveRight();
//
//		
//	
//	}
//	}
//	public static void main(String[] args) {
//		//moveForward('@');
//	penDown();
//		//
//	penUp();
//		
////		moveRight();
//		//getGame();
//	}

}
