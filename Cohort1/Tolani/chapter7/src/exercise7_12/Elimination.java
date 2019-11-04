package exercise7_12;

import java.util.Scanner;

public class Elimination {
	public static Scanner insert = new Scanner(System.in);
	
	public static void eliminate() {
		int[] number = new int[3];
		//System.out.println("Enter input :");
		int input = 0;
		String display =" ";
		
		for(int i = 0;i < number.length;i++) {
			input = insert.nextInt();
			number[i] = input;
			for(int j = i;j <=i;j++) {
				if(input != number[j]) {	
					System.out.println(j + " " +number[j]);
				}
			}
		
			}
			

			
				
			
			
		}
		
		
				
		
		
	
		
	
}
