package exercise6_23;

import java.util.Scanner;

public class FindingMinimum3 {
	
	public static float minimum(int num2, int num1, int num){
		
		Scanner in = new Scanner(System.in);
		
				System.out.print("Enter num:");
				num = in.nextInt();
				
				System.out.print("Enter num1:");
				num1 = in.nextInt();
				
				System.out.print("Enter num2:");
				num2 = in.nextInt();
		
		float number = Math.min(num,Math.min(num1,num2));
				System.out.println(number);
		return number;
		}
	
	public static void main(String[] args) {
		
		int num = 0;	int num1 = 0;	int num2 = 0;
		
		minimum(num, num1, num2);
		}
}
