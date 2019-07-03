/**
 * 
 */
package chapter7Exercise708c;

/**
 * @author Olayinka Oloko
 *
 */
public class FloatingPoint {

public static void main(String[] args) {

	float total = 0;
	
	float[] c;
	c = new float [100];
	
	for (float i = 0; i< c.length; i++) { 
	
	
	total += c[(int) i];
	System.out.printf("Total of Array elements: %.2f%n", total);
	

	}
}

}
