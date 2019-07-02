package exercise422;
import java.util.Scanner;

public class TabularOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows you desire : ");
		int number = input.nextInt();
		
		System.out.print("N	10*N	100*N	1000*N \n");
		
		int counter =1;
		
		while(counter <= number) {
			System.out.printf("%d\t%d\t%d\t%d\n", counter, counter*10, counter*100, counter*1000);
			counter++;
		}
		
	}

}
