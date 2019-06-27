package exercise6_36;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue {

		static SecureRandom random = new SecureRandom();
		
		static Scanner input = new Scanner(System.in);
		
		static int a = 0;
		static int b = 0;
		public static int multiply() {
			 a = 1 + random.nextInt(9);
			 b = 1 + random.nextInt(9);
			int result = a*b;
			return result;
		}
		
		public static void displayRemark() {
			int response = 0;
			int result = multiply();		
			 while(result != response){
				 System.out.println("What is the answer of" + a + " times " + b);
				 response = input.nextInt();
				 if(result != response) {
					 System.out.println("no, please try again");				 
				 }
			 }
			 System.out.println("Very good!");
			 // call method displayRemark to change question
			 displayRemark();
		}
	}


