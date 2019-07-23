package chapter7;

import java.util.Scanner;

public class Turtle1Graphics {
	
	Turtle1 obj = new Turtle1();
	
	Scanner input = new Scanner(System.in);

	public void moveTurtle() {
		
		System.out.println("Enter 1 for pen up.");
		System.out.println("Enter 2 for pen down.");
		System.out.println("Enter 3 for Turn right.");
		System.out.println("Enter 4 for Turn left.");
		System.out.println("Enter 5 for Move forward different number of spaces.");
		System.out.println("Enter 6 to display array.");
		System.out.println("Enter 9 to end data(Sentinel).");
		
		int a = input.nextInt();
		
		while( a!= 9) {
			if(a == 1) {
				obj.penUp();
			} else if(a == 2) {
				obj.penDown();
			} else if(a == 3) {
				obj.turnRight();
			} else if(a == 4) {
				obj.turnLeft();
			}else if(a == 5) {
				System.out.println("Enter number of spaces: s");
				int spaces = input.nextInt();
				obj.moveForward(spaces);
			}
			else if(a == 6) {
				obj.displayArray();
				
				obj.displayPosition();
				a = input.nextInt();
			}
		} 
		
	}
		
		

	}

