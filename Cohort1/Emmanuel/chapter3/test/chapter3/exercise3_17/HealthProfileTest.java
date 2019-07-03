/**
 * 
 */
package chapter3.exercise3_17;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class HealthProfileTest {

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

		        System.out.print("Enter weight in pounds: ");
		        int weight = input.nextInt();

		        System.out.print("Enter height in inches: ");
		        int height = input.nextInt();

		        HealthProfile detail = new HealthProfile(firstName, lastName, year, month, day, weight, height);
		        System.out.println();

		        detail.displayDate(year, month, day);
		        System.out.println("Age is: " + detail.calculateAge(currentYear));
		        System.out.println("Maximun Heart Rate is: " + detail.calMaxHeartRates());
		        System.out.println("Target Heart rate range between: " + detail.calLowerTargetRate() + " and " + detail.calHigerTargetRate());
		        System.out.println("BMI is: " + detail.calBMI(weight, height));
		        //detail.calBMI(weight, height);
		        
		    input.close();
		    }
		

	}

