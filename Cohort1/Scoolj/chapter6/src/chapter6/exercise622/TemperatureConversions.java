/**
 * 
 */
package chapter6.exercise622;
import java.util.Scanner;
/**
 * @authorScoolj, Oluwajuwonlo
 *
 */
public class TemperatureConversions {
		static private int tempOutput =0;
	public static int CalculateTemperate() {
		int  temp=0;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter temperature value for conversion");
		//  this is use to handle like error based on wrong input from the user
		try {
		  temp = input.nextInt();

		} catch (Exception e) {
			System.out.println("Wrong input, Remember to leave space between figure and measurement unit"+" \r");
			
		}
		// this is use to collect measurement unit from user
		String m = input.next();
		// this loop statement to decide which conversion to use.
		switch (m) {
		
		case "C":
		case "c":
		  tempOutput = (int) calculateFahrenheit(temp);
		System.out.printf("%d F",tempOutput);
		break;				
		case "F":
		case "f":
			tempOutput = (int) calculateCelsius(temp);
			System.out.printf("%d C",tempOutput);
		break;
		default :
		System.out.println("Wrong measurement unit");
		break;
		}
		  
		
		return temp;
	}
	
	public static double  calculateFahrenheit(double input) {
		final double f = 9.0/5.0;
		double fahrenheit =  f* (input + 32);
		return fahrenheit;
	}
	
	public static double calculateCelsius(double input) {
		final double f = 5.0/9.0;
		double celsius = f*(input - 32);
		
		return celsius;		
	}
}
