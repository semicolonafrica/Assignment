package exercise7_3;

public class Exercise7_3 {
	
	public static void exercise7_3a() {
		int[] f = {7,8,5,4,6,7,9,3,0,23};
		System.out.println(f[5]);
		
	}
	public static void exercise7_3b() {
		int [] g = new int[5];
		//int total =0;
		System.out.printf("%s %8s%n", "Index","Value");
		for(int i =0;i<g.length;i++) {
			g[i] = 8;
			//total+=g[i];
			System.out.printf("%5d%8d%n", i,g[i]);
		}
		//System.out.printf("%s %d%n", "Total is",total);
	}
	
	public static void exercise7_3c() {
		double [] c = new double[100];
		double total =0;
		
		System.out.printf("%s %8s%n", "Index","Value");
		for(int i =0;i<c.length;i++) {
			c[i] =3 + 3* i;
			total+=c[i];
			System.out.printf("%5d%8.2f%n", i,c[i]);
		}
		System.out.printf("%s %.2f%n", "Total is",total);
	}
	
	public static void exercise7_3d() {
		int [] a = {2,45,6,7,8,9,0,12,34,5,3}; 
		int [] b = {2,34,4,5,6,3,4,7,89,56,12,10,22,14,54,15,16,13,64,17,89,56,12,10,42,34,41,51,61,31,41,71,89,10};
		int i;
		System.out.printf("%s %8s%n", "Index","Value");
		for(i =0;i<a.length;i++) {
			b[i] = a[i];		
		}
		System.out.println("New b is:");
		for(int j =0;j<b.length;j++) {
			System.out.printf("%8d%n",b[j]);
		}
	}
	
	public static void exercise7_3e() {
		int [] w = {12,14,11,10,5,6,7,99,3,8};
		int smallest = w[0];
		int largest = w[0];
		
		
		for(int i = 0;i<w.length;i++) {
			
			if(w[i]< smallest) {
				smallest = w[i];
			}
			if(w[i]> largest) {
				largest = w[i];
			}
		}
		System.out.printf("%s %d%n", "Smallest is",smallest);
		System.out.printf("%s %d%n", "Largest is",largest);

	}
	
	public static void exercise7_1() {
		final int ARRAY_LENGTH = 10;
		int [] g = new int[ARRAY_LENGTH];
		System.out.printf("%s %8s%n", "Index","Value");
		for(int i =0;i<ARRAY_LENGTH;i++) {
			g[i] = 2 + 2 * i;
			
			System.out.printf("%5d%8d%n", i,g[i]);
		}

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 exercise7_3a();
		exercise7_3b();
		exercise7_3c();
		exercise7_3d();
		exercise7_3e();
		//exercise7_1();
		
		
		
		

	}

}
