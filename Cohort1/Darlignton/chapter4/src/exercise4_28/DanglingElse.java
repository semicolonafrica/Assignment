package exercise4_28;



import java.util.Scanner;

public class DanglingElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// applying indentation to solve the dangling else problem
		Scanner input = new Scanner(System.in);
		
		int y;
		int x;
		
		System.out.print("enter x");
		x = input.nextInt();
		System.out.print("enter y");
		y = input.nextInt();
		
		if(x < 10) {
			if(y > 10 )
		System.out.println("*****");
	}

		else {
			System.out.println("####");
			System.out.println("$$$$$");
	
	}
		input.close();
	}

}