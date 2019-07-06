package twoByThreeArray;

import java.util.Scanner;

public class TwoByThree {
	
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
			
			System.out.println("Enter values to the Array");
			for(int roww =0; roww< rows; roww++) {
				
				for(int colomnn =0; colomnn< colomn; colomnn++ ) {
					
					t[roww][colomnn] = input.nextInt();
				}
			}
			
			//Question 11
			//Write a series of statements that determines and displays the
			//smallest value in t.
			int smallestValue = t[0][0];
			for(int i = 0; i< rows; i++) {
				for(int x = 0; x< colomn; x++) {
					
					if(smallestValue > t[i][x])
					smallestValue = t[i][x];
				}
				
			}
			System.out.println(smallestValue);
			
			//Question 12
			//Write a single printf statement that displays the elements of
			//the first row of t.
			System.out.printf("%d %d %d%n", t[0][0], t[0][1], t[0][2] );
			
			//Question 13
			//Write a statement that totals the elements of the third column of
			//t. Do not use iteration
			int total = t[0][2] + t[1][2];
			System.out.println(total);
			
			//Question 14
			//Write a series of statements that displays the contents of t in
			//tabular format. List the column indices as headings across the
			//top, and list the row indices at the left of each row.
			
			
			int v =0; //Variable to hold subscript value of colomn
			System.out.print("\n   c0  c1   c2");
			for(int i = 0; i< rows; i++) {
				
				for(int x = 0; x< colomn; x++) {
					
					if(x % 3 == 0)
						System.out.println();
					
					if(x ==0) {
						System.out.printf("r%d  ", v);
						v++;
						}
					
					System.out.printf("%d   ",t[i][x]);
					
				}
				
			}	
			
		}
		
		public static void main(String[] args) {
			statements();
			

		}

	}