package exercise6_14;
import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Base number:");
		int base = input.nextInt();
		
		System.out.print("Exponential number:");
		int expo = input.nextInt();
		int result = 1;
		
		for(int counter = 1;counter <= expo; counter++) {
		
			result*= base; 		
		//int result = (int) Math.pow(base, expo);
		}
		System.out.println("Your answer is:"+result);
	}

}
