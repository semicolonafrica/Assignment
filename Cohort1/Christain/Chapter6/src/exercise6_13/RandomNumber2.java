package exercise6_13;

	import java.security.SecureRandom;
	
public class RandomNumber2 {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		   
		int num1 = 2 + 2 * randomNumbers.nextInt(5) ;
		System.out.println("Random numbers of numbers in the range of 2,4,6,8,10= " + num1);
		
		int num2 = 3 + 2 * randomNumbers.nextInt(5);
		System.out.println("Random numbers of numbers in the range of 3,5,7,9,11= " + num2);
		
		int num3 = 6 + 4 * randomNumbers.nextInt(5);
		System.out.println("Random numbers of numbers in the range of 6,10,14,18,22= " + num3);
		
	}
	
}
