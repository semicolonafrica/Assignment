/**
 * 
 */
package examples;

/**Fig. 4.10: ClassAverae1.java
 * Solving the class average problem using sentinel-controlled repetition.
 * @author user
 *
 */
import java.util.Scanner; // program uses class scanner
public class ClassAverage1 {

	// create scanner to obtain input from command window.
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		//initialization phase
		int total = 0; // initialize sum of grade
		int gradeCounter = 0; // initialize number of grade entered so far
		
		//processing phase
		//prompt for input and read grade from user
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		//loop till sentinel value read from user 
		while(grade != -1) {
			total =  total + grade; //add grade to total
			gradeCounter  = gradeCounter + 1; // increment counter
			
			//prompt for input and read next grade from user
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}

		// termination phase
		//if user entered at least one grade...
		if(gradeCounter != 0) {
			
			//use number with decimal point to calculate grade average
			double average = (double) total /gradeCounter;
			
			//display total and average(with two digits of precision
			System.out.printf("%nTotal of the %d grades entered is %d%n" , gradeCounter, total);
			System.out.printf("Class average is %.2f%n" , average);
		}
		else //no grades were entered so output appropriate message
			System.out.println("No grades were entered");
		input.close();
		
	}

}//end class main
