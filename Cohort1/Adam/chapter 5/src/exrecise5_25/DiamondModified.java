package exrecise5_25;

import java.util.Scanner;
public class DiamondModified {
	public void creatShape() {
		Scanner accept = new Scanner(System.in);
		
		System.out.print("Enter a odd number of rows to form a diamond: ");
		int numberOfRow = accept.nextInt();
		
		int space = numberOfRow, star = 1, mid = numberOfRow/2;
		
		for(int counter = 1; counter <= numberOfRow; counter++) { //this iterate 9 times 
			for(int j=space; j>0; j--) {
				System.out.print(" ");//this gives number of space needed as specified by value of a 
			}
			for(int j=star; j>0; j--) {
				System.out.print("*"); //this gives number of star needed as specified by value of b
			}
			System.out.println();//this brings the cursor to the next line.
			
			if(counter>mid) {
				star-=2;space+=1;//the lower part of it is display here
			}
			else {
				space-=1;star+=2;//this print the upper part of the diamond 
			}	
		}
	}		
}

