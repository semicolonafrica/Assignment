/**
 * 
 */
package chapter5.exercise5_21;

/**
 * @author USER
 *
 */
public class PythagoreanTriples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("side1\tside2\thyp");
		 for(int side1 = 1; side1 <=500; side1++) {
			 for(int side2 = 1; side2 <= 500; side2++) {
				 for(int hyp = 1; hyp <=500; hyp++) { 
					 if((side1 * side1)+(side2 * side2)==(hyp*hyp)) {
						 System.out.println(side1 + "\t" + side2+"\t"+ hyp);
					 }
					 
				 }
				 
			 }
			
		 }
		 
			 

	}

}
