package exercise7_8;

public class ElementSix {
	
	public static void main(String[] args) {
		
		int[] f = new int[6];
		
		for(int i = 0; i < f.length; i++) {
			
			f[i] = 4+2*i;
			
			System.out.printf("%d%n",f[i]);
			
			
		}
		System.out.println();
		System.out.printf("%s%2d%n", "The Element 6 in the F Array is: ",
				f[5]);
		
	}

}
