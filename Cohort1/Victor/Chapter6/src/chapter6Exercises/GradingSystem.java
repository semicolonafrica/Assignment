package chapter6Exercises;

import java.util.Scanner;

public class GradingSystem {
	
//	6.28 Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
//	3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method 
//	into an application
//	that reads a value from the user and displays the result.
	
	public static void qualityPoints() {
		Scanner input = new Scanner(System.in);
		
		int average = 0;
		while (average != -5) {
			System.out.println("Enter students average");
			average = input.nextInt();
		
			if (average == -5) {
				System.out.println("End of session");
				break;
			}
		GradingSystem.qualityPoints(average);
		}
		
		input.close();
	}
	
	public static int qualityPoints(int average) {
		
		switch (average/10) {
		
		case 9:
		case 10:
			System.out.println("4");
			break;
		case 8:
			System.out.println("3");
			break;
		case 7:
			System.out.println("2");
			break;
		case 6:
			System.out.println("1");
			break;
		default:
			System.out.println("0");
		}
		return average;
		
	}

}
