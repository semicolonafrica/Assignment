package exercise6_17;
// @author CHIMA CHUKWUEBUKA
 import java.util.Scanner;
public class EvenOrOdd {
     // @param args
	public static boolean IsEvenOrOdd(int x ){
		
		if(x % 2 == 0) {
			System.out.println("This Is An Even Number");
			return true;
		}
		else {
			System.out.println("This Is An Odd Number");
			return false;
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner evenOdd = new Scanner(System.in);
        int number;
        
        System.out.println("Enter Number:");
        while(evenOdd.hasNext()) {
        number = evenOdd.nextInt();
        
        System.out.println(EvenOrOdd.IsEvenOrOdd(number));
	}
}
}