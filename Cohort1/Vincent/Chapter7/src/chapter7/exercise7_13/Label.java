package chapter7.exercise7_13;

public class Label {

	public  static void main(String[]args) {
		
		int [][] sales = new int [3][5];
		int counter = 0;
	  for (int row = 0; row < sales.length; row++ )
		{
		for ( int col =0; col < sales[ row ].length; col++ )
		{
			counter++;
		System.out.printf("%d%d ",counter,sales[row][col]=0);
		}
		
		System.out.println();
		}
	}
}
