package chapter6.exercises;
import java.util.Scanner;
public class SeperatingDigit {
	public static String getDigit(int number) {
		String store =" ";
		//int number=1;
		if(number>=1&&number<100000) {
			
		
		while(number!=0) {
			int result=number%10;
			store = result +"  " +store;
			
			number /= 10;
		}
		
	
		}
		else{
			System.out.println("invalid value enter the correct value");
		}
		return store;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input number");
		int value=input.nextInt();
		System.out.println(getDigit(value));
	}

}
