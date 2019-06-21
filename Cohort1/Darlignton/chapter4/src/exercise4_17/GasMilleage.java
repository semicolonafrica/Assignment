package chapter4.exercise4_17;

import java.util.Scanner;

public class GasMilleage {
	public double calculatGasmilleage(){
		
		Scanner input = new Scanner(System.in);
		
		double milesGone = 0;
		double gallonUsed = 0;
		int counter = 1;
		int average = 0;
		double total =0;
		
			System.out.print("enter trips: ");
			int trips = input.nextInt();
		
			
		
			while(counter  <= trips){
				System.out.println("enter miles: ");
				milesGone = input.nextInt();
				 
				if(milesGone == -1)
					break;
				
				System.out.println("enter the gallon used: ");
				gallonUsed = input.nextInt();
				
				if(gallonUsed == -1)
					break;
				total = (double) milesGone / gallonUsed + total;
				counter++;
				
			}
		
			
			return total;
				
	}

		
	}



