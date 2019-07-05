package exercise712;

import  java.util.Scanner;

public class DuplicateElimination {
	
	public static boolean checkArray(int[] array, int user) {
		
		for(int value : array) {
			if(value == user) {
				return true;
			}
		}
			return false;
	}
	
	public static void checkDuplicate() {
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		
		for(int count = 0; count < array.length; count++) {
			System.out.println("Enter value: ");
			int x = input.nextInt();
			if(checkArray(array, x) == false) 
				array[count] = x;
			for(int i: array)
				if(i != 0)
					System.out.printf("%d ", i);
			System.out.println();
		}
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}

}
