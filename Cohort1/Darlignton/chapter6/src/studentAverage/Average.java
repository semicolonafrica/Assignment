package studentAverage;

import java.util.Scanner;

public class Average {
	public static void qualityPoints(int average) {
			if(average >= 90 && average <= 100) {
				System.out.println(4);
			}


			else if(average >= 80 && average < 90) {
				System.out.println(3);
			}


			else if(average >= 70 && average < 80) {
				System.out.println(2);
			}

			else if(average >= 60 && average < 70) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your average: ");
		int average = input.nextInt();
		Average.qualityPoints(average);
	}
}
