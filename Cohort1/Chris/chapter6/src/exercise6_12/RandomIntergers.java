package exercise6_12;
/*statements that assign random integers to the 
 * variable n in the following ranges
 */
import java.security.SecureRandom;
public class RandomIntergers {

	public static void main(String[] args) {
		SecureRandom generate = new SecureRandom();
		
		int game =  1 + generate.nextInt(2);
		
		System.out.println("the selected number is: " +game);
		
		int dice = 1 + generate.nextInt(100);
		System.out.printf("%nthe selected number is: %d%n",dice);
		
		int random = generate.nextInt(10);
		System.out.printf("%nthe selectd number is: %d%n", random);
		
		int gamble = 1000 + generate.nextInt(112);
		System.out.printf("%nthe selectd number is: %d%n", gamble);
		
		int random1 = -1 +generate.nextInt(1);
		System.out.printf("%nthe selectd number is: %d%n", random1);
		
		int random2 = -3 +generate.nextInt(11);
		System.out.printf("%nthe selectd number is: %d", random2);
		
		

	}

}
