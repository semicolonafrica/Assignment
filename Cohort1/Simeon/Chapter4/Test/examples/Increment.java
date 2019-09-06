package examples;

public class Increment {

	public static void main(String[] args) {

		// demonstrate post-fix increment operator
		int c = 5;
		System.out.printf("c before postincrement: %d%n", c); // print 5
		System.out.printf("    postincrementing c: %d%n", c++); // prints 5
		System.out.printf(" c after postincrement: %d%n", c); // print 6
		
		System.out.println(); // skip a line
		
		// demonstrate prefix increment operator
		c = 5;
		System.out.printf("  c before preincrement: %d%n", c); // prints 5
		System.out.printf("         preincrement c: %d%n", ++c); // prints 6
		System.out.printf("   c after preincrement: %d%n", c); // prints 6

	}

} // end class Increment
