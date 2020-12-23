package chapter5.examples;
/**
*Fig. 5.13: BreakTest.java
*break statement exiting a for loop
*
*/
public class BreakTest {
	
	public static void main(String[] args) {
		int count; // control variable also used after loop terminates
		
		for(count = 1; count<= 10; count++) {
			if(count == 5)
				break;// terminates loop if count is 5
			System.out.printf("%d ", count);
		}
		System.out.printf("%n Broke out of loop at count = %d%n ", count);
	}

}
