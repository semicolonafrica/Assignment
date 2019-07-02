package chapter5.exercise524;

public class Diamond {
	public void diamond1() {
		int row = 1, a = 5, b = 1, row1 = 4, space = 1, c= 7, d =1;
		for(int i = row; i <=5; i++) { // for looping from the 1st row to the 5th row
			for (int j = a; j>0; j--) { // creating space in each row
				System.out.print(" "); // print space in each row
			}
			for(int k = 1; k<=d; k++) { // for adding corresponding number of '*' to each row 
				System.out.print("*");	// print "*" 
			}
			System.out.println(" "); // print space between each row
			row += 1; a -=1; b +=2 ; d +=2;	
		}
		for(int i = row1; i >=1; i--) { // to loop from the 6th row down to the 9th row
			for (int j = 0; j<=space; j++){ // loop for adding space to the rows from 6th row to 9th row
				System.out.print(" "); // print space 
			}
			for(int k = c; k>0; k--) { // for adding corresponding number of '*' from 6th to 9th row
				System.out.print("*"); // print "*"	
			}
			System.out.println(" "); // print space between each row from the 6th row to the 9th row
			space +=1; row1 +=1; c -=2;		
		} 	
	}
	public static void main(String[] args) {
		Diamond sample1 = new Diamond();
		//Diamond sample2 = new Diamond();
		sample1.diamond1();
		//sample2.diamond1();
		
	} //end of main method
} //end of class Diamond
