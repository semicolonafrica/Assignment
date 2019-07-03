/**
 * 
 */
package chapter6.Exercises;

/**
 * @author user
 *
 */
import java.util.Scanner;
public class Parking {
	Scanner input = new Scanner(System.in);
	
	public void calculateCharges() {
		
		double charges = 0;
		double hours = 0;
		int customer;
		int counter = 0;
		double total = 0.0;
		
		if(charges <= 3) {
			charges = 2;
			
			if(hours >3 && hours < 19) {
				hours = hours - 3;
				charges = (hours * 0.50) + 2;
				
				System.out.println(" Enter number of customers: ");
				customer = input.nextInt();
				if(customer < counter) {
					total = charges;
					total = charges + total;
					System.out.println("This is the charges: " + charges);
				}
			}
		}
		//System.out.println("This is the total charges: " + total);
	}
}
