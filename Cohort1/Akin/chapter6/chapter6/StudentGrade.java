package chapter6;

public class StudentGrade {

	public static int displayPoints(int grade) {
		int result = 0;
		if(grade >= 90 && grade <= 100) {
			result = 4;
		}
		else if(grade >= 80 && grade < 90) {
			result = 3;
		}
		else if(grade >= 70 && grade < 80) {
			result = 2;
		} else if(grade >= 60 && grade < 70) {
			result = 1;
		} else if(grade < 60) {
			result = 0;
		} else {
			System.out.print("Error, Type grade between 100 and 0");
		}
			return result; 
		
	}
}
