package greatestCommonDivisor;
import java.util.Scanner;

public class Gcd {
	
	public static int  gcd(int a, int b) {
		while(b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
//	function gcd(a, b)
//    while b ≠ 0
//       t := b; 
//       b := a mod b; 
//       a := t; 
//    return a;
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int a = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b = input.nextInt();
		
		System.out.printf("the greatest common divisor of %d and %d is %d", a, b ,Gcd.gcd(a, b));
		
		
	}

}
