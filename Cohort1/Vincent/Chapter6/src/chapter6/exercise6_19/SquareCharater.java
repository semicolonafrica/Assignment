package chapter6.exercise6_19;

import java.util.Scanner;
//Modify the method created
//in Exercise 6.18 to receive a second parameter of type char called
//fillCharacter. Form the square using the char provided as an
//argument. Thus, if side is 5 and fillCharacter is #, the method
//should displayUse the following statement (in which input is a Scanner object) to
//read a character from the user at the keyboard:

public class SquareCharater {

		public static void displaySquare() {
		
		
		 Scanner input = new Scanner(System.in);
			 System.out.println("enter character");
			char X = input.next().charAt(0);
			
			 int z = Character.getNumericValue(X);
		for(int count = 1; count <= X; count++) {
			
			for(int counter = 1; counter <= X; counter++) {
				System.out.println("#");	
				 
			}
		;
		}

			
		}		
		
	}

