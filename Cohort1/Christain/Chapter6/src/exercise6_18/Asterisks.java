package exercise6_18;
import java.util.Scanner;
public class Asterisks {
	 public void squareOfAsterisks(){
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter Number: ");
	        int side = input.nextInt();
	    
	        for(int counter = 1; counter <= side; counter++){
	            for(int counter1 = 1; counter1<= side; counter1++)
	            System.out.print("*");
	            System.out.println();
	    }
	}
}
