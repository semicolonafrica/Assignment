/**
 * 
 */
package chapter7;

/**
 * @author gbemi
 *
 */
public class ArraySales {
	
	public static void label() {
		
		
		int [] [] sales= new int[3][5];
		
		for (int row = 0; row < sales.length; row++)
		{
			
		for (int col = 0; col < sales[row].length; col++)
			
		{
		
		
				sales[row][col] = 0;
				if(col%5==0) {
					System.out.println();
				}
				System.out.printf("%d ",sales[row][col]);
		
		
		
		}
		}
	}
	
	public static void main (String[] args) {
		label();
	}

}

