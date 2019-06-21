/**
 * 
 */
package chapter5.exercise5_24;

/**
 * @author USER
 *
 */
public class Diamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		int A = 5; int C = 1;
		for(int counter = 1; counter <= 5; counter++){
			for(int i = A; i >=1; i--) {
				System.out.print(" ");
			}
			//System.out.println();
			
			for(int j = 1; j<=C; j++) { 
			System.out.print("*");
			}
			if(counter > 2) {
				A += 1;
				C -= 2;
			}else {
				A-=1; 
				C += 2;
			}
			System.out.println();

		
			
		}

	}
	
}
