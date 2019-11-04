package figure7;

import java.util.Scanner;

public class GradeBookTest {
	
	public static void main(String[] args) {
		Scanner insert = new Scanner (System.in);
		
		System.out.println("Enter number of grades: ");
		
		int gradeLength = insert.nextInt();
		
		int[] gradesArray = new int[gradeLength];
		
		
		for(int count = 0;count < gradesArray.length;count++) {
			System.out.println("Enter student grade:");
			
			gradesArray[count]= insert.nextInt();
		}
		
		
		
		GradeBook myGradeBook = new GradeBook("CSC101 Introduction to Java Programming", gradesArray);
		
		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
		myGradeBook.processGrades();
		insert.close();
	}

}
