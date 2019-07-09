package chapter7;

public class ElevenElementArray {

	public static void main(String[] args) {
		
		int[] a = new int[11];
		int[] b = new int[34];
		
		for(int k = 0; k < b.length; k++) {
			b[k] = 2 + 6 * k;
		}
		
		for(int i = 0; i < a.length; i++) {
			a[i] = 9;
			b[i] = a[i];
		}
		
		for(int j = 0; j < b.length; j++) {
			
			System.out.printf("%d\t%d%n", j,b[j]);

		}
		

	}

}
