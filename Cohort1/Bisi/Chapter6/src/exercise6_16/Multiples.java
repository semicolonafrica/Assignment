package exercise6_16;
import java.util.Scanner;
public class Multiples {

	public static boolean isMultiple(int r, int q) {
			
		if(q % r == 0 ) {
			System.out.println("It is a Mulitple");
			return true;
		}
			else {
				System.out.println("It is not a Mulitple");
				return false;
			}		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int input1  = input.nextInt();
		
		System.out.print("Enter its multiple:");
		int input2 = input.nextInt();
		
		System.out.println(Multiples.isMultiple(input1, input2));
		
		//System.out.println(isMultiple(input1, input2));
	}
			
}
