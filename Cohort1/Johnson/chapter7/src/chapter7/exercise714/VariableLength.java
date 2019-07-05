/* Author: ADEBAYO Johnson
 Date: 04/07/2019 
 Location of exercise:  Exercise7, Question 7.14
 Purpose: For calculating product of series of integers
*/

package chapter7.exercise714;

public class VariableLength {
	static int[] array1 = {1,2,3,10}, array2 = {10,20,30,40,50,60}, 
				array3 = {1,3,5,7,9,11};
	//static int[] array2 = {10,20,30,40,50,60};
	//static int[] array3 = {1,3,5,7,9,11};
	public static void main(String[] args) {
		product(array1);
		product(array2);
		product(array3);
	}
	public static void product(int[] array) {
		int product1 = 1;
		for(int counter=0; counter < array.length ; counter++) {
			product1 *= array[counter];	
			//System.out.println(product1);	
		}
		System.out.println("Product of the array list: " + product1);
	}

}
