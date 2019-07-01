package chapter7.exercises;

import java.util.Arrays;

//Exercise 7.8 Array
//Program that accomplish different tasks
//Program written by Oyemade Temitope

public class ArrayStatements {

	

	public static  void statements() {
		
		//Question 1
		System.out.println("Question 1");
		int[] f = {0,1,2,3,4,5,6,7,8,9,10,23,43};
		System.out.println(f[6]);
		
		System.out.println("Question 2");
		//Question 2
		int[] g = new int[5];
		Arrays.fill(g, 8);
		
		System.out.println("Question 3");
		//Question 3
		float[] c = new float[100];
		float total = 0;
		for(int i = 0; i< c.length; i++)
			total = total + c[i];
		System.out.println(total);
		
		System.out.println("Question 4");
		//Question 4
		int[] a = {1,2,3,4,5,6,7,8,9,10,11};
		int[] b = new int[34];
		System.arraycopy(a, 0, b, 0, 11);
		
		for(int i = 9; i<34; i++)
			b[i] = i;
		
		for(int i = 0; i<b.length; i++)
			System.out.println(b[i]);
		
		
		
		System.out.println("Question 5");
		//Question 5
		float[] w = new float[99];
		for(int i = 0; i<w.length; i++ )
			w[i] = i;
		
		float minimum = w[0];
		float maximum = w[0];
		
		
		//Find minimum and maximum
		for(int i = 0; i<w.length; i++) {
			if(w[i] < minimum) 
				minimum = w[i];
			
			if(w[i] > maximum)
				maximum = w[i];
		
		}
			
		System.out.println(minimum);
		System.out.println(maximum);
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		statements();
	
	}

}
