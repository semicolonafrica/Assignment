package exercise6_28;

import java.util.Scanner;

public class QualityPoint {
	
	public static void qualityPoint(int value){
		
		if(value >= 90 && value <= 100) {
			System.out.println("4");
		}
		else if(value >= 80 && value <= 89) {
			System.out.println("3");
		}
		else if(value >= 70 && value <= 79) {
			System.out.println("2");
		}
		else if(value >= 60 && value <= 69) {
			System.out.println("1");
		}
		else if (value <= 59) {
			System.out.println("0");
			}
		
	}
	
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int number = in.nextInt();
		
	qualityPoint(number);
	}
	}