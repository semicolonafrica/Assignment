package exercise7_8;
import java.security.SecureRandom;
//import java.util.Scanner;

public class JavaStatement {
//	static Scanner input = new Scanner(System.in);
	static SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] f = new int[7];
		System.out.printf("%s%5d%n", "the 6th element is: ", f[6]);
		
		int[] g = new int[5];
		System.out.printf("%s%5s%n", "position ", "value");
		for(int i = 0; i<g.length; i++) {
			g[i]=8;
			System.out.printf("%5d%7d%n", i+1, g[i]);
		}
		
		float[] c= new float[100];
		float total =0;
		for(int i=0; i<c.length ; i++) {
			c[i] = random.nextFloat() + random.nextInt(100);
			total+=c[i];
			System.out.printf("    %f",c[i]);
		}
		System.out.println();
		System.out.println(total);
		
		int[] a = new int[11];
		int[] b  = new int[34];
		System.out.printf("%7s%7s%n", "position a", " value A");
		for(int i =0; i<a.length; i++) {
			a[i]= random.nextInt(10);
			System.out.printf("%7d%7d%n",i, a[i]);
		}
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		
		System.out.printf("%n%7s%7s%n", "position b ", "value b");
		for(int i=0;i<b.length;i++) {
			System.out.printf("%4d%8d%n",i, b[i]);
		}
		System.out.println();
		System.out.println("exercise 7_8d");
		
		float[] w= new float[100];
		
		for(int i=0; i<w.length ; i++) {
			w[i] = random.nextFloat() + random.nextInt(100);
		}
		float smallest =w[0];
		float largest =w[0];
		for(int i =0; i<w.length; i++) {
			if(w[i]>largest) {
				largest = w[i];
			}
			if(w[i]<smallest) {
				smallest = w[i];
			}
			System.out.print(" " +w[i]);
		}
		System.out.println();
		System.out.println(smallest);
		System.out.println(largest);
		
		
		
		
	}

}
