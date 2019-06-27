package chapter6.exercises;

import java.util.Scanner;
public class Multiple {
	public static void isMultiple() {
		Scanner input = new Scanner(System.in);
		int input1;
		int input2;
		int i=1;
		boolean result=false;
		
		
		for (; i>0; i++) { 
			
			System.out.println("enter the two number you want to compare or -1 to stop");
			
			 input1 =input.nextInt();
			 input2 = input.nextInt();
			
			if(input1 == -1) {
				break;
			}
			if(input1 % input2 == 0) {
				 System.out.println(true);				
			}
			else {
				System.out.println(false);
			}
		}
	}
	public static void main(String[] args) {
		
		isMultiple();
	}

}
