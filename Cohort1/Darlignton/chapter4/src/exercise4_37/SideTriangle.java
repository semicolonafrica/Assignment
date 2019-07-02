package exercise4_37;


import java.util.Scanner;

public class SideTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
		int a =0;
		int b = 0;
		int c =0;
		int total = 0;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		
		while(total == 0) {
		System.out.print("enter a");
		a = input.nextInt();
		
		
		System.out.print("enter b");
		b = input.nextInt();
	
		System.out.print("enter c");
		c = input.nextInt();
		
		
		total1 = a + b;
		System.out.printf("sum is a+b: %d%n ",total1);
		total2 = a + c;
		System.out.printf("sum is a+c: %d%n",total2);
		total3 = b + c;
		System.out.printf("sum is b+c: %d%n",total3);
		   total++;
		   
		}
		
		
		
		if(total1 > c || total2 > b || total3 > a ) {
			
			System.out.println("represent side of a triangle");
			
		}
		
		else {
			System.out.println("not represent side of triangle");
		}
	}

}

