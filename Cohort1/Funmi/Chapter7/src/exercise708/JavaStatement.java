package exercise708;
import java.security.SecureRandom;

public class JavaStatement {
	static SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int [] f = new int[7];
		System.out.printf("%s%3d%n ", "the 6th element is ", f[6]);
		
		System.out.println();
		int [ ] g = new int [5];
		System.out.printf("%5s%8s%n", "position" ,"value");
		
		for(int i = 0; i < g.length; i++) {
			g[i] = 8;
			System.out.printf("%5d%8d%n", i+1, g[i]);
			
		}
		System.out.println();
		System.out.printf("%6s%5s%n", "exercise", "7.08c");
		
		float [] c = new float[100];
		float total = 0;
		for(int k = 0; k<c.length; k++) {
			c[k] =random.nextFloat( ) + random.nextInt(100); 
			total += c[k];
			System.out.printf("%f", c[k]);
		}
		System.out.println();
		System.out.println(total);
		
		int [] a = new int [11];
		int [] b = new int [34];
		System.out.printf("%7s%8s%n", "Positon a", " Values a");
		
		for(int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(10);
			System.out.printf("%8d%8d%n", i,a[i]);
		}
		for(int k = 0; k<a.length; k++) {
			b[k] = a[k];
		}
		System.out.printf("%8s%8s%n", "Positon b", " Values b");
		for(int i = 0; i < b.length; i++) {
			System.out.printf("%5d%7d%n", i,b[i]);
		}
		System.out.println();
		System.out.println("exercise 7.08d");
		
		float []w = new float[100];
		for(int j = 0; j< w.length; j++) {
			w[j] = random.nextFloat( ) + random.nextInt(100); 
		}
		float smallest = w[0];
		float largest = w[0];
		for(int i = 0; i < w.length; i ++) {
			if(w[i]< smallest) {
				w[i] = smallest;
			}
			if(w[i] > largest) {
				w[i] = largest;
				System.out.print(" " + w[i]);
			}
			
		}
		System.out.println();
		System.out.println(smallest);
		System.out.println(largest);
	}

}
