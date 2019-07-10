package exercise6_37;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudentPerformance {

	static SecureRandom random = new SecureRandom();
	
	static Scanner in = new Scanner(System.in);
	
	static int a = 0;
	static int b = 0;
	public static int multiply() {
		 a = 1 + random.nextInt(9);
		 b = 1 + random.nextInt(9);
		int result = a * b;
		return result;
	}
	
	public static void rightRemark() {
		int right = 1 + random.nextInt(4);
		switch(right) {
		case 1: System.out.println("Very good!");
		break;
		case 2: System.out.println("Excellent!");
		break;
		case 3: System.out.println("Nice work!");
		break;
		case 4: System.out.println("Keep up the good work!");
		break;
	//	default: System.out.println("None");
		}
	}
	public static void wrongRemark() {
		int wrong = 1 + random.nextInt(4);
		switch(wrong) {
		case 1: System.out.println("No, try again!");
		break;
		case 2: System.out.println("Wrong, try once more!");
		break;
		case 3: System.out.println("Don't give-up!");
		break;
		case 4: System.out.println("No, keep trying!");
		break;
	//	default: System.out.println("None");
		}
	}
	
	public static void displayRemark() {
		int response = 0;	int count = 5;	double pass = 0;			
			for(int i = 1; i <= count; i++) {	
					int result = multiply();
			 System.out.println("What is "+ a + " times " + b + " ?");
			 response = in.nextInt();
			 if(result != response) {
				 	wrongRemark();				 
			 }else {
		 	rightRemark();
		 	pass= pass+1;
			 }
		}
		double percent = (pass / count) * 100;
		if(percent < 75) {
			System.out.println(percent + "% \nPlease ask your Teacher for help!");
				 displayRemark();
		}
		else {
			System.out.println(percent + "%\nCongratualtions, you are ready to go to the next level!");
				displayRemark();
		}
}

	public static void main(String[] args) {
		displayRemark();
	}
}

