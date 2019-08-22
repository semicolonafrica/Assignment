package chapter2.exercise2_32;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int number1 = input.nextInt();
		System.out.println("enter second number: ");
		int number2 = input.nextInt();
		System.out.println("enter third number: ");
		int number3 = input.nextInt();
		System.out.println("enter fourth number: ");
		int number4 = input.nextInt();
		System.out.println("enter fifth number: ");
		int number5 = input.nextInt();
		
		
		int negativeNum = 0;
		int positiveNum = 0;
		int equalNum = 0;
		
//		negative
	
		if(number1 < 0)
			negativeNum = negativeNum + 1;
		if(number2 < 0)
			negativeNum = negativeNum + 1;
		if(number3 < 0)
			negativeNum = negativeNum + 1;
		if(number4 < 0)
			negativeNum = negativeNum + 1;
		if(number5 < 0)
			negativeNum = negativeNum + 1;
		
		// positive
		
		if(number1 < 0)
			positiveNum = positiveNum + 1;
		if(number2 < 0)
			positiveNum = positiveNum + 1;
		if(number3 < 0)
			positiveNum = positiveNum + 1;
		if(number4 < 0)
			positiveNum = positiveNum + 1;
		if(number5 < 0)
			positiveNum = positiveNum + 1;
		
		// equal to
		if(number1 == 0)
			equalNum = equalNum+ 1;
		if(number2 == 0)
			equalNum = equalNum+ 1;
		if(number3 == 0)
			equalNum = equalNum+ 1;
		if(number4 == 0)
			equalNum = equalNum+ 1;
		if(number5 == 0)
			equalNum = equalNum+ 1;
			
		System.out.printf("%d%n%d%n%d%n", negativeNum, positiveNum, equalNum);
			

	}

}
