package exercise7_13;

public class LabelTheElement {
	
	public static void outputSales() {
		int row;
		int column;
		int count = 1;
		int[][]sales = new int [3][5];
		
	for (row = 0; row < sales.length; row++) {
		for (column = 0; column < sales[row].length; column++) {
			sales[row][column] = 0;
			System.out.printf("%d(%d) ",count, sales[row][column]);
			count++;
			}
		System.out.println();
		}
	}

	
public static void main(String[] args) {
		
		outputSales();
	
	
	}

}
