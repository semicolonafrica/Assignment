package exercise6_28;

import java.util.Scanner;
public class StudentResultTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner accept = new Scanner(System.in);
	
			System.out.println("Enter student sccore: ");
			int score = accept.nextInt();
			
			System.out.println(StudentResult.qualityPoint(score));
			accept.close();

	}

}
