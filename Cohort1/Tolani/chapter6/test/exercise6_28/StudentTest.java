package exercise6_28;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		
		Student student1 = new Student("kunle",1220000,25);
		
		System.out.println("Enter student grade between 100 - 0:");
		
		int grade = insert.nextInt();
		
		System.out.println(student1.getStudentPoint(grade));
		
		insert.close();
	}

}
