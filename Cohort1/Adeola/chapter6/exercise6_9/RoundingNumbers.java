package exercise6_9;
import java.util.Scanner;

public class RoundingNumbers {
	public static void roundOff() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter value to round");
		double x = input.nextDouble();
		double y = Math.floor(x + 0.5);
		System.out.println("the rounded value of "+ x +" is " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roundOff();
	}

}
