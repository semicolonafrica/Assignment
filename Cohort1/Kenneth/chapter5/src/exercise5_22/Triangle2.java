package exercise5_22;

public class Triangle2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A = 1, B = 12, C = 10, D = 5;
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = A; j > 0; j--)
			{
				System.out.print("*");
			}
			for(int k = B; k > 0; k--)
			{
				System.out.print(" ");
			}
			for(int m = C; m > 0; m--)
			{
				System.out.print("*");
			}
			for(int n = D; n > 0; n--)
			{
				System.out.print(" ");
			}
			for(int m = C; m > 0; m--)
			{
				System.out.print("*");
			}
			for(int k = B; k > 0; k--)
			{
				System.out.print(" ");
			}
			for(int j = A; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
			A+=1; B-=1; C-=1; D+=2;
		}
		
	}


}
