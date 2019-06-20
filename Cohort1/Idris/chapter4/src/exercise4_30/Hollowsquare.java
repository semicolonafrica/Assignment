package exercise4_30;

import java.util.Scanner;

public class Hollowsquare {
	
	Scanner accept = new Scanner(System.in);
	
	public void displayHollowsquare() {

		 int column;
		 int row = 1;
		 
		 System.out.print("Enter number of side: " );
		 int side = accept.nextInt();
		 while(row<= side) { 
			 
			 column =1;
			 while(column <= side) {
				 
				 if(row ==1) {
					 System.out.print("*");
				 }
				 else if(row ==side) {
					 System.out.print("*");
				 }
				 else if(column == 1) {
					 System.out.print("*");
				 }
				 else if(column == side) {
					 System.out.print("*");
			     }
				 else {
					 System.out.print(" ");
				 }
				 column++;
			 
			 	}
			 		System.out.println();
			 		row++;
		 	}
		
	}
}


