/**
 * 
 */
package chapter5.exercise5_15;

/**
 * @author USER
 *
 */
public class AsterickTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=10; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println();
					for(int x=j-9; x<=1;x++) {
						System.out.print(" ");
					}
				}
				
			}
			
		}	
	
	
	
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");	
				if(j==i) {
					System.out.println();
					for(int x=i-1; x<9;x++) {
						System.out.print(" ");
					}
				}
				
			}
			
		}	
		

	}

	}


