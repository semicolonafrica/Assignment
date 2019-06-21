package chapter6.exercise66;

import java.util.Scanner;

public class SphereVolume {

	
	
	
		public static double  calculateVolume( ) {
			Scanner input = new Scanner(System.in); // this is use to accept input from user
		
			System.out.println(" Enter Radius"); 
			
			double radius =  input.nextDouble();
			
			// this calculate volume
					
		double volume = (4.0/3.0)* Math.PI * Math.pow( radius, 3); 
		
		return volume;
	}
}
