package chapter6.exercise6_28;
import java.util.Scanner;

//Write a method qualityPoints that inputs a student’s average
//and returns 4 if it’s 90–100, 3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if
////lower than 60. Incorporate the method into an application that reads a
//value from the user and displays the result.

public class StudentAverage {
	
	public  static void calculateAverage() {
		int student = 0;
		int counter = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(student != -1) {
		System.out.println("enter student number");
		student = input.nextInt();
		counter++;
		
		System.out.println(StudentAverage.qualityPoints(student));	
	}
	}
		public static boolean qualityPoints(int student) {
			
			if (student >= 90 ||  student == 100) {
				 
				 System.out.println("4");
			}
			if(student > 100)
				System.out.println("it is not a valid number: ");
			
			else if (student >= 80 || student >= 89)
				System.out.println("3");
			else if (student >= 70 || student >= 79)
				System.out.println("2");
			else if (student >= 60 || student >= 69)
				System.out.println("1");
			else {
				System.out.println("0");
			}
			return true;
				
		}
}
