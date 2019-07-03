package Chapter6.exercise6_28;

import java.util.Scanner;
public class QualityPointTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student grade: ");
		int score = input.nextInt();
		
		
		
		System.out.println("You scored: " + score +  "\n"  + "Your grade point is: " + QualityPoint.GradePoint(score) );

	}

}
