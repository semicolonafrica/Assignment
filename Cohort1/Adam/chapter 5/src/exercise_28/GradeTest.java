package exercise_28;

import java.util.Scanner;

public class GradeTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Score:");
		int scores = input.nextInt();
		
		System.out.printf("%s%d", "The Grade Of Your Scores is: ",
				StudentPoint.qualityPoint(scores));
		
	}

}
