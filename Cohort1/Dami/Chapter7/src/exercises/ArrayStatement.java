package exercises;

public class ArrayStatement {

	public static void main(String[] args) {

		//Exercise 7.8.1
	int[] moby = {1,2,3,4,5,6,7,8,9,10};
	
	System.out.println(moby[5]);
	
		//Exercise 7.8.2
	int[] g = {8,8,8,8,8};
	
		//Exercise 7.8.3
	float[] c = new float[100];
	
	float total = 0;
	
	for(int counter = 0; counter < c.length; counter++) {
		total += c[counter];
	}
	
		//Exercise 7.8.4
	int[] a = {1,2,3,4,5,6,7,8,9,10,11};
	int [] b = new int[34];
	System.arraycopy(a, 0, b, 0, 11);
	
		//Exercise 7.8.5
	
	int[] w = new int[99];
	
	for(int i = 0; i < w.length; i++) {
		w[i] = i;
	}
	int minimum = w[0];
	int maximum = w[0];
	
	for(int q = 0; q < w.length; q++) {
		
		if(w[q] < minimum)
			minimum = w[q];
		
		if(w[q] > maximum )
			maximum = w[q];
		
	}
	
	System.out.println(minimum);
	System.out.println(maximum);
	}

}
