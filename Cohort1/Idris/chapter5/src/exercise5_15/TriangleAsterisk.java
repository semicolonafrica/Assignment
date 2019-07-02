package exercise5_15;

import java.util.Scanner;
public class TriangleAsterisk {
		
	public void formTriangle() {
	
		Scanner accept = new Scanner(System.in);

		
		System.out.println();
		String space = " ";
		System.out.println("Enter number of asteriks: ");
		int asterisk = accept.nextInt();
		int r  = asterisk - 1;
		int j;int i;

		System.out.print("A");
		for( i = 0; i < asterisk; i++) {
			for( j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("B");
		for( i = asterisk; i > 0; i--) {
			for( j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Enter number of asteriks: ");
		asterisk = accept.nextInt();
		
		System.out.println("\n");
		System.out.println("C");
		for ( i = asterisk; i>=1; i--) {
		for(j =1; j<=i; j++) {
			System.out.print("*");   
			if(j == i) {
				System.out.println();
				for(int x = j-r; x <= 1; x++) {
					System.out.print(space);
				}
			}
		}
	}
		System.out.println("\n");
		System.out.println("D");
		for ( i = asterisk; i >= 1; i--) {
			for(j = 1; j<=i; j++) {
				System.out.print(" ");
				if(j==i) {
					
					for(int x = j-r; x <= 1; x++) {
						System.out.print("*");
				}
					System.out.println();
			}
		}
	}
		accept.close();
		
	}

}
