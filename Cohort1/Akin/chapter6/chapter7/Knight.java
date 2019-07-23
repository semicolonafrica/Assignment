package chapter7;

import java.util.Scanner;

public class Knight {
	public static Scanner input = new Scanner(System.in);
	public static int[][] knight = new int[8][8];
	public static void assign() {
		
		//Declare an 8 x 8 matrix;
		int[] horizontal = new int[8];
		int[] vertical = new int[8];
		
		
		
		//Assign values into the horizontal matrix as speculated;
		horizontal[0] = 2;
		horizontal[1] = 1;
		horizontal[2] = -1;
		horizontal[3] = -2;
		horizontal[4] = -2;
		horizontal[5] = -1;
		horizontal[6] = 1;
		horizontal[7] = 2;
		
		//Assign values into the horizontal matrix as speculated;
		vertical[0] = -1;
		vertical[1] = -2;
		vertical[2] = -2;
		vertical[3] = -1;
		vertical[4] = 1;
		vertical[5] = 2;
		vertical[6] = 2;
		vertical[7] = 1;
		
		int moveNum = 0;int[] array, int number
		int count = 0;
		int currentRow = 0, currentColumn = 0;
		
		for(int i = 0; i < 64; i++) {
			moveNum = input.nextInt();
			currentRow += vertical[moveNum];
			currentColumn += horizontal[moveNum];
			
			if(currentRow >= 0 && currentRow < 8 && currentColumn >= 0  && currentColumn < 8) {
				if(knight[currentRow][currentColumn] != 1) {
					knight[currentRow][currentColumn] = 1;
					System.out.printf("%n(Currentrow,CurrentColumn): %d (%d,%d)%n%n",moveNum,currentRow,currentColumn);
					count++;
					displayKnight(knight);
				}
				else {
					break;
				}
			}

			
		}
		System.out.println();
		
		//displayKnight(knight);
		System.out.printf("%n%n%s: %d","The number of moves made by the Knight",count);
	}
	
	public static void displayKnight(int[][] knight) {
		
		for(int i = 0; i < knight.length; i++) {
			for(int j = 0; j < knight[i].length; j++) {
				if(knight[i][j] == 1) {
				System.out.print("K ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
	}
		
		
		
	}
	
	public static void main(String[] args) {
		assign();
	}

	
	
}
