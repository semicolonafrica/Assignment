package exercise4_32;


import java.util.Scanner;
public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = 1;
		int y= 2;
		int z = 3;

		int counter = 0;
		

		while(counter <= 5) {
			System.out.printf("%d %d %d %d %d",(counter + x),(counter + x),(counter + z),(counter +  y ) ,(counter + x ));
			
			counter++; break;
		}
			if(counter > 5) {
				
				System.out.println();
			  	
				System.out.printf("an error message");
			
			}
			else 
				System.out.println();
			    System.out.println();
			
			    	
			System.out.println("enter new value");
				String value = input.nextLine();
			    
				
	}

}