/**
 * 
 */
package chapter6.exercise6_22;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Temperature {
	
	public static double calCelsius(double fahrenheit) {
		
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		return celsius;
	}
	public static double calFahrenheit(double celsius) {
			
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
			
		
		return fahrenheit;
		}
	
	
	}
 
	
