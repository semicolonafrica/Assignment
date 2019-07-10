package chapter7;

import java.util.Scanner;

public class Air {

	public static Scanner input  = new Scanner(System.in);
	public static boolean isBooked(boolean[] array) {
		
		boolean status = false;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == false) {
				status = true;
			}
			
		}
		return status;
	}
	
	public static void getSeat() {
		
		boolean[] seats = new boolean[10];
		
//		System.out.print("Enter 1 for First Class\n2 for Economy: ");
//		int check = input.nextInt();
		
		while(isBooked(seats)) {
			System.out.print("Enter 1 for First Class\n2 for Economy: ");
			int check = input.nextInt();
			if(check == 1) {

				
				
			}
			
		}
		
	}
}
