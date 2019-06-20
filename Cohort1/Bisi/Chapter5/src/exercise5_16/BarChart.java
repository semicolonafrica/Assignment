package exercise5_16;
import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			
	System.out.print("Enter number btw 1 and 30: ");
	int number1 = input.nextInt();
	
	System.out.print("Enter number btw 1 and 30: ");
	int number2 = input.nextInt();
	
	System.out.print("Enter number btw 1 and 30: ");
	int number3 = input.nextInt();
	
	System.out.print("Enter number btw 1 and 30: ");
	int number4 = input.nextInt();
	
	System.out.print("Enter number btw 1 and 30: ");
	int number5 = input.nextInt();
	
	int counter = 1;
	int tempV = 0;
	
	while(counter <= 5) {
		if(counter == 1) {
			tempV = number1;
		}
		else if(counter == 2) {
			tempV = number2;
		}
		else if(counter == 3) {
			tempV = number3;
		}
		else if(counter == 4) {
			tempV = number4;
		}
		else if(counter ==5) {
			tempV = 5;
		}
		for(int k = tempV; k > 0; k--){
			System.out.print("*");
		}
		System.out.println();
		
		counter+=1;
		
	}
	
		
	}
	
		
		
		}	
	
