package chapter6;

import java.util.Scanner;

public class StudentGradeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		
		System.out.printf("The student point from the grade %d is %d",grade,StudentGrade.displayPoints(grade));
		input.close();
	}

}
