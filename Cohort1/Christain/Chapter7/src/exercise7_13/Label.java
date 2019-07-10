package exercise7_13;

public class Label {
	public void calSales() {
		int sales [] [] = new int [3] [5];
		int counter = 0;
		for (int row = 0; row < sales.length; row++)
		{
		for (int col = 0; col < sales[row].length; col++)
		{
		sales[row][col] = 0;
		
		System.out.printf("%d%2d", counter, sales[row][col]);
		counter++;
		}
		System.out.println();
		}
	}
}
