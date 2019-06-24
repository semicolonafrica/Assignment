/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;
public class Temperature {
	//declaring final variable that cannot be change
	private final static double value1=5.0,value2=9.0,value3=32;
	private static boolean correct;
	
	public static void getCelsius(int value) {
		
		double result=value1/value2*(value-value3);
		
		System.out.println(result);
	}
	public static void getFahrenheit(int input) {
		
		double answer=value2/value1*(input + value3);
		
		System.out.println(answer);
		
	}
	public static void checkTemperature(int number) {
		
		if(correct==true) {
			 getCelsius(number);
		}
		else {
			getFahrenheit(number);
		}
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter temperature");
		int temp = input.nextInt();
		
		System.out.println("enter true to get celsius value or false for fahrenheit");
		correct = input.nextBoolean();
		
		
		getCelsius(temp);
		getFahrenheit(temp);
		checkTemperature(temp);
	}

}
