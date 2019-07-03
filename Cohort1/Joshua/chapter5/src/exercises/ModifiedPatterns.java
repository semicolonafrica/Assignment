
package exercises;



/**Exercise 5.22
 * @author Group 2(Me and Christian)
 *
 */
public class ModifiedPatterns {

	int counter = 0;
	public void triangleModified() {
		
	
		
		
		for(counter = 0; counter <= 5; counter++) {
			
			// first
			for(int side = 0; side <= counter; side++) {
				System.out.print("*");
			}
//				for(int space = 0; space <= 10 - counter; space++) 
//					System.out.print(" ");
		
			
			
					//second
					for(int reverse1 = 10; reverse1 >= counter; reverse1--) 
						System.out.print("*");
//				
//						for(int space = 0; space < counter; space++) 
//							System.out.print(" ");
//			
//			
//			
//						//third
//						for(int space = 0; space < counter; space++) 
//							System.out.print("");
							for(int reverse2 = 10; reverse2 >= counter; reverse2--) 
								System.out.print("*");
//				
//			
//			
//			
//							//fourth
							for(int space = 0; space <= 10 - counter; space++) 
									System.out.print(" ");
//								for(int side1 = 1; side1 <= counter; side1++)
//									System.out.print("*");
				
		 // System.out.print("");
			
	  }//end of superloop
			
	}
}