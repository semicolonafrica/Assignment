/**
 * 
 */
package chapter7;

import java.lang.reflect.Array;

/**
 * @author gbemi
 * (Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the
first command-line argument. If no command-line argument is supplied, use 10 as the default size
of the array.
7.16 (Using the Enhanced for Statement) Write an application that uses an enhanced
 *
 */
public class CommandArgument {
	public static void main(String[] args) {
		int[]store;
		if(args.length != 3) {
			store=new int[10];
			for(int number: store)
				System.out.println(number);
		}
		else {
			int arrayLength=Integer.parseInt(args[0]);
			store= new int[arrayLength];
		
		
		int initialValue=Integer.parseInt(args[1]);
		int increment= Integer.parseInt(args[2]);
		
		for(int counter=0;counter<store.length;counter++) {
			
		store[counter] = initialValue + increment * counter;
		
		System.out.println(counter+" "+store[counter]);
		
		}
		}
	}
}
