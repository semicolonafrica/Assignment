package chapter6.exercise616;

import java.util.Scanner;

public class Multiples {
	
	public static boolean isMultiple(int x, int y){
	    boolean status;
	    
	    if(x % y==0)
	    	status= true;
	    else
	    	status = false;
		 
		 
		return status;
		
	}

	public static void main(String[] args) {
		Scanner multi = new Scanner(System.in);
		System.out.println("Key in the numbers ");
		int x = multi.nextInt();
		int y = multi.nextInt();
		
		System.out.println(isMultiple(x,y));
		
		int counter = 0;
		
		while(counter <= 30) {
			x = multi.nextInt();
			y = multi.nextInt();
			
		System.out.println(isMultiple(x,y));
		
			counter ++;
		}

		multi.close();
	}

}
