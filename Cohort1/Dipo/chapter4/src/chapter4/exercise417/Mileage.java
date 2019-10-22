/**
 * 
 */
package chapter4.exercise417;
import java.util.Scanner;

/**program for Gas mileage
 * @author Dipo
 * 
 */

public class Mileage{
	
	Scanner input = new Scanner(System.in);
	private int mileDriven;
	private int gallonUsed;

	public double calculateMileage(){
		System.out.println("Enter number of trip");
		int trips;
		trips = input.nextInt();
		int counter = 1;
		double milesPerGallon = 0;
		double total = 0;
		double miles = 0;
		double gallon = 0;
		double average;
		
		/** Using while loop for the program
		 * 
		 */
	        
		while(counter<=trips){
			System.out.println("Enter Miles");
	        miles = input.nextDouble();
	        if(miles == -1) {
	        	break;
	        }
	        System.out.println("Enter gallon");
	        gallon = input.nextDouble();
	        if(miles == -1) {
	        	break;
	        }
	        milesPerGallon = miles/gallon;
	        System.out.println("trip " + counter + " = " + milesPerGallon);
	        total = total + milesPerGallon;
	        counter++;
		}
	average = total/trips;
	return average;
	
	}


	public static void main(String[] args){
	    Mileage mile1 = new Mileage();
	    System.out.println(mile1.calculateMileage());

	}
}   
