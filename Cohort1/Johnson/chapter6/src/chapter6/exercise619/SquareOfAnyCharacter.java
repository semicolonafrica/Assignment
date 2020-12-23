package chapter6.exercise619;

import java.util.Scanner;
public class SquareOfAnyCharacter {
	public static void squareOfAnyCharacter(int side, char fillCharacter) {
		for (int i= 1; i<= side; i++) {
			for(int a = 1; a<=side; a++) {
				System.out.print(fillCharacter+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void squareOfAnyCharacter1(int side, char fillCharacter) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the filling character: ");
		fillCharacter = input.next().charAt(0);
		
		for (int i= 1; i<= side; i++) {
			for(int a = 1; a<=side; a++) {
				
				System.out.print(fillCharacter+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//squareOfAnyCharacter(4, '#');
		//squareOfAnyCharacter(9, '$');
		//squareOfAnyCharacter(13, '%');
		
		squareOfAnyCharacter1(4,'%');
		squareOfAnyCharacter1(6,'%');
		squareOfAnyCharacter1(8,'%');

	}

}
