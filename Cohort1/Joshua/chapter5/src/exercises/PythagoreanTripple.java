/**
 * 
 */
package exercises;

/**Exercise 5.21
 * @author user
 *
 */
public class PythagoreanTripple {
	
	public void pTripple() {
		
		System.out.println("Side1\tSide2\t Hypothenuse");
		for(int side1 = 1; side1 <= 500; side1++) {
			
			for(int side2 = 1; side2 <= 500; side2++) {
				
				for(int hyp = 1; hyp <= 500; hyp++) {
					
					if(((side1 * side1) + (side2 * side2)) == (hyp * hyp)) {
						
						System.out.printf("%d\t %4d\t %6d%n", side1, side2, hyp);
					}
				}
			}
		}//end of super for loop(superloop)
		
	}//end of method pTripple

}// end of PythagoreanTripple.java
