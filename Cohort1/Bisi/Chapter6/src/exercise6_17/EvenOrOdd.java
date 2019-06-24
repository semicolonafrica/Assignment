package exercise6_17;
import java.util.Scanner;
public class EvenOrOdd {
	
	public static boolean IsEvenOrOdd(int digit){
		
		if(digit % 2 == 0) {
			System.out.println("This is an Even number");
			return true;
		}
			else {	
				System.out.println("This is an Odd number");
				return false;	
			}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number;
				System.out.print("Enter numbers:");
				while(input.hasNext()) {
				number = input.nextInt();				
		   
		   System.out.println(EvenOrOdd.IsEvenOrOdd(number));
				}
		}
		
	}

