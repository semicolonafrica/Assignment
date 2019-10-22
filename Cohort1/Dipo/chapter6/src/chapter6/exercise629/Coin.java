package chapter6.exercise629;
import java.util.Random;
public class Coin {
	
	public static void tossCoin() {
		
		//Random toss = new Random();
		//int roll = 0;
		int heads = 0;
		int tails = 0;
		
		for(int i = 1; i <= 20; i++){
		//roll = 1+toss.nextInt(2);
	
		
		
		
		if(flip() == true )
			heads++;
		
		else
			tails++;
		
	}
		
		System.out.println("Heads: " + heads + "  Tails: " + tails);
		
	
		
	}
	
	public static boolean flip() {
		
		if((int) (Math.random() *2) == 1)
			return true;
		
		else
			return false;
		
	}
 
}
