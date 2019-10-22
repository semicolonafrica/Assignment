package chapter7.exercise713;

public class TwoDimensional {
	
	public static void twoByFive() {
		
		int [][] sales = new int [3][5];
		
		
		//sales[0][0], sales[0][1], sales[0][2], sales[0][3], sales[0][4], sales[1][0], sales[1][1], sales[1][2], sales[1][3], sales[1][4], sales[2][0], sales[2][1], sales[2][2], sales[2][3], sales[2][4]
		
		System.out.println("Sales values are: ");
		
		printSales(sales);
		
	}
	
	public static void printSales(int [][]sales) {
		
		int count = 0;
		
		for ( int row = 0; row < sales.length; row++ ) {
	
			
			for ( int col = 0; col < sales[ row ].length; col++ ) {
				 sales[ row ][ col ] = 0;
					
					System.out.printf("%s %d[%d], ", "sales",count, sales[row][col]);
					count++;
			}
			System.out.println();

		}
	}

}
