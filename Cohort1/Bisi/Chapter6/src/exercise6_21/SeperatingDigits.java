package exercise6_21;

import java.util.Scanner;

public class SeperatingDigits {
	
	public double quotient(double q, double r){
		double quotient = q / r;
	 		System.out.println(quotient);
			return quotient;
	}
	
 	public double remainder(double s, double t){
 	 	double remainder = s % t;
 	 		System.out.println(remainder);
			return remainder;
 	}
	 	
	 public static double displayDigit(double num){
			 
		for(num == 1 && num <= 9);
			 System.out.println();
			 break;
		 case2:num = 10 && num <= 99;
			 System.out.println();
			 break;
		 case3: num = 100 && num <= 999;
			 System.out.println();
			 break;
		 case4: num = 1000 && num <= 9999;
			 System.out.println();
			 break;
			 default: System.out.println("No value was entered");
		 }
		 
	}
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
			
			System.out.print("enter number");
			int number = input.nextInt();
			
			System.out.print("enter number");
			int number1 = input.nextInt();
			
		 SeperatingDigits.displayDigit(number);
	 }
}