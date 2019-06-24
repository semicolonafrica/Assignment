package exercise6_22;

//@author CHIMA CHUKWUEBUKA
import java.util.Scanner;
	public class TempConversion {
		
		public static double celsius(double fahrenheit) {
			
			double celsius = 5.0 / 9.0 * (fahrenheit - 32);
			
			return celsius;
		}
		public static double fahrenheit(double celsius) {
				
			double fahrenheit = 9.0 / 5.0 * celsius + 32;
				
			
			return fahrenheit;
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner temp = new Scanner(System.in);
			
			System.out.print("Press A to calculate Celsius: ");
			System.out.print("Press B to Calculate Fahrenheit: ");
			int hint = temp.nextInt();
			 System.out.println("Enter value: ");
			int value = temp.nextInt();
			
				double a;
				double b;
				
			  a = TempConversion.celsius(value);
			  b = TempConversion.fahrenheit(value);
			
			  
			 if(hint == 1) {
				     
				  System.out.println("Celsius is: " + a);
			  }
			  if (hint == 2) {
				 
				  System.out.println("Fahrenheit is: " + b);
			  } 
			

		}

	}