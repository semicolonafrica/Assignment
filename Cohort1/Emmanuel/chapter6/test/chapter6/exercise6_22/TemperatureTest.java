/**
 * 
 */
package chapter6.exercise6_22;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class TemperatureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ente 1 to calculate Celsius OR 2 to calculate Fahrenheit!");
		int check = input.nextInt();
		System.out.println("Enter value: ");
		int value = input.nextInt();
		
		 double celsius = Temperature.calCelsius(value);
		 double fahrenheit = Temperature.calFahrenheit(value);
		
		  
		 if (check == 1) {
			     
			  System.out.println("Celsius value is: " + celsius);
		  }
		  else if (check == 2) {
			 
			  System.out.println("Fahrenheit value is: " + fahrenheit);
		  } 
		

	}

}
