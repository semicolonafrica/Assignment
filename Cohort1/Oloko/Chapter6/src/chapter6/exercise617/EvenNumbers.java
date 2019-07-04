package chapter6.exercise617;

import java.util.Scanner;

public class EvenNumbers {
	
	public static boolean isEven(int x){
	    boolean status;
	    
	    if(x % 2 ==0) {
	    	status= true;
	    }
	    else {
	    	status = false;
	    }	 
		return status;
		
	
		
	}

	public static void main(String[] args) {
		Scanner Even = new Scanner(System.in);
		System.out.println("Enter Number");
		int x = Even.nextInt();
		
		
		System.out.println(isEven(x));
		
		int counter = 0;
		
		while(counter <= 30) {
			x = Even.nextInt();
			
			
		System.out.println(isEven(x));
		
			counter ++;
		}

		Even.close();
	}

}
