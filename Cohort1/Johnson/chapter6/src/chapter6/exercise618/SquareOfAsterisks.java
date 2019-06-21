package chapter6.exercise618;

public class SquareOfAsterisks {
	public static void squareOfAsterisks(int side) {
		for (int i= 1; i<= side; i++) { // 
			for(int a = 1; a<=side; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareOfAsterisks(4);
		squareOfAsterisks(9);
		squareOfAsterisks(7);
		squareOfAsterisks(15);
	}

}
