/**
 * 
 */
package examples;

/** Fig. 4.8: ClassAvergae.java
 * solving the class average problem using counter controlled repetition
 * Set total to zero
 Set grade counter to one

 While grade counter is less than or equal to ten
 Prompt the user to enter the next grade
 Input the next grade
 Add the grade into the total
 Add one to the grade counter

 Set the class average to the total divided by ten
 Print the class average
 * @author user
 *
 */
import java.util.Scanner;
public class ClassAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 1;
		
		while(gradeCounter <= 10) {
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			
		}
		int average = total / 10;
		
		System.out.printf("%nTotal of all 10 grade is: %d%n", total);
		System.out.printf("Class average is %d%n", average);

	}

}
