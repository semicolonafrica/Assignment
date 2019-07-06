package totalArray;

public class Total {
	
	public static void main(String args[]) {
		//Total the 100 elements of floating-point array c .
		
		float[] c = new float[100];
		float total = 0;
		
		for(int i = 0; i < c.length; i++) {
			total+= c[i];
		}
		
		System.out.println(total);
	}
}
