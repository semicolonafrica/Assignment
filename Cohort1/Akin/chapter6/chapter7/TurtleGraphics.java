package chapter7;

import java.util.Scanner;

public class TurtleGraphics {
	public static Scanner input = new Scanner(System.in);
	static int row;
	static int column;
	
	
		public static void direction(int[][] array, char character) {

			for(int i = 0; i < array.length;i++) {

					System.out.print(character);
					} 
					
				
			System.out.println();
			for(int i = 0;i < array.length - 2; i++) {
				for(int k = 0; k < 1; k++) {
					System.out.print(character);
				}
				
				for(int j = 0; j < array.length -2;j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < 1; k++) {
					System.out.print(character);
				}
				System.out.println();
			}
			//turnRight(floor,character);
			
			for(int i = 0; i < array.length;i++) {
				//for(int j = 0; j < array[i].length; j++) {
					//if(direction == 1) {
					System.out.print(character);
					} 
					
				}
				//System.out.println();
			
			
		//}
//		public static void turnRight(int[][] array, char character) {
//			
//			System.out.print("Enter 3 to turn right");
//			int direction = input.nextInt();
//			
//			for(int i = 0; i < array[0].length; i++) {
//				if(direction == 3) {
//					System.out.print(character);
//				}
//			}
//			
//		}
		public static void turnLeft(int[][] array, char character) {
			
			for(int i = 0;i < array.length - 2; i++) {
				for(int k = 0; k < 1; k++) {
					System.out.print(character);
				}
				
				for(int j = 0; j < array.length -2;j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < 1; k++) {
					System.out.print(character);
				}
				System.out.println();
			}
		}
		

		
		
		

	
}
