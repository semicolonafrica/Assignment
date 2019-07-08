package chapter6.exercises610;
import java.util.Scanner;
public class RoundingNumber2 {
	
	  static Scanner input = new Scanner(System.in);
	
	 static double number = 0;
	 
 		 
	 	public 	static double findNearestInteger(){

	 		System.out.println ("Please Enter Number:");
	
	 		double number = input.nextDouble();
		// methods were invoked to perform operation
			double nearestNumber = roundToInteger(number);
			System.out.println(number + "\t "+ "Integer"+ "\t"+nearestNumber);
			
			double nearestNumber1 = roundToTenths(number);
			System.out.println(number + "\t "+" Tenths"+" \t"+ nearestNumber1);
			
			double	nearestNumber2 = roundToHundredths( number);
			System.out.println(number + "\t "+" Hundredths"+" \t"+ nearestNumber2);
			
			double	nearestNumber3 = roundToThousandths(number);
			System.out.println(number + "\t "+ " Thousandth"+ "\t"+nearestNumber3);
		
			return nearestNumber;
	 
	}
	

	
	public static double  roundToInteger( double number) {
		 
		double nearestInteger= 0;
		// this is use to identify input that will be round up or down
		double number2 = number%1;
		 	number2*=10;
		
		// this make the decision based on input
		if (number2 >=5.0) {
			
			 nearestInteger =  Math.ceil( number);
 
			
		}
		
		if (number2 <5 ){
			
		 nearestInteger = Math.floor(number);
 
		}
		
	
		
		return nearestInteger;
	}
	
	public static double roundToTenths(double number) {
	 
		
		double tenths = Math.floor ( number)/10;
		

		return tenths;
		
	}
	
	
	public static  double roundToHundredths(double number) {
 
		
		double hundredths = Math.floor(number)/100;
		

		return hundredths;
	}
 
	public static  double roundToThousandths(double number) {
	 
		double thousandth = Math.floor (number)/1000;

		return thousandth;
	}
	

}
