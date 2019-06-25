package exercise6_17;
import java.util.Scanner;
public class EvenOrOdd {
	
	public static boolean isEven() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter integer: ");
		int x=input.nextInt();
		
		
		if(x%2 == 0) {
			System.out.println(x + " is an even number");
			return true;
		}
		
		
		else if(x%2 ==1){
			System.out.println(x + " is an odd number ");
		}
		return false;
}
}
