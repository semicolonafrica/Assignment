package exercise6_18;
import java.util.Scanner;
public class SquareOfAsterisks {
	
	public static void squareOfAsterisks(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number for side: ");
			int side  = input.nextInt();
			
				for(int i = 0; i < side; i++) {
				
					for(int j = 0; j < side; j++) {
					
					System.out.print("*");
			
		}
					System.out.println("");
				
 }
}
	
	public static void main(String[] args) {
		
		SquareOfAsterisks.squareOfAsterisks();
}
	
}