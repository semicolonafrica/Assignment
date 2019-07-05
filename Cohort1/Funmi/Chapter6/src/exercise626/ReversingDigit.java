package exercise626;
import java.util.Scanner;

public class ReversingDigit {
	
	public static void displayReverse() {
		Scanner input = new Scanner(System.in);
		
		int digit = 0;
		System.out.println("Enter the digit: ");
		digit = input.nextInt();
		
		int digit1 = digit % 10;
		digit /= 10;
		int digit2 = digit % 10;
		digit /= 10;
		int digit3 = digit % 10;
		digit /= 10;
		int digit4 = digit % 10;
		digit /= 10;
		
	 String total = digit1 + "" + digit2 + "" + digit3 + ""+ digit4;
	 //System.out.println(total);
	 int disNumber = Integer.parseInt(total);
	 System.out.print("The reverse number is : " + disNumber);
	 
	// String results = "";
	 
//	 while(disNumber != 0) {
//		 int numVal = disNumber % 10;
//		 results = numVal + "" + results;
//		 disNumber /= 10;
//	 }
//	   System.out.println(); 
//	   System.out.print("The reverse number is : " +results);
//	 
	 
	 input.close();
	 }
		
		
	
	

	public static void main(String[] args) {
		ReversingDigit.displayReverse();

	}

}
