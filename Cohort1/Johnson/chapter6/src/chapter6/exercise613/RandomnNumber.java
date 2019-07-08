package chapter6.exercise613;

import java.security.SecureRandom;

public class RandomnNumber {
	static SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		displayEven();
	    displayOdd();
	    displayRandom();
	    displayRandom2();
	}
	public static void displayEven(){
	       //SecureRandom randomNumber = new SecureRandom();
	       //2, 4, 6, 8, 10.
	       int u = 2 + random.nextInt(8);
	       if (u % 2 == 0){
	           System.out.println("\nRandom even:" + u);   
	       }
	       else{
	           int v = 1 + u;
	           System.out.println("\nRandom even: " + v);
	       }  
	   } 
	   public static void displayOdd(){
	       //SecureRandom random = new SecureRandom();
	       //3, 5, 7, 9, 11.
	       int u = 2 + random.nextInt(10);
	       if (u % 2 == 1){
	           System.out.println("\nRandom odd:" + u);   
	       }
	       else{
	           int v = 1 + u;
	           System.out.println("\nRandom odd: " + v);
	       }  
	   }
	   public static void displayRandom(){
	       //6, 10, 14, 18, 22.
	       for (int i = 1; i<=100; i++){
	           //SecureRandom random = new SecureRandom();
	           int a = 6 + random.nextInt(17);
	           if ((a==6)||(a==10)||(a==14)||(a==18)||(a==22)){
	               System.out.println("\nRandom number: " + a);
	               break;
	           }
	           else{
	               continue;
	           }   
	       }
	   } 
	   public static void displayRandom2() { //this performs the same function as displayRandom
		int n =  6 + random.nextInt(17);
		if (n%4==2) {
			System.out.println(n);
		}
		else if(n%4==3) {
			n = n-1;
			System.out.println(n);
		}
		else if(n%4==0) {
			n=n+2;
			System.out.println(n);
		}
		else {
			n=n+1;
			System.out.println(n);
		}
		
	   }
	   
}
