package exercise7_8;

public class Check {

	public void displayF() {
		int [] f = new int [6];
		
		System.out.printf("%s%7s%n", "Index", "Value");
		for(int counter = 0; counter < f.length; counter++) {
			System.out.printf("%5d%8d%n", counter,  f[counter]);
			
		}
	}
	
	public void displayG() {
		int [] g = {8, 8, 8, 8, 8};
		
		System.out.printf("%s%7s%n", "Index", "Value");
		for(int counter = 0; counter < g.length; counter++) {
			System.out.printf("%5d%8d%n", counter,  g[counter]);
	}
}
	
	public void calculateC() {
	double [] c = {20, 2, 3, 4, 6};
	int total = 0;
		
		for(int counter = 0; counter < c.length; counter++) 
			total += c[counter];
			System.out.printf("Total number of elements: %d%n", total);	
	}

	
	public void calTwoArrays() {
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int [] b = new int [34];
		
		
		 for(int counter = 0; counter < a.length; counter++) {
			 b[counter] = a[counter];
		 }			
			 for(int counter1 = 0; counter1 < b.length; counter1++) {
				 System.out.printf("%4d", b[counter1]);
			 }
			 System.out.println();
}

	public void calculateD() {
    double [] w = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	double smallest = w [0];
	double largest = w[0];
		
		for(int counter = 0; counter < w.length; counter++) { 
			
			if(w[counter] < smallest)
				smallest = w[counter];
			
			if(w[counter] > largest)
				largest = w[counter];
//			System.out.println("The smallest number is: " + smallest);	
		}
			System.out.println("The smallest number is: " + smallest);	
			System.out.println("The largest number is: " + largest);	
	}
}