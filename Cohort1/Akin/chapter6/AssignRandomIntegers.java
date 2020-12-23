import java.security.SecureRandom;

public class AssignRandomIntegers {
	
	public static int getRandomOneToTwo() {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		
			int face1 = 1 + randomNumbers.nextInt(2);
			System.out.printf("The face: " + face1 + "\n");
		
		return face1;
	}
	public static int getRandomNumberOneToHundred() {
		SecureRandom randomNumbers = new SecureRandom();
		
			int face2 = 1+ randomNumbers.nextInt(100);
			System.out.printf("%d %n",face2);

		
		return face2;
	}
	
	public static int getRandomNumberZeroToNine() {
		SecureRandom randomNumbers = new SecureRandom();
		int face3 = 1;
		
			face3 = randomNumbers.nextInt(10);
			System.out.printf("%d %n",face3);
		
		return face3;
	}

	public static int getRandomNumberOneThousandAnd1112() {
		SecureRandom randomNumbers = new SecureRandom();
	
			int face4 = 1000 + randomNumbers.nextInt(113);
			System.out.printf("%d %n",face4);
			

		
		return face4;
	}
	
	public static int getRandomNumberMinus1And1() {
		SecureRandom randomNumbers = new SecureRandom();
		
			int face5 = -1 + randomNumbers.nextInt(2);
			System.out.printf("%d %n",face5);
		
		return face5;
	}
	
	public static int getRandomNumberMinus3To11() {
		SecureRandom randomNumbers = new SecureRandom();
			int face6 = -3 + randomNumbers.nextInt(15);
			System.out.printf("%d %n",face6);
			return face6;
	}
	public static void main(String[] args) {
		
		
		int roll1 = getRandomOneToTwo();
		int roll2 = getRandomNumberOneToHundred();
		int roll3 = getRandomNumberZeroToNine();
		int roll4 = getRandomNumberOneThousandAnd1112();
		int roll5 = getRandomNumberMinus1And1();
		int roll6 = getRandomNumberMinus3To11();
		
		System.out.println(roll1);
		System.out.println(roll2);
		System.out.println(roll3);
		System.out.println(roll4);
		System.out.println(roll5);
		System.out.println(roll6);

		
		
	}
	
}
