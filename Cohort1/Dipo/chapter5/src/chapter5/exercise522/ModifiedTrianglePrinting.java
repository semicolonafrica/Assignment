package chapter5.exercise522;

public class ModifiedTrianglePrinting {

	public static void main(String[] args) {
		
		int A = 15;
		int B = 10;
		int C = 5;
		int D = 10;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			for(int x = A; x >= 1; x--) {
				System.out.print(" ");
			}
			for(int y = B; y >= 1; y--) {
				System.out.print("*");
			}
			for(int z = 1; z <= C; z++) {
				System.out.print(" ");
			}
			for(int b = B; b >= 1; b--) {
				System.out.print("*");
			}
			for(int l = A; l >= 1; l--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			A-=1; B-=1; C+=2; D+=1;
			System.out.println();
			
		}
		

	}

}
