package labelElements;

public class ThreeByFive {

	public static void labelElements() {
		
		
		int[][] sales = new int[3][5];
		int counter = 1;
		
		for (int row = 0; row < sales.length; row++) {
			
			 for (int col = 0; col < sales[row].length; col++) {
				 
			 sales[row][col] = 0;
			 
			 System.out.printf("%d:%d  ", counter,sales[row][col] );
			 counter++;
			 }
			 
			 System.out.println();
		
	}
		}
		
	public static void main(String[] args) {
		
		labelElements();
		
		}
	
	}