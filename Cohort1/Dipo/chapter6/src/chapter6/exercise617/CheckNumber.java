package chapter6.exercise617;
import java.util.Scanner;
public class CheckNumber {
	
	public static void isEven() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number to check: ");
		int number = input.nextInt();
		
		
		if(iseven(number) == true)
			System.out.println(number +" is an Even number");
		
		else
			System.out.println(number +" is an Odd number");
			
	}
	
	
	public static boolean iseven(int a) {
		
		if(a%2 == 0)
			return true;
					
		return false;
	}

}
