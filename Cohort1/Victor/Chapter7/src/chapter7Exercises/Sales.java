package chapter7Exercises;

public class Sales {
	
//	Label the elements of three-by-five two-dimensional array sales to indicate the order in
//	which they’re set to zero by the following program segment:
	
	
	
	public static void salesValues() {
//		int [][] sales = {{1,2,3,3,5}, {4,5,6,7,8}, {7,6,5,4,3}};
		int [][]sales = new int [3][5];
		
		System.out.println("Values are");
		printSales(sales);
			
	}
	
	public static  void printSales(int [][] sales) {
		int counter =0;
		for (int row = 0; row < sales.length; row++){
			
			for (int col = 0; col < sales[row].length; col++){
				sales[row][col] = 0;
				
				System.out.printf("%d(%d) ",counter, sales[row][col]);
				counter++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Sales.salesValues();

	}

}
