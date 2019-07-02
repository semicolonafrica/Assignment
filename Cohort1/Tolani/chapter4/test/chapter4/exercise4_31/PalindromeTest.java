package chapter4.exercise4_31;
import java.util.Scanner;

/**
 * @author USER
 *
 */
public class PalindromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Palindrome num1 = new Palindrome();
		
		System.out.print("Enter your number");
		int number = input.nextInt();
		
		if(number >10000 && number <100000) {
			num1.setNumber(number);
		}
		else {
			System.out.print("Number entered is wrong but ");
		}
		palindrome(num1);

	}
	public static void palindrome(Palindrome object)
	{
		System.out.println(object.checkPalindrome() ? "is Palindrome " : "is not Palindrome");
	}

}
