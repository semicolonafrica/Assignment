package chapter5.examples;
/**
 * Fig. 5.19 : LogicalOperator.java
 * logical operator
 * @author user
 *
 */

public class LogicalOperators {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//create truth table for && (conditional AND) operator
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
				"Conditional AND (&&)", "false and yfalse", ( false && false), 
				"false and true", (false && true), "true and false", 
				(true && false), "true and true", (true && true));
		
		//create truth table for || (conditional OR) operator
				System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
						"Conditional OR (||)", "false || false", ( false || false), 
						"false || true", (false || true), "true || false", 
						(true || false), "true || true", (true || true));
				
				//create truth table for & (boolean logical AND) operator
				System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
						"boolean logical AND (&)", "false & false", ( false & false), 
						"false & true", (false & true), "true & false", 
						(true & false), "true & true", (true & true));
				
				//create truth table for | (boolean logical exclusive OR) operator
				System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
						"boolean logical exclusive OR (|)", "false | false", ( false | false), 
						"false | true", (false | true), "true | false", 
						(true | false), "true | true", (true | true));
				
				
				//create truth table for ^ (boolean logical exclusive OR) operator
				System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
						"boolean logical exclusive OR (^)", "false ^ false", ( false ^ false), 
						"false ^ true", (false ^ true), "true 6 false", 
						(true ^ false), "true ^ true", (true ^ true));
				
				// create truth table for ! (logical negation) operator
				System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
						"!false",(!false),  "!true", (!true) );
	}

}
