/**
 * 
 */
package chapter7;

/**
 * @author gbemi
 *
 */
import java.security.SecureRandom;
public class DisplayArray {
	
	public static void display() {
		
		System.out.println("displaying array with a default value");
		
		int[] f= new int[5];
		System.out.println("index value");
		for(int i=0;i<f.length;i++) {
			System.out.printf("%s%8s%n", i,f[i]);
	}
}
	
	public static void init() {
		
		System.out.println("initializing array to 8");
		
		int[] g= new int[5];
		System.out.println("index value");
		for(int x=0;x<g.length;x++) {
			
			g[x]=8;
			
			System.out.printf("%s%8s%n", x,g[x]);
		}
	}
	
	public static void total() {
		
		System.out.println("calculating total of array");
		
		float total=0;
		
		int[] c= new int[100];
		System.out.println("index total");
		for(int x=0;x<c.length;x++) {
			
			c[x]=8;
			
			total+=c[x];
			
			System.out.printf("%s%8s%n", x,  total);
			
			
		}
		
		
	}
	
	public static void copy() {
		
	System.out.println("copying element of array A to array B ");
	
		int[] b = {34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,};
	
		int[] a= {1,2,3,4,5,6,7,8,9,10,11};
		
		System.out.println("index value");
		for(int y=0;y<a.length;y++) {
		b[y]=a[y];
		
		
		}
		
		
		for(int y=0;y<b.length;y++) {
			
			
		System.out.printf("%s%8s%n" ,y,b[y]);
		
		
		}
		
		
	}
	
	public static void compare() {
		
		
		int [] w= new int[99];
		
		int largest=w[0];
		
		int smallest=w[0];

		for(int f =0;f<w.length;f++) {
			
			w[f]=2+f;
			
			if(w[f]>largest) {
				largest=w[f];
			}
			else if(w[f]<smallest) {
				smallest=w[f];
			}
			
		}
		System.out.println("the largest number is :" +largest);
		System.out.println("the smallest number is :" +smallest);
	}
	
	public static void rollDie() {
		SecureRandom number= new SecureRandom();
		int[] frequency = new int[7];
		
		for(int roll =1;roll<=6000000;roll++)
		++frequency[1+number.nextInt(6)];
			for(int face=1;face<frequency.length;face++)
				System.out.println(face+"   "+frequency[face]);
	}
	
	public static void main(String[] args) {
//		display();
//		init();
//		total();
//		copy();
//		
//		compare();
		rollDie();
	}
	
}
