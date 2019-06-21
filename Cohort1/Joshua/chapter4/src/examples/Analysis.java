/**
 * 
 */
package examples;

/**Pseudocode
 * Initialize passes to zero
2 Initialize failures to zero
3 Initialize student counter to one
4
5 While student counter is less than or equal to 10
6 Prompt the user to enter the next exam result
7 Input the next exam result
8
9 If the student passed
10 Add one to passes
11 Else
12 Add one to failures
13
14 Add one to student counter
15
16 Print the number of passes
17 Print the number of failures
18
19 If more than eight students passed
20 Print “Bonus to instructor!”
 * @author Joshua
 *Fig. 4.12:Analysis class
 *Analysis of examonation result using nested control statement
 */
import java.util.Scanner;
public class Analysis {

	
	public static void main(String[] args) {
		//create scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		//initialize variables in declaration
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		//process 10 students using counter control loop
		while(studentCounter <= 10) {
			//prompt user for input and obtain values from user
			System.out.println("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();
			
			//if..else is nested in the while statement
			if(result == 1)
				passes = passes + 1;
			else
				failures = failures + 1;
			
			//increment student counter so, loop eventually terminates
			studentCounter = studentCounter + 1;
		}
		// termination phase, prepare and display results
		System.out.printf("Passed: %d%nFailed: %d", passes, failures);
		
		//determine whether more than 8 students passed
		if(passes >= 8)
			System.out.println(" Bonus to instructor!");

	}

}// end of class Analysis
