/* Author: ADEBAYO Johnson
 Date: 24/06/2019 
 Location of exercise:  Exercise 6, Question 6.28
 Purpose: For Score points
*/
package chapter6.exercise628;

import java.util.Scanner;
public class QualityPoints {
	
	public static int qualityPoints() {
		int point = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter average score: ");
		int score = input.nextInt();
		if ((score >=90) && (score <=100)) {
			point = 4;
		}
		if ((score >=80) && (score <=89)) {
			point = 3;
		}
		if ((score >=70) && (score <=79)) {
			point = 2;
		}
		if ((score >=60) && (score <=69)) {
			point = 1;
		}
		if (score <60) {
			point = 0;
		}
		return point;
		
	}
	public static void main(String[] args) {
		System.out.println("Student point: " + qualityPoints());
		
	}

}
