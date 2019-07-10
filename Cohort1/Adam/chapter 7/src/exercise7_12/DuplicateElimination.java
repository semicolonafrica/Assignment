package exercise7_12;

import java.util.Scanner;

public class DuplicateElimination {
	
	public static boolean scanNumber(int[] array, int number) {
		
		boolean condition = false;
		
		for(int i = 0; i < array.length; i++) {
		
			if( array[i] == number) 
				 
				condition = true;
			
		}
		return condition;
	}
	
	public static void display() {
		Scanner input = new Scanner(System.in);
		
		
		int[]array = new int[5];
		int number;
		
		
		System.out.println("Enter Five digit to compare");
		
		for(int j = 0; j < array.length; j++) {
			
			number = input.nextInt();
			
			if(!(scanNumber(array, number))) {
			
			System.out.printf("%d%n", number);
			
			array[j] = number;
			}
			else {
				j-=1;
			}
			for(int value : array) {
				
				if(value!=0)
					System.out.printf("%d ", value);
			}
		}
	}
	
	public static void main(String[] args) {
		
		display();
		

	}
	
	
}
