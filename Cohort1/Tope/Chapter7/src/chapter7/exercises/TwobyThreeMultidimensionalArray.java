package chapter7.exercises;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 7.9
//Two by three integer array t
public class TwobyThreeMultidimensionalArray {

	public static void statements() {
		
		//Question 1
		//Write a statement that declares and creates
		 final int rows = 2;
		 final int colomn = 3;
		int[][] t = new int[rows][colomn];
		
		//Question 5
		//Write access expressions for all the elements in row 1 of t.
		int a  = t[1][0];
		int b = t[1][1];
		int c = t[1][2];
		
		//Question 6
		//Write access expressions for all the elements in column 2 of t.
		int d = t[0][1];
		int e = t[1][1];
		
		//Question 7
		//Write a single statement that sets the element of t in row 0 and
		//column 1 to zero.
		t[0][1] = 0;
		
		//Question 8
		//Write individual statements to initialize each element of t to
		//zero.
		t[0][0] = 0;
		t[0][1]= 0;
		t[0][2] =0;
		t[1][0]= 0;
		t[1][1] =0;
		t[1][2] = 0;
		
		//Question 9
		//Write a nested for statement that initializes each element of t to
		//zero.
		
		for(int roww =0; roww<rows; roww++) {
			
			for(int colomnn = 0; colomnn<colomn; colomnn++) {
				
				t[roww][colomnn] = 0;
				
			}	
		}
		
		//Question 10
		//Write a nested for statement that inputs the values for the
		//elements of t from the user.
		Scanner input = new Scanner(System.in);
		int values;
		
		for(int roww =0; roww< rows; roww++) {
			
			for(int colomnn =0; colomnn< colomn; colomnn++ ) {
				
				t[roww][colomnn] = input.nextInt();
			}
		}
			
			
		
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		statements();
		

	}

}
