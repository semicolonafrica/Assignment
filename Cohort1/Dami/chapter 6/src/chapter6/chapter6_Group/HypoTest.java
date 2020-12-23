package hypotanuse;

import java.util.Scanner;

public class HypoTest {
	public static void main(String args[]) {
		Hypo obj = new Hypo();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side1");
		double side1 = input.nextDouble();
		
		System.out.print("Enter side2");
		double side2 = input.nextDouble();
		
		System.out.println("SIDE1	SIDE2	Hypotanuse");
		System.out.printf("%s\t%s\t%s%n",side1, side2, obj.getPythagoras(side1, side2));
		
		
	}

}
