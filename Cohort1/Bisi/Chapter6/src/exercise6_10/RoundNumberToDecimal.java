package exercise6_10;
import java.util.Scanner;
public class RoundNumberToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter number for x: ");
		int x = input.nextInt();
		
		double y = Math.floor(x * 10 + 0.5);
			y = (int) Math.floor(x * 10 + 0.5);
			
		double y1 = Math.floor(x * 10 + 0.5) / 10;
			y = Math.floor(x * 10 + 0.5) / 10;
			
		double y2 = Math.floor(x * 10 + 0.5) / 100;
		y = Math.floor(x * 10 + 0.5) / 100;
		
		double y3 = Math.floor(x * 10 + 0.5) / 1000;
		y = Math.floor(x * 10 + 0.5) / 1000;
		
		
		System.out.println("x is:"+x);
		System.out.println("x is:"+x);
		System.out.println("x is:"+x);
		System.out.println("x is:"+x);
		
		System.out.println("Answer for integer number is:"+y);
		System.out.println("Answer for tenth number is:"+y1);
		System.out.println("Answer for hunderedth number:"+y2);
		System.out.println("Answer for thousandth:"+y3);

	}

}
