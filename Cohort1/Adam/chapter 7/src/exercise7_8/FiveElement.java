package exercise7_8;

public class FiveElement {
	
	public static void main(String[] args) {
		
		int[] g = new int[5];
		
		//int value = 8;
		for(int i = 0; i < g.length; i++) {
			
			g[i] = 8;
			//g[i] = value + i;
			//value--;
			System.out.printf("%d ", g[i]);
		}
	}

}
