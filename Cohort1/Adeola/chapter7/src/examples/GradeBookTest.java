package examples;

public class GradeBookTest {

	public static void main(String[] args) {
		int[] gradeArray = {97, 64, 76, 42, 74, 67, 54, 67, 43,24 ,65, 76,98 ,64 ,56, 45,34, 100, 9};
		
		GradeBook obj = new GradeBook("chg 101", gradeArray);

		System.out.printf("Welcome to the grade book for%n%s%n%n", obj.getCourseName());
		
		System.out.println("next");
		
		obj.processGrades();
	}

}
