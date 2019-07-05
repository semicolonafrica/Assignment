package chapter7.exercise713;

public class SalesLabel {
	
	public static void salesLabel () {
		
		int[][] sales = new int[3][5];
		int counter = 1;
		
		for (int row = 0; row < sales.length; row++)
		{
			for (int col = 0; col < sales[row].length; col++)
			{
				
				System.out.printf("%d%d", counter, sales[row][col] = 0);
				counter++;
			}
			
			System.out.println();
		}
		
		
		
	}

}
