/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Question 7.13
 Purpose: Sales Label
*/

package chapter7.exercise713;

public class SalesLabel2 {

	public static void main(String[] args) {
		int[][] sales = new int[3][5];
		int counter = 0;
		System.out.println("\t" + "col0" + "\tcol1" + "\tcol2" + "\tcol3" + "\tcol4" );
		for(int row = 0; row < sales.length; row++) {
			System.out.print("row" + row + "\t");
			for (int col = 0; col < sales[row].length; col++) {
				counter += 1;
				sales[row][col] = 0;
				System.out.print(counter + "" + sales[row][col]  + "\t ");
			}
			System.out.println();
		}					
	}
}