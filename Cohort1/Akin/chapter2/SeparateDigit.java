/**
 * SeparateDigit
 */
import java.util.Scanner;
public class SeparateDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 42339;

        int value1 = (num % 10);
        int num1 = num / 10;
        int value2 = (num1 % 10);
        int num2 = num1 / 10;
        int value3 = (num2 % 10);
        int num3 = num2 / 10;
        int value4 = (num3 % 10);
        int num4 = num3 / 10;
        int value5 = (num4 % 10);

        System.out.print("The Separated Integer: " + value5 + " " + value4 + " " + value3 + " " + value2 + " " + value1);
    input.close();
    }
}