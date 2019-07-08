package chapter6.chapter6_Group;

import java.util.Scanner;

public class StudentAverageImplementation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Average");
		int average = input.nextInt();
	
		StudentAverage.qualityPoints(average);
	}
	
	
}
