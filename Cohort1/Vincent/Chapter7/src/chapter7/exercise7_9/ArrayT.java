package chapter7.exercise7_9;
import java.security.SecureRandom;
public class ArrayT {

	public static void displayArray() {
		
		int [] f = new int [6];
		
		System.out.println(f[4]);
		System.out.println();
		int [] g = new int [5];
		g [0] = 8;
		g [1] = 8;
		g [2] = 8;
		g [3] = 4;
		g [4] = 8;
		System.out.println(g[3]);
		System.out.println();
	}
		public static void showArray () {
			
		int [] c = new int [100];
		int total = 0;
		
		for(int counter =0; counter < c.length; counter++) {
			
		}
		total += c.length;
		System.out.println(total);
		System.out.println();
		}
		
		public static void switchArray() {
		int [] a  =  {45,76,8,3,2,99,0,76,12,23,23};
		int [] b = new int [34];
		
		for (int i = 0; i< a.length; i++) {
			b[i] = a[i];
		}
		
		
		for(int counter = 0; counter < b.length; counter++) {
			System.out.println(b[counter]);
		}
			System.out.println();
	}

		public static void findLargestandSmallest() {
			
			double largest = 0;
			double smallest = 0;
			SecureRandom random = new SecureRandom ();
			int [] number = new int [99];
			
			for(int counter = 0; counter < number.length; counter++) {
				number[counter]= 1 + random.nextInt(99 );
				
				System.out.println(number[counter]);
				
			}
			
			largest = number[0];
			smallest = number [0];
			
			for(int j = 0; j < number.length; j++) {
			
				if (number[j] > largest)
					largest = number[j];
			
				if (number[j] < smallest)
					smallest = number[j];
					
			}
			
			System.out.println("smallest is the: " + smallest);
			System.out.println("largest is the: " + largest);
	
		
		
			
			
			
//			for(int counter = 0; counter < w.length; counter++) {
//				
//				if(w[counter] >= 4) {
//					System.out.println("it is the largest");
//				}
//				
//				if(w[counter] <=2) {
//					System.out.println("it is the smallest");
//				}
//				
//				System.out.println(w[counter]);
//			}
		
		}
}
