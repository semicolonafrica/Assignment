package chapter7.exercise708E;

import java.security.SecureRandom;

public class DisplayNumber {
	static SecureRandom random = new SecureRandom();
	
	public static void main(String[] args) {
		displayNumber();

	}
	public static void displayNumber() {
		double largest = 0.00;
		double[] w = new double[9];
		double number1 = 1.20 + random.nextInt(10);
		w[0] = number1;
		System.out.println(w[0]);
		double smallest = w[0];
		
		
		for(int counter = 1; counter < w.length; counter++) {
			double number = 1.20 + random.nextInt(10);
			w[counter] = number;
			System.out.println(w[counter]);
			if(largest < w[counter]) {
				largest = w[counter];
			}
			else {
				largest = largest;
			}
			if(smallest > w[counter]) {
				smallest = w[counter]; 
			}
		}
		System.out.println("The smallest is: " + smallest);
		System.out.println("The largest is: " + largest);
	}
	

	}

