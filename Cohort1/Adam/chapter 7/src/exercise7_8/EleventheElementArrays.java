package exercise7_8;

public class EleventheElementArrays {
	
	public static void main(String[] args) {
		
		int[] a =  new int[11];
		
		int[] b = new int[34];
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = 3;
			b[i] = a[i];
			
		}
		for(int j = 0; j < b.length; j++) {
			
			System.out.printf("%d\t%d%n", j,b[j]);
		}
 	}

}
