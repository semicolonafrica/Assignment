package chapter6.exercises;

import java.util.Scanner;

public class QualityPoint {

	public static int checkResult(int number) {
		int result = 0;
		
		if(number > 89 && number <=100) {
			result = 4;
		}
		
		else if(number > 79 && number <=89) {
			result = 3;
		}
		
		else if(number > 69 && number <=79) {
			result = 2;
		}
		
		else if(number > 59 && number <=69) {
			result = 1;
		}
		
		else if(number <60) {
			result = 0;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner ops = new Scanner(System.in);
		
		System.out.println("Enter Result");
		int result = ops.nextInt();
		
		System.out.println(checkResult(result));
	}
}
