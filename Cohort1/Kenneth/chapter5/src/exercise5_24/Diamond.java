package exercise5_24;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 1, B = 5, C = 7,D = 2, num1 = 5;
		
		for(int k = num1; k > 0; k--) {
			
			for(int i = B; i > 0; i-- ) {
				System.out.print(" ");
			}
			for(int j = A; j > 0; j--) {
			System.out.print("*");
			}
			System.out.println();
			A+=2; B-=1;
		}
		int num2 =4;
		
		for(int k = num2; k > 0; k--) {
			
			for(int i = D; i > 0; i--) {
				System.out.print(" ");
			}
			for(int j = C; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
			C -=2; D+=1;
		}
	}

}
