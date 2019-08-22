package exercise7_13;

public class LabelMultiArray {

	public static void main(String[] args) {
		//declare and initialize 3 by 5 array
		int[][] sales = new int[3][5];
		for (int row = 0; row < sales.length; row++){			
			for (int col = 0; col < sales[row].length; col++){
				sales[row][col] = 0;
				System.out.print(sales[row][col]+" ");// print array in order
				}
			System.out.println();// move array to next line of printing
		}
	}

}
