package chapter6.exercise628;
import java.util.Scanner;
public class Point {
	
	public static void qualityPoints() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student's score: ");
		int score = input.nextInt();
		
		if(score >= 0 && score <= 100)
			System.out.println("Student Point is " + qualityPoints(score));
		
		else
			System.out.println("Invalid Score: ");
		
	}
	
	public static int qualityPoints(int grade) {
		
		if(grade >= 90)
			return 4;
		
		else if(grade >= 80)
			return 3;
		
		else if(grade >= 70)
			return 2;
		
		else if(grade >= 60)
			return 1;
		
		else
			return 0;
		
	}
	
	
	

}
