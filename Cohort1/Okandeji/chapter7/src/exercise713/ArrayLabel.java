package exercise713;

public class ArrayLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sales = new int[3][5];
		System.out.printf("%3s%8s%9s%n", "Row", "Column", "Element");
		
		for(int row = 0; row < sales.length; row++) {
			for(int col = 0; col < sales[row].length; col++) {
			sales[row][col] = 0;
			System.out.printf("%3d%8d%9d%n", row, col, sales[row][col]);
			if((col + 1)%5 == 0)
				System.out.println();
			}
		}
	}

}
