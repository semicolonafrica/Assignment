package chapter7.exercise708;

import java.util.Arrays;

public class ArrayExample {
	
	public void display() {
		
		int [] f = {2, 4, 7, 6, 5, 8, 7};
		System.out.println(f[5]);
	}
	
	
	public void initialisedArray() {
		
		int [] g = new int [5];
		
		g[0]= 8;
		g[1]= 8;
		g[2]= 8;
		g[3]= 8;
		g[4]= 8;
		
		System.out.println("Method to display initialised value: ");
		for(int count = 0; count < g.length; count++) {
			System.out.println(g[count]);
			
		}
				
	}
	
	public void totalArray() {
		
		float [] c = {10, 15, 15, 20, 5, 5, 6, 4, 17, 3};
		
		float sum = 0;
		
		System.out.println("Method to total array elements: ");
		for(int count = 0; count < c.length; count++) {
			sum += c[count];
			
		}
		System.out.println(sum);
		
	}
	
	public void copyArray() {
		
		int [] a =  {1,2,3,4,5,6,7,8,9,10,11};
		int [] b = new int [34];
		
		for (int i=0; i <a.length; i++) {
			b[i] = a[i];
		}
		
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public void checkArray() {
		
		int[] w = {4,2,3,4,8,7};
		int smallest =w[2];
		int temp;
		int largest = w[1];
		//int z[] = Arrays.copyOf(w, w.length);
		
		for(int i = 0; i < w.length; i++) {
			temp = w[i];
			if(smallest > temp) {
				
				smallest = temp;
			}else if(largest < temp) {
				largest = temp;
			}
				
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
