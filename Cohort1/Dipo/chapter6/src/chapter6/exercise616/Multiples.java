package chapter6.exercise616;
import java.util.Scanner;
public class Multiples {
	
	public static void isMultiple() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int first = input.nextInt();
		System.out.println("Enter the secont number: ");
		int second = input.nextInt();
		
		//int num1 = 1; 
		//int num2 = 1;
	//}
		
		
	//public static void isMultipleM() {
		
		//int num;
		//int first = num;
		//int num2;
		//int second = num2;
		
		if(ismultiple(first, second) == true) 
			System.out.println(second +" is a multiple of " + first);
		
		else
			System.out.println(second +" Not multiple of " + first);
		
	}
		
		
		
	//}
	
	public static boolean ismultiple(int a, int b) {
		
		if( b%a == 0 && b != 1 )
			return true;
		
		return false;
	}
	

}
