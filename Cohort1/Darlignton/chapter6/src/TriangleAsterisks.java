
public class TriangleAsterisks {
	public static void main(String args[]) {
		
		int controlVariable = 1;
		
		for(int row = 1; row <= 10; row++) {
			for(int column = controlVariable; column <= controlVariable; column++) {
				System.out.print("*");
				column++;
			}
			System.out.println();
		}
		
	}

}
