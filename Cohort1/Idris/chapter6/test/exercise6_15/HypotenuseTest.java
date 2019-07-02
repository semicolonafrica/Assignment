package exercise6_15;

import java.util.Scanner;
public class HypotenuseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side one");
		double side1 = input.nextDouble();
		
		System.out.print("Enter side two");
		double side2 = input.nextDouble();
		
		System.out.println(Hypotenuse.hypotenueCalculator(side1, side2));
		input.close();
	}

}
