package figure7;

public class MultiDimensionalArray {
	
	public static void testMultidimensional() {
		int[][] b = new int[3][4];
		for(int row = 0;row<b.length;row++) {
			
			for(int column =0;column< b[row].length;column++) {
				b[row][column] = 2 + 2 * column; 
				System.out.print(b[row][column]);
			}
			
			System.out.println();
		}
	}
	
	public static int argumentList(int... numbers) {
		
		int total = 0;
		for(int value : numbers)
			total+=value;
		
		return total;
		
	}

	public static void main(String[] args) {
		testMultidimensional();
		
		int num1 = 20;
		int num2 = 50;
		int num3 = -20;
		int num4 = 100;
		
		System.out.println("The total for num1 and num3 is: " +argumentList(num1,num3));
		
		System.out.println("The total for num2 and num3 is: " +argumentList(num2,num3));
		
		System.out.println("The total for num4 and num3 is: " +argumentList(num4,num3));
		
		System.out.println("The total for all numbers is: " +argumentList(num1,num2,num3,num4));
	}

}
