package chapter6.exercise621;

import java.util.Scanner;

public class SeperatingDigits {

	public static int integerPart(int num1, int num2 ){
		
		int num = num1/num2;
		
		return num;		
	}

	public static int remainderPart(int a, int b) {
		
		int c = a&b;
		
		return c;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		
		
		System.out.println("Enter first digits");
		int c = get.nextInt();
		
		System.out.println("Enter second digit");
		int d = get.nextInt();
		
		System.out.println(integerPart(c, d));

	}
	
	public static int displayDigits(int numb1){
		
	int val1 = 0;
	int val2 = 0;
	int val3 = 0;
	int val4 = 0;
	int remainder;
	
	if(numb1 < 10) {
		remainder = numb1;
	}
	if(numb1>9 && numb1 <100) {
		val1 = numb1/10;
		val2 = numb1 % 10;
		System.out.printf("%d%d",val1, val2);
	}
	if(numb1 > 99 && numb1 < 1000){
		val1= numb1/100;
				remainder= numb1 % 100;
		val2= remainder/10;
		val3= remainder%10;
		System.out.printf("%d%d%d",val1, val2, val3);
		
	}
	if(numb1 > 999 && numb1 < 10000){
		val1 = numb1/1000;
		remainder = numb1 % 1000;
		val2 = remainder/100;
		remainder= numb1 % 100;
		val3 = remainder/10;
		val4 = remainder % 10;
		System.out.printf("%d%d%d%d",val1, val2, val3, val4);
		
	  }
		
	return numb1;

	 }
   }

 
