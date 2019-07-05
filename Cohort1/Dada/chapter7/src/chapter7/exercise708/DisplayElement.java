package chapter7.exercise708;

import java.security.SecureRandom;
public class DisplayElement {
	static SecureRandom random = new SecureRandom();
	static double total;
	static int copyElement;

	public static void main(String[] args) {
//		System.out.println(displayElementA());
//		displayElementC();
//		System.out.println(displayElementB());
//		sumOfElements(); 
//		sumOfElements1();
//		sumOfElements2();
//		copyElement();
		copyElement1();
		
		
	}
		public static int displayElementA() { // Question 7.8(a)
		 int[] f = new int [8];
//		int[] f = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		return f[6];
		}
		public static void displayElementC() { // Question 7.8(a) version2
			int [] f = new int[8];
			for(int i = 0; i < f.length; i++) {
				int number = 1 + random.nextInt(6);
				
				f[i] = number;
				System.out.println(f[i]);
				
			}
			System.out.println("The element in the sixth position is: " + f[5]);
			
		}
		public static int displayElementB() { // Question 7.8(b)
			int[] g = {8, 8, 8, 8, 8};
			return g[4];
		}
		public static void sumOfElements() { // Question 7.8(c)
			double[] c = new double[100];
			total = 1.20;
			for(int i = 0; i < c.length; i++) {
				total += 2;
				c[i] = total;
				System.out.println("Sum: " + c[i]);
				
			}
			System.out.println();
			System.out.println("Total: " + total);
		
		}
		public static void sumOfElements1() { // Question 7.8(c) Version2
			double[] c = new double[100];
			c[0] = 1.20;
			total = 0.00;
			for(int i = 0; i < c.length; i++) {
				if(i > 0) {
					c[i] = c[0];
				}
				total += c[i];
				System.out.println("Value: " + c[i]);
				System.out.printf("Sum: %.2f%n", total);
				
			}
			System.out.println();
			System.out.println("Total: " + total);
		
		}
		public static void sumOfElements2() {
			double[] c = new double[100];
//			c[0] = 1.20;
			total = 0.00;
			for(int i = 0; i < c.length; i++) {
				double a = random.nextInt(10);
				c[i] = a;
//				total += c[i];
				total += c[i];
				System.out.println("Value: " + c[i]);
				System.out.printf("Sum: %.2f%n", total);
				System.out.println();
			}
//			System.out.println();
			System.out.printf("Total: %.2f%n", total);
	
		}
		public static void copyElement() { // Question 7.8 (d)
			int[] a = new int[11];
			int[] b = new int[34];
			
			for(int i=0; i < a.length; i++) {
				int even = 2 * i;
				a[i] = even;
				System.out.println(a[i]);
				if(i == 10) {
					copyElement = a[i];
				}
			}
			System.out.println();
			
			for(int counter = 0; counter < b.length; counter++) {
				int odd = 1 + (2 * counter);
				b[counter] = odd;
				if(counter==0) {
				b[counter] = copyElement;
			}
				System.out.println(b[counter]);
			
		}
		System.out.println("eleventh element in a: " + copyElement);
		
		
		
		}
		public static void copyElement1() { // Question 7.8 (d) Version 2
			int[] a = new int[11];
			int[] b = new int[34];
			
			System.out.println("List of the 11-element:");
			for(int i=0; i < a.length; i++) {
				int even = 2 * i;
				a[i] = even;
				System.out.println(a[i]);
								
			}
			System.out.println();
			System.out.println("List of the 34-element:");
			for(int j = 0; j < b.length; j++) {
				
				if(j < 11) {
					int even = 2 * j;
					b[j] = even;
					System.out.println(b[j]);
			}
				if(j > 10) {
					int odd = 1 + (2 * j);
					b[j] = odd;
					System.out.println(b[j]);
				}
					
			}
				
		}		
				
			
}
