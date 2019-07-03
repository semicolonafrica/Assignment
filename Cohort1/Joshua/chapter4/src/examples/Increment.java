/**Fig. 4.15: Increment.java
 * prefix increment and postfix incrementoperators
 */
package examples;

/**
 * @author user
 *
 */
public class Increment {
	
	public static void main(String[] args) {
	
	//demonstrate postfix increment operator
	int c = 5;
	System.out.printf("c before post increment: %d%n", c); //print 5
	System.out.printf("      post increment c: %d%n", c++);//print 5
	System.out.printf(" c after post increment: %d%n", c);//print 6
	
	System.out.println(); // skip a line
	
	//demonstrate prefix increment operator
	c =5;
	System.out.printf("  c before pre increment %d%n" ,c);//print 5
	System.out.printf("      pre incrementing c %d%n" ,++c);//print 6
	System.out.printf(" c after pre increment %d%n" ,c);//print 6
	}//end main method
}//end class Increment.java
