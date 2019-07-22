package exercise7_21;

import java.util.Scanner;

public class TurtleGraphics {
	static Scanner in = new Scanner(System.in);
	
	static int[][] floor = new int [20][20];
	static int row;
	static int column;
	static int direction = 1;
	static int value;
	
	System.out.print("Enter value:");
	 value = in.nextInt();	

	
	private enum Pen{UP, DOWN};	
	
	public static void penStatus() {
		}
	public static void penUp() {
		if(value == 1){
			Pen DOWN;
			}
		}
	public static void penDown() {
		if(value == 2) {
			Pen UP;
		}
	}
	public static void turnLeft() {
		if(direction == 1) {
		direction += 3;
		}
		else {
			direction--;
		}
		//System.out.print(floor[row][column]);
		
	}
	public static void turnRight() {
		if(direction == 3) {
			
		}
		System.out.print(floor[row][column]);
	}
	public static void moveUp() {
		if(value == 5) {
			++floor[row][column];
		}
		System.out.print(floor[row][column]);
		row--;
	}
	public static void moveRight() {
		if(value == 6){
			++floor[row][column];
		}
		System.out.print(floor[row][column]);
		column++;
	}
	public static void moveDown() {
		if(value == 7) {
			++floor[column][row];
		}
		System.out.print(floor[row][column]);
		row++;
	}
	public static void moveLeft() {
		if(value == 8) {
			++floor[column][row];
		}
		System.out.print(floor[row][column]);
		column--;
	}
	public static int dispalyFloor() {
		if(value == 6) {			
		for(row = 0; row < floor.length; row++) {
			for(int column = 0; column <= floor[row].length; column++) {
				System.out.println(floor[row][column]);
			}
		}
	}
		System.out.print(floor[row][column]);				
}
	
	public static void display() {
		if(value == 6) {		
		for(int row = 0; row < floor.length; row++) {
			for(int column = 0; column <= floor[row].length; column++) {
				if(floor[row][column] == 1) {
					System.out.print("+");
				}
				else {
					System.out.print(" ");
					}
				}
			}
		}
		System.out.print(floor[row][column]);
	}
}