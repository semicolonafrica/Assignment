package chapter6.exercise6_10;

import java.util.Scanner;



public class RoundingNumber2 {
	
//	public static void main(String[] args) {
	
		public static double getRoundInt(double numb) {
			double  x = Math.floor(numb - 0.5);
			return x;
	}
		
		public static double getRoundTenth(double numb) {
			double  x = Math.floor(numb *10 - 0.5)/ 10;
			return x;
	}
		
		public static double getRoundHundredth(double numb) {
			double  x = Math.floor(numb*100 - 0.5)/100;
			return x;
	}
		
		public static double getRoundThousandth(double numb) {
			double  x = Math.floor(numb*1000 - 0.5)/1000;
			return x;
	}
		
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Value");			
			double value = input.nextDouble();
			
			System.out.println(getRoundInt (value));
			
			System.out.println(getRoundTenth (value));
			
			System.out.println(getRoundHundredth (value));
			
			System.out.println(getRoundThousandth (value));
			}
}
