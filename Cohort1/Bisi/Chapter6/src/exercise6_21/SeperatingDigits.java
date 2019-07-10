package exercise6_21;

import java.util.Scanner;

public class SeperatingDigits {
	
	public static int quotient(int Q, int R){
		int result = Q / R;
		return result;		
 	}
	
	public static int remainder(int Q, int R) {
		int result = Q * R;
		return result;
	}
	
	 public static void displayDigit(){
		 String store="  ";
		Scanner i = new Scanner(System.in);
		System.out.print("Enter value");
		int value = i.nextInt();
		
	int result = quotient(value,10);
		store = result+ "  "+ store;
		value/=10;
			
	System.out.println( store);
		
	}
	 
 public static void main(String[] args) {
				 
		SeperatingDigits.displayDigit();
	 }
}