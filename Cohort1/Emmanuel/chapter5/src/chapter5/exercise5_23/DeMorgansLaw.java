/**
 * 
 */
package chapter5.exercise5_23;

/**
 * @author Emmanuel Akinbode
 *
 */
public class DeMorgansLaw {


	boolean getComparism() {
		int x = 0,y = 0;
		
		if( !(x < 5) && !(y >= 7) == !((x<5) || (y>=7)) ){
		
			return true;
		}
		else {
			return false;
		}
		
		
//		!(a == b) || !(g != 5)
//		!((x <= 8) && (y > 4))
//		!((i > 4) || (j <= 6))
	}
	public static void main(String[] args) {

		DeMorgansLaw check = new DeMorgansLaw();
		System.out.println(check.getComparism());
			
		

	}

}
