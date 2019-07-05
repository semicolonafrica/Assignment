/* Author: ADEBAYO Johnson
 Date: 05/07/2019 
 Location of exercise:  Exercise7, Question 7.16
 Purpose: For calculating sum of double values
*/

package chapter7.exercise716;

public class SumDouble2 {

	public static void main(String[] args) {
		double sum = 0.00;
		
		for(String number : args) {
			sum += Double.parseDouble(number);
			System.out.println(sum);	
		}
		System.out.println("\nTotal: " + sum);
	}
}
