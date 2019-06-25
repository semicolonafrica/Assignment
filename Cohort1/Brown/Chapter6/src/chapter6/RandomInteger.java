package Chapter6.exercise6_29;

import java.security.SecureRandom;
import java.util.Random;
public class RandomInteger {
	
	//public static void main(String[] args) {
		int max;
		int min;
		double maximum;
		double minimum;
		int number ;
		SecureRandom randomNumber = new SecureRandom();
		
		public RandomInteger(int max,int min) {
			
			
			this.max = max;
			this.min = min;
		}
		public RandomInteger(double maximum, double minimum) {
			
			this.maximum = maximum;
			this.minimum = minimum;
			
		}
		
		public void generateRandomNumberInt() {
			
			 number = randomNumber.nextInt();
			 
		}
		
		public static int generateRandomNumberInt(int max,int min) {
			int number ;
			max = (max - min) + min;
			SecureRandom randomNumber = new SecureRandom();
			return number = randomNumber.nextInt(max) + min ;
			
		}
		
		public static double generateRandomNumberdouble(double max,double min) {
			double number ;
			double lowerNumber = (max - min) + 1;
			//max = (10 -5);
			//SecureRandom randomNumber = new SecureRandom();
			Random randomNumber = new Random();
			return number = (randomNumber.nextDouble() % lowerNumber) + min ;
			
		}
		
		public static void main(String[] args) {
			
			System.out.println(RandomInteger.generateRandomNumberInt(50,7));
		}
			
		//int n1 =  1 + randomNumbers.nextInt(2);
		//System.out.println("Random numbers of n for 1 ≤ n ≤ 2 = " + n1);
		
		//int n2 = 1 + randomNumbers.nextInt(100);
		//System.out.println("Random numbers of n for 1 ≤ n ≤ 100 = " + n2);
		
		//int n3 = 0 + randomNumbers.nextInt(9);
		//System.out.println("Random numbers of n for 0 ≤ n ≤ 9 = " + n3);
		
		//int n4 = 1000 + randomNumbers.nextInt(112);
		//System.out.println("Random numbers of n for 1000 ≤ n ≤ 1112 = " + n4);
		
		//int n5 = (-1) + randomNumbers.nextInt(3);
		//System.out.println("Random numbers of n for -1 ≤ n ≤ 1 = " + n5);
		
		//int n6 = (-3) + randomNumbers.nextInt(15);
		//System.out.println("Random numbers of n for -3 ≤ n ≤ 11 = " + n6);
		
	//}
	

}
