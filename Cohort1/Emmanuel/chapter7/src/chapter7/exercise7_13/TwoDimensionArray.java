/**
 * 
 */
package chapter7.exercise7_13;

/**
 * @author ayoitunu
 *
 */
public class TwoDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] sales = new int[3][5];
		
		for (int row = 0; row < sales.length; row++)
	{
		for (int col = 0; col < sales[row].length; col++)
		{
			sales[row][col] = 0;
			//System.out.print(sales[row][col]);
			System.out.printf("row %d col %d = %d%n", row, col, sales[row][col]);
		}
		}
		//System.out.println();
	}
		

	}


