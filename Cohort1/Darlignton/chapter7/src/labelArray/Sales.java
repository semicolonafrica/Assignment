package labelArray;

public class Sales {
	public static void main(String args[]) {
		int[][] sales = new int[3][5];
		for (int row = 0; row < sales.length; row++){
			
			for (int col = 0; col < sales[row].length; col++){
			if(col%5 == 0) {
				System.out.println();
			}
			sales[row][col] = 0;
			System.out.print(sales[row][col]);
			}
		}
	}
	
}


