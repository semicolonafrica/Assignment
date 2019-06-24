package chapter6Exercises;

import java.util.Scanner;

public class GradingSystem {
	
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
		System.out.println("The students grade is: "+GradingSystem.qualityPoints(average));
		}
		
		input.close();
	}
	
	public static String qualityPoints(int average) {
		
		switch (average/10) {
		
		case 9:
		case 10:
			return "4";
		case 8:
			return "3";
		case 7:
			return "2";
		case 6:
			return "1";
		default:
			return "0";
		}

	}

}
