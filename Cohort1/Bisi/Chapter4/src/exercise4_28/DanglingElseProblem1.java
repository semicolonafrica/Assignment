package exercise4_28;

public class DanglingElseProblem1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		if (x < 10) {
			if (y > 10) {
			 System.out.println("*****");
			}
		}
		else {
			 System.out.println("#####");
			 System.out.println("$$$$$");
			}
		if (x < 10) {
			 if (y > 10) {
			 System.out.println("*****");
			 }
		}
			 else {
			 System.out.println("#####");
			 System.out.println("$$$$$");
			 }
	}
}
