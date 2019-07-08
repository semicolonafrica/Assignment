package chapter6.classwork68;

/* Author: ADEBAYO Johnson
Date: 19/06/2019 
Location of exercise:  Classwork, pg 218 (262)
Purpose: Dice Game
*/
import java.security.SecureRandom;
public class DiceGame2 {
	static int x;
	static int y;
	static int p;
	static int q;
	static int sum =0;
	static int sum2=0;
	static int sum3 = 0;
	
	public static void throwDice() {
		
		SecureRandom random =new SecureRandom();
		x = 1 + random.nextInt(6);
		y = 1 + random.nextInt(6);
	}
	public static void compareDice() {
		sum = x + y;
		System.out.println("Player rolled " + x + " + " + y + " = " + sum );

		if ((sum == 7)|| (sum == 11)) {
           System.out.println("Player wins");
		}
		if ((sum == 2)|| (sum == 3)||(sum == 12)) {
			System.out.println("Player loses");
		}
		if ((sum == 4)|| (sum == 5)||(sum == 6)||(sum == 8)|| (sum == 9)||(sum == 10)) {
			System.out.println("Try again" + "\n");
			sum2 = sum;
           
			for (int i =1; i<=10; i++){
				SecureRandom randomNumber =new SecureRandom();
				p= 1 + randomNumber.nextInt(6);
				q= 1 + randomNumber.nextInt(6);
				sum3 = p+q;
				System.out.println("Player rolled " + p + " + " + q + " = " + sum3);
               
				if (sum3 == 7){
					System.out.println("Player loses");
                   break;
               }
               else if (sum3 == sum2){
                   System.out.println("Player wins");
                   break;
               }
               else{
                   System.out.println("Try more times" + "\n");
                   continue;
               }
           }
       }	
	}
	public static void main(String[] args) {
		throwDice();
		compareDice();
		

	}

}
