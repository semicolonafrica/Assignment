package duplicateElimination;

import java.util.Scanner;


public class SearchArray {
	
	public static boolean searchArray(int[] array, int number) {
		
		
		boolean isDuplicate = false;
		
		for(int i =0; i < array.length; i++) {
			
			if(array[i] == number)
				isDuplicate = true;		
		}
		return isDuplicate;
	}
	
	
	
	
	public static void duplicateArray() {
		final int MY_ARRAY_LENGTH = 5;
		int[] myArray = new int[MY_ARRAY_LENGTH];
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Enter number between 10 and 100");
		
		for(int i =0; i<myArray.length; i++) {
			
			number = input.nextInt();
			
			if(number < 10 || number > 100) {
				System.err.println("number out of range");
				break;
			}
				
			
			if(!(searchArray(myArray, number))) {
				System.out.println(number);
					
			myArray[i] = number;
			}
			
			for(int num : myArray) {
				
				if(num !=0)
				System.out.printf("%d ", num);
			}
	
		}
				
		input.close();
		
		System.out.println();
		
		for(int displayArray : myArray) {
			System.out.printf("%d ", displayArray);
			}
		
	}
		
	public static void main(String[] args) {
		
		duplicateArray();
	
	}

}