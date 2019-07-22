package exercise4_30;
import java.util.Scanner;

public class SquareOfAsterisks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int side = 1;
		int down = 1;
		int count =1;
	System.out.print("Enter number of side: ");	
	int number = in.nextInt();

		while(count <= number) {
			System.out.print("*");
			if(count == number) {
				System.out.println();
				
		while(side <= number) {
			System.out.println("*   *");
				side++;
				}
			}
			count++;
		}
		while(down <= number) {
			System.out.print("*");
			down++;
		}
	}
}
				

		
			 
			
		
		


