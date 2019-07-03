package exercise5_11;

import java.util.Scanner;

public class Smallest {

	public int calculateSmallest() {
		// TODO Auto-generated method stub
		
			Scanner insert = new Scanner(System.in);
			
			System.out.print("Enter number of values: ");
			int value = insert.nextInt();
			
			int counter = 1;
			
			System.out.print("Enter number: ");
			int number = insert.nextInt();
			
			int smallest = number;
			
			
			while(counter < value) {
				System.out.print("Enter number: ");
					number = insert.nextInt();
				
				if(number < smallest) {
					
					smallest = number;
					
					}
				counter++;	
				}
				
				insert.close();
				
				//System.out.println("The smallest number is "+smallest);
				
				return smallest;
	}
			
	


}


