package exercise6_15;

// @author CHIMA CHUKWUEBUKA
import java.util.Scanner;
public class Hypotenuse {

	// @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Hype = new Scanner(System.in);
		
		double a;
		double o;
		double h;
		
		System.out.println("Adjacent is: ");
		a = Hype.nextDouble();
		
		System.out.println("Opposite is: ");
		o = Hype.nextDouble();
		
	    a = Math.pow(a, 2.0);
	    o = Math.pow(o, 2.0);
	    
	    h = Math.sqrt(a + o);
	    
	    System.out.println("Answer is: " + h);
	}
}
