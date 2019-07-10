package exercise7_8;

public class JavaStatement {

	public static void main(String[] args) {
	//Answer to A	
	int[] f = {12, 2, 9, 0, 16, 100, 4};
		System.out.println("The value of element 6 is: " + f[6]);
	
	//Answer to B
		System.out.println();
	int[] g = {8, 8, 8, 8, 8};
		System.out.println("Index \t Value");
		for(int count = 0; count < g.length; count++)
		System.out.println(count + "\t  " + g[count]);	
		
	//Answer to C	
		System.out.println();
	float[] c = new float[100];	
			float total = 0;
		 for(int count = 0; count < c.length; count++) {
			 c[count] = (float) (7.0 * count);
			 total += c[count];
			 }			
		 	System.out.println("The Total of the 100 floating-point is:"+ total);
	
 	//Answer to D	 	
		 	System.out.println();
	int [] a = {1, 1, 2, 2, 3, 1, 1, 3, 4, 5, 2};
		 	int [] b = new int[34];
		 		for(int count = 0; count < a.length; count++) {
			 			b[count] = a[count];
		 		}
		 		System.out.println("Array a in Array b is now:");
		 		System.out.print("{");
		 		for(int count = 0; count < b.length; count++) {		 			
		 			System.out.print(" "+b[count]);
		 			}
		 		System.out.print("}");
		 		System.out.println();

		 //Answer to E	 		
		 		System.out.println();
	double [] w = new double [99];
	w[12] = -4; w[34] = 88; w[92] = 7;
	int count;	double largestNumber = 0;
//		for(count = 0; count < w.length; count++) {
//			w[count] = (3.0 * count);
//			System.out.print(" " + w[count]);
//			}
		for(count = 0; count < w.length; count++) {
			if(w[count] > largestNumber) {		
			largestNumber = w[count];				
			}
		}
		System.out.println();
		System.out.println(largestNumber);
	}
}

