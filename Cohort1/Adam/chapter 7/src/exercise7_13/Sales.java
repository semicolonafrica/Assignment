package exercise7_13;

public class Sales { 
	
	public static void main(String[] args) {
		
		int [][] sales = new int [3][5];
		System.out.printf("%s%n", "Displaying rows and column");
		
		for(int row = 0; row < sales.length; row++) {
			
			for(int col = 0; col< sales[row].length; col++) {
				
				sales[row][col] = 0;
				
				System.out.print( sales[row][col]);	
			}
			
			System.out.println();	
			
		}
	}
	
	

}
