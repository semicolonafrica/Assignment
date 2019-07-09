package chapter7;

import java.util.Random;

public class GenerateandTotal {

	public static void main(String[] args) {
		Random randomNumbers = new Random();
		double[] c = new double[100];
		
		double total = 0.0;
		
		for(int i = 0; i < c.length; i++) {
			
			c[i] = 10 + randomNumbers.nextInt(20);
			
			total += c[i];
			System.out.printf("%d\t%.2f%n",i,c[i]);
		}
		System.out.println();
		System.out.printf("The total value of 100 \nrandom numbers: %.2f%n",total);
		
		

	}

}
