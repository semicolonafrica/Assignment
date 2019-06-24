package exercise6_15;
import java.util.Scanner;
	
public class Hypotenuse {
	public static void main(String[] arg) {
	Scanner input = new Scanner(System.in);
			
		System.out.print("Adjacent side:");
		double a = input.nextDouble();
		
		System.out.print("Opposite side:");
		double o = input.nextDouble();
		
			a = Math.pow(a,2.0);
			o = Math.pow(o, 2.0);
		
		double h = Math.sqrt(a + o);
		
		System.out.println(h);
	}
}
