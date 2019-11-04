package exercise6_12;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumbers = new Random();
		
		System.out.println("Random numbers between 1 and 2: "+ randomNumbers.randomNumbersBetweenOneAndTwo());
		System.out.println("Random numbers between 1 and 100: "+ randomNumbers.randomNumbersBetweenOneAnd100());
		System.out.println("Random numbers between 0 and 9: "+ randomNumbers.randomNumbersBetween0And9());
		System.out.println("Random numbers between 1000 and 1112: "+ randomNumbers.randomNumbersBetween1000And1112());
		System.out.println("Random numbers between -1 and 1: "+ randomNumbers.randomNumbersBetweenMinus1And1());
		System.out.println("Random numbers between -3 and 11: "+ randomNumbers.randomNumbersBetweenMinus3And11());
		
	}   

}
