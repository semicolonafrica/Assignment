package exercise5_16;


import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = insert.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = insert.nextInt();
		
		System.out.print("Enter third number: ");
		int num3 = insert.nextInt();
		
		System.out.print("Enter fourth number: ");
		int num4 = insert.nextInt();
		
		System.out.print("Enter fifth number: ");
		int num5 = insert.nextInt();
		
		
		int j = 0;
		
		for(int counter = 1; counter <= 5; counter++) {

			if(counter == 1) {
				j = num1;
			}
			if(counter == 2) {
				j = num2;
			}
			if(counter == 3) {
				j = num3;
			}
			if(counter == 4) {
				j = num4;
			}
			if(counter == 5) {
				j = num5;
			}
			System.out.println();
			
			for(int i = j; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		insert.close();
	}

}
