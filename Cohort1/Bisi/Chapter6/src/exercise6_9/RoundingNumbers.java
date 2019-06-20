package exercise6_9;
import java.util.Scanner;
public class RoundingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter number for x: ");
		int x = input.nextInt();
				
		double y = Math.floor(x + 0.5);
			y = (int)(Math.floor(x + 0.5));
			
			System.out.println("x is:"+x);
			System.out.println("answer:"+y);
	}

}
