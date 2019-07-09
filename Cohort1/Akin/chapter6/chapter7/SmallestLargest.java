package chapter7;

import java.util.Random;

public class SmallestLargest {
	
	public static void main(String[] args) {
		Random random = new Random();
	double[] w = new double[99];
	double high = random.nextInt(50) + random.nextDouble();
	double low = random.nextInt(50) + random.nextDouble();  
	for(int i = 1; i < w.length;i++)
	{
		
		w[i] = random.nextInt(50) + random.nextDouble();
		
		if(w[i] > high) {
			high= w[i];
		}
		if(w[i] < low) {
			low = w[i];
		}
		System.out.printf("%.2f%n", w[i]);
	}
	
	System.out.printf("The lowest: %.2f   %nThe Highest: %.2f%n ",low,high);
	
	}

}
