package Chapter6.exercise6_16;
import java.util.Scanner;
public class MultipleOfInteger {
	int x;
	int y;
	
	public static boolean isMultiple() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int x=input.nextInt();
		
		System.out.println("Enter second integer: ");
		int y=input.nextInt();
		
		if(y%x == 0) {
			System.out.println(y + " is a multiple of " + x);
			return true;
		}
		
		
		else if(y%x !=0){
			System.out.println(y + " is not a multiple of " + x);
		}
		return false;
	}
	

}
