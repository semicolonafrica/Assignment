/**
 * 
 */
package chapter7.exercises;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Figure7_6_BarChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure7_6_BarChart.generate();
		
		}
	
	public static void generate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 to find out about you or \n"
				+ "2 to enter your story yourself! ");
		
		int num = input.nextInt();
		if(num ==1) {
			System.out.println("Your name is Oluwakemi Yusuf, you are a .....\n"
					+ "do you want to know more?");
			System.out.println(" 1 for Yes " + " 2 for No");
			
			int yes = 1;
			int no = 2;
			int response = input.nextInt();
			
			if(response == 1) {
				System.out.println("Which part do you want us to display\n "
						+ "1 for school records\n "
						+ "2 for family; 3 for career path\n "
						+ "4 for others.");
				int records = input.nextInt();
				if(records == 1) {
					schoolRecords();
				}else if(records == 2) {
					familyRecords();
				}else if(records == 3) {
					careerRecords();
				}else if(records == 4) {
					otherRecords(); 
				}
				
			}else if (response == 2) {
				System.out.println("It would have been nice to display more of your details: Guess some other time!");
			}
			
		}		

	}
		


	public static void schoolRecords() {
		System.out.println("You attended primary from year 1900 to year 1900. You re a "
				+ "graduate of Biochemistry");
	}
	public static void familyRecords() {
		System.out.println("You re from kogi state");
	}
	public static void careerRecords() {
		System.out.println("You worked at Shoprite for a pharmaceutical comapny and "
				+ "now a student at Semicolon.");
	}
	public static void otherRecords() {
		System.out.println("You re lovely and good looking.");
	}

}