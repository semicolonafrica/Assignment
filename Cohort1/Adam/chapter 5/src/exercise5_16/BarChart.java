package exercise5_16;

import java.util.Scanner;
public class BarChart {
	
	public void displayBarChart() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the of ");
		
		System.out.print("Enter number1: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter number2: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter number3: ");
		int number3 = input.nextInt();
		
		System.out.print("Enter number4: ");
		int number4 = input.nextInt();
		
		System.out.print("Enter number5: ");
		int number5 = input.nextInt();
		 
		int counter = 1;
		int k = 0;
		while(counter <= 5) {
			if(counter== 1) {
				k = number1; 
			}
			else if(counter==2) {
				k = number2;
			}
			else if(counter==3) {
				k = number3;
			}
			else if(counter==4) {
				k = number4;
			}
			else  {
				k = number5;
			}
//			else {
//				break;
//			}
			for(int i = k; i>0;i--) {
				System.out.print("*");
			}
			System.out.println();
			counter++;
		}
		input.close();
	}

}
