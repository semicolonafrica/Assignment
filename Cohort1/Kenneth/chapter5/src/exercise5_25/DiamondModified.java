/**
 * 
 */
package exercise5_25;

/**
 * @author ken_granero
 *
 */
import java.util.Scanner;

public class DiamondModified {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter odd number in the range 1-19: ");
		int num = insert.nextInt();
		
		int diamond = num/2;
		
		int A = diamond, B = 1;
		
		for(int k = 1; k <= num; k++) {
			
			for(int j = A; j > 0; j-- ) {
				System.out.print(" ");
			}
			for(int x = B; x > 0; x--) {
				System.out.print("*");
			}
			System.out.println();
			
		
			if(k > diamond) {
		
			B-=2; A+=1;
			}
			else {
			A-=1; B+=2;
			}
			
		}
		insert.close();
	}

}
