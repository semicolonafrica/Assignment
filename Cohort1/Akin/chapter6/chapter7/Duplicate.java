package chapter7;

import java.util.Scanner;

public class Duplicate {

	public static boolean searchArray(int[] array, int number) {
		
		boolean status = false;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == number) {
				status = true;
			}
			
		}
		return status;
	}
	
	public static void duplicate() {
		
		int[] newArray = new int[5];
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		for(int i = 0; i < newArray.length; i++) {
			
			num = input.nextInt();
			String store = "";
			if(!(searchArray(newArray,num))) {
				
					store = store + " " + num;
						
				
				System.out.print(store);
			}
			
		}
		input.close();
	}
	
	public static void main(String[] args) {
		duplicate();
	}
	
	
	
}
