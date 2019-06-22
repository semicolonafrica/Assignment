package exercise6_29;
import java.util.Scanner;
public class CoinTossingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("1- Toss Coin");
		int select = input.nextInt();
		
		if(select == 1)
			CoinTossing.tossCoin();
		
		
	}

}
