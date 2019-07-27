/**
 * 
 */
package chapter7;

/**
 * 
 * (Using the Enhanced for Statement) Write an application that uses an enhanced for statement
to sum the double values passed by the command-line arguments. [Hint: Use the static
method parseDouble of class Double to convert a String to a double value.]
 * @author gbemi
 *
 */
public class EnchancedFor {
	public static void main (String [] args) {
		double result=1;
		double[] store;
		double hold;
		
		double arrayLength = args.length;
		
		store= new double[(int) arrayLength];
		
		for(int f=0; f<store.length;f++) {
			 hold=Double.parseDouble(args[f]);
			 store[f]=hold;
		}
		for(double value:store) {
			result+=value;
		
		}	
		System.out.println(result);
	}

}
