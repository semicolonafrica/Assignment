package chapter6.exercise607;
import java.util.Scanner;
public class RoundingNumbers {

	public static void main(String[] args) {
		
		double x = 0;
		double y = 0;
				
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		x = input.nextDouble();
		y = Math.floor(x + 0.5);
		
		
		
		System.out.println("value of x:  " +  x);
		System.out.println("value : " + y);

	}
	
}
