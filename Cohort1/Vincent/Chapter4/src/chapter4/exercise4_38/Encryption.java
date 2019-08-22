package chapter4.exercise4_38;


import java.util.Scanner;
public class Encryption {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String store = "";
		
		System.out.println("enter the numbers to be encrypt");
		int digit = input.nextInt();
 	
		
		int num1 = digit /10 +7;							// Not done with this work please i need assist. thank you.
		digit %= 10;
		
		int num2 = digit / 10+ 7;
		digit %= 10;
		int num3 = digit / 10 + 7;
		digit %= 10;
		int num4 = digit / 10 +7;
		digit %= 10;
	
		store = num1 +""+ num2+""+num3+""+num4;
		
//		int total = Integer.parseInt(store);
		
		System.out.println(store);
		
	}
}
