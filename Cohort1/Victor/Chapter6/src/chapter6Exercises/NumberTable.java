package chapter6Exercises;

import java.util.Scanner;

public class NumberTable {
	
//	(Table of Binary, Octal and Hexadecimal Numbers) Write an application that displays a
//	table of the binary, octal and hexadecimal equivalents of the decimal numbers in the range 1
//	through 256. If you aren’t familiar with these number systems, read online Appendix J first.
	
	private static int number;
	
	public static void printNumberTable() {
		
		Scanner input = new Scanner(System.in);
		int counter=0;
		System.out.println("Enter range of number");
		int range = input.nextInt();
		System.out.println("Number \t Binary \tOctal \t Hexadecimal \n");
		for (counter =0; counter <range; counter ++) {
//		
			System.out.println("  "+counter+" \t   "+binary(counter)+" \t \t"+octal(counter)+" \t "+hexaDecimal(counter)+" \n ");
		}
		
	}
	
	public static String binary(int number) {
//		System.out.print("Binary is: ");	
		String store= "";
		while(number!=0) {
			int remainder = number%2;
			store=remainder+""+store;
			number/=2;
		}
//		System.out.println("Octal is "+store);
		return store;
	}
	public static String octal(int number) {
//		System.out.print("Octal is: ");		
		String store= "";
		while(number!=0) {
			int remainder = (number%8);
			store=remainder+""+store;
			number/=8;
//			System.out.println(store);
		}
//		System.out.println("Octal is "+store);
		return store;
		
			
	}
	public static String hexaDecimal(int number) {
		String remainder="" + number % 16;

		switch (remainder) {
		case "10":
			remainder = "A";
			break;
		case "11":
			remainder = "B";
			break;
		case "12":
			remainder = "C";
			break;
		case "13":
			remainder = "D";
			break;
		case "14":
			remainder = "E";
			break;
		case "15":
			remainder = "F";
			break;	
		}
		
		return (remainder);		
	}
}
