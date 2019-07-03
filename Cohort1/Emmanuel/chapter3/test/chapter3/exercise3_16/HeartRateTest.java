/**
 * 
 */
package chapter3.exercise3_16;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class HeartRateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter first name: ");
		        String firstName = input.nextLine();

		        System.out.print("Enter last name: ");
		        String lastName = input.nextLine();

		        System.out.print("Enter year of birth: ");
		        int year = input.nextInt();

		        System.out.print("Enter month of birth: ");
		        int month = input.nextInt();

		        System.out.print("Enter day of birth: ");
		        int day = input.nextInt();

		        System.out.print("Enter current year: ");
		        int currentYear = input.nextInt();

		        HeartRates detail = new HeartRates(firstName, lastName, year, month, day);
		        System.out.println();

		        System.out.println(detail.getfirstName() +" "+ detail.getlastName() +" "+ detail.getYear() +" "+ detail.getMonth() +" "+ detail.getDay());

		        detail.displayDate(year, month, day);
		        System.out.println("Age is: " + detail.calculateAge(currentYear));
		        System.out.println("Maximun Heart Rate is: " + detail.calMaxHeartRates());
		        System.out.println("Target Heart rate range between: " + detail.calLowerTargetRate() + " and " + detail.calHigerTargetRate());
		        
		       input.close(); 
		    }
		

		
	}


