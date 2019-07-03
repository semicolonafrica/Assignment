/**
 * 
 */
package chapter6.exercise615;
import java.util.Scanner;
/**
 * Scoolj, Oluwajuwonlo
 *
 */
public class HypotenuseCalculation {

	public static double calculatehypotenuse() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter side1:");
		double side1 = input.nextDouble();
		System.out.println("Enter side2 :");
		double side2 = input.nextDouble();
		
		double hypotenuse = hypotenusePow(side1, side2);
		
		return hypotenuse;
		
	}
	
	public static double hypotenusePow (double adjacent, double opposite) {
		 
		adjacent = Math.pow(adjacent, 2);
		opposite = Math.pow(opposite, 2);
		
		double sumHypotenuse = adjacent + opposite;
		
		System.out.println ( adjacent + "\t"+ "+      " + opposite + " \t"+ "=   " + sumHypotenuse );
		
		sumHypotenuse = Math.sqrt(sumHypotenuse);
		adjacent = Math.sqrt(adjacent);
		opposite = Math.sqrt(opposite); 
		System.out.println (adjacent + "\t"+ "+       " + opposite + " \t"+ "=   " + sumHypotenuse  );
		
		
		
		return sumHypotenuse;
		
	}
	
}
