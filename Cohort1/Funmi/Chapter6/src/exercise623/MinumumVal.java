package exercise623;
import java.util.Scanner;
public class MinumumVal {

	public static void calMinimum3() {
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the list of the numbers: ");
		double a = input.nextDouble();
		double  b = input.nextDouble();
		double c = input.nextDouble();
		
		double total= Math.min(a,Math.min(b,c));
		
		System.out.println("The minimum of the numbers is: " + total);
		
	
		  input.close();
		}
			
	
		
		public static void main(String[] args) {
			MinumumVal.calMinimum3();
		}
		

	}
	
	


