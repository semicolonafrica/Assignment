package chapter6.exercise628;

import java.util.Scanner;

public class StudentPoint {

	public void qualityPoint() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter gradeScore or -1 to exit: ");
		int grade = input.nextInt();
		
		while(grade != -1) {
			if(grade >= 90) {
				System.out.println("grade is: " + 4);
				
			}
			else if(grade >= 80) {
				System.out.println("grade is: " + 3);
			}
			else if(grade >= 70) {
				System.out.println("grade is: " + 2);
			}
			else if(grade >= 60) {
				System.out.println("grade is: " + 1);
			}
			else 
				System.out.println("grade is: " + 0);
				
			System.out.print("Enter gradeScore or -1 to exit: ");
			grade = input.nextInt();
			
			if (grade == -1) {
				System.out.println("you exit the application");
			}
		}
	}
}
