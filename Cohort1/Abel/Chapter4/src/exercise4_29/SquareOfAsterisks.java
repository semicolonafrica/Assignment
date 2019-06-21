package exercise4_29;
import java.util.Scanner;
public class SquareOfAsterisks {

	    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the square");
		int value =input.nextInt();
        for(int i = 0; i < value;i++)
        	System.out.println("**********");

	}

}
