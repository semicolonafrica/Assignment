package chapter5.exercise518;

public class ModifiedTrianglePrinting {

	public static void main(String[] args) {
		
		System.out.printf("%s%15s%15s%15s%n","(a)","(b)","(c)","(d)");
	int A = 15, B = 10, C = 5, N = 15;
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = A; k >= 1; k--) {
				System.out.print(" ");
			}
			for(int l = B; l >= 1; l--) {
				System.out.print("*");
			}
			for(int m = 1; m <= C; m++) {
				System.out.print(" ");
			}
			for(int n = B; n >= 1; n--) {
				System.out.print("*");
			}
			for(int r = N; r >= 1; r--) {
				System.out.print(" ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
			A -= 1; B -=1; C+=2; N-=1;
		}
		

	}

}
