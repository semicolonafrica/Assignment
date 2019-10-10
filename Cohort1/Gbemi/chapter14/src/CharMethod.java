import java.util.Scanner;
public class CharMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a character");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		Character newWord = word.charAt(0);
		System.out.println(Character.isDefined(newWord));
		System.out.println(Character.getType(newWord));
		System.out.println(Character.digit(newWord, 2));
		System.out.println(newWord.charValue());
		
	}

}
