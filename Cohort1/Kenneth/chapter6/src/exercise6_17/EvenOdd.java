package exercise6_17;

import java.util.Scanner;

public class EvenOdd {
	
	public static boolean isEven() {
		
		
		Scanner insert = new Scanner(System.in);
		
		
		System.out.print("Enter number: ");
		int num = insert.nextInt();
		
		while (num != -1) {
			

			if(num % 2 == 0) {
				
				System.out.println("even");
			}
			else { 
				System.out.println("odd");
			}
			System.out.print("Enter number: ");
			num = insert.nextInt();
		}
	
		insert.close();
		return false;
		
		
		
		
	}
	



}
