/**
 * 
 */
package chapter6.Exercises;

/**
 * @author group 1 (Me and Emmanuel).
 *
 */
public class ValueOfX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//double x = Math.abs(7.5); // absolute whole number

		double p = Math.floor(7.5);  // rounds up to the lower integer
		System.out.println(" The value of P is: " + p);
		
		
		double o = Math.abs(0.0);
		System.out.println(" The value of O is: " + o);
		
		
		double r = Math.ceil(0.0);//Round up to the higher integer
		System.out.println(" The value of R is: " + r);
		
		
		double t = Math.abs(-6.4);
		System.out.println(" The value of T is: " + t);
		
		
		double e = Math.ceil(-6.4);
		System.out.println(" The value of E is: " + e);
		
		
		double r1 = Math.ceil(- Math.abs(-8 + Math.floor(-5.5)));
		System.out.println(" The value of R. is: " + r1);
	}

}
