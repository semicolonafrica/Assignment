/**
 * SeparateDigit1Test
 */
import java.util.Scanner;
public class SeparateDigit1Test {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    System.out.print("Enter the number to separate with spaces: ");
    int number1 = input.nextInt();

    // System.out.print("Enter the number to separate with spaces: ");
    // int number2 = input.nextInt();

    // System.out.print(SeparateDigit1.getinteger(number1,number2));
    // System.out.println();

    System.out.print(SeparateDigit1.displayDigits(number1));
    System.out.println();



    input.close();
    }

}