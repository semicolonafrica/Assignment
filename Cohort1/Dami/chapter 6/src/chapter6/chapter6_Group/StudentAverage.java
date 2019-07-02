package chapter6.chapter6_Group;

public class StudentAverage {
	
	public static int qualityPoints(int average) {
		if(average >= 90 && average <= 100) {
			System.out.println(4);
		}
		else if(average >= 80 && average <= 89) {
			System.out.println(3);
		}
		else if(average >= 70 && average <= 79) {
			System.out.println(2);
		}
		else if(average >= 60 && average <= 69) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		return average;
	}
	
}
