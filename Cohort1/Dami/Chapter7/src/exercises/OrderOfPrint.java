package exercises; //Exercise 7.13

public class OrderOfPrint {
	
	public static void main(String[] args) {
		int[][] sales = new int[3][5];
		int count = 1;
		
		for (int row = 0; row < sales.length; row++) {
			
			for (int col = 0; col < sales[row].length; col++) {
				
			sales[row][col] = 0;
			System.out.printf("%3d:%d ",count,sales[row][col]);
			count++;
			}
			
			System.out.println();
			
			}
	}

}
