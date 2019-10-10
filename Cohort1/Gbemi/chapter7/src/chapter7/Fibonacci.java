/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
public class Fibonacci {
	
	public  void printFibonacci(int[]array) {
		array[0]=0;
		array[1]=1;
		int largest=0;
		System.out.println("the fibonacci of " + array.length+" "+ "is");
		System.out.printf("%10d", array[1]);
		
		for(int i=2;i<array.length;i++) {
			
			array[2]=array[0]+array[1];
			
			array[0]=array[1];
			array[1]=array[2];
			
			System.out.printf("%10d%n%10d",array[2],i);
			
			if(array[2]>largest) {
				largest=array[2];
				
			}
			
		}
		System.out.println();

		System.out.print("largest number is  " +largest);
		
	}
	public static void doubleFibonacci(double[]array) {
		
		array[0]=0;
		array[1]=1;
		
		
		for(int y=2;y<=array.length;y++) {
			
			array[2]=array[0]+array[1];
			
			
			array[0]=array[1];
			array[1]=array[2];
			
			
			System.out.println( array[2]);
		}
		double largest=0.0;
		
		for(double count:array) {
			
			if(count>largest) {
				largest=count;
			}
		
		}
		System.out.println("the largest number is" + largest);
	}
	
	


}
