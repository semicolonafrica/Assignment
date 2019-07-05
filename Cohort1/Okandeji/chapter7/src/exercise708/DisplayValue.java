package exercise708;

public class DisplayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1
		int[] f = {6,55,6,54,32,99,3,4};
		System.out.println("Q1:");
		
		System.out.println("The value of element 6 is:" + f[5]);
		System.out.println("");
		
		
		//Question 2
		int[] g = {8,8,8,8,8};
		System.out.println("Q2:");
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < g.length; counter++) {
			System.out.printf("%5s%8s%n", counter, g[counter]);
		}
		System.out.println("");
		
		
		//Question 3
		double[] c = new double[100];
		System.out.println("Q3:");
		double total = 0;
		for(int counter = 0; counter < c.length; counter++) {
			c[counter] = 3.00 * counter;
			total +=c[counter];
		}
				
		System.out.println("The total of 100 element array is: " + total);
		System.out.println("");
		
		
		//Question 4
		System.out.println("Q4:");
		int[] a = new int[11];
		int[] b = new int[34];
		System.out.println("11-element array a is: ");
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int counter = 0; counter < a.length; counter++) {
			a[counter] = 2 * counter;
			System.out.printf("%5s%8s%n", counter, a[counter]);
		}
		for(int counter = 0; counter < a.length; counter++) {
			b[counter] = a[counter];
		}
		System.out.println("");
		System.out.println("34-element array b, including 11-element array a is: ");
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int counter = 0; counter < b.length; counter++) {
			System.out.printf("%5s%8s%n", counter, b[counter]);
		}
		System.out.println("");
		
		
		//Question 5
		System.out.println("Q5:");
		double[] w = new double[99];
		System.out.printf("%s%8s%n", "Index", "Value");
		for(int count = 0; count < w.length; count++) {
			w[count] = 2 + 2 * count;
			System.out.printf("%5s%8s%n", count, w[count]);
		}
		double smallest = w[5];
		double highest = w[1];
		
		for(double var: w) {
			if(var < smallest) {
				smallest = var;
			}
			if(var > highest) {
				highest = var;
			}
		}
		System.out.println("The smallest value is: " + smallest);
		System.out.println("The largest value is: " + highest);
		}
	

}
