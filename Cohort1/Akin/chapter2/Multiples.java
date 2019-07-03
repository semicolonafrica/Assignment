/**
 * Multiples
 */
import java.util.Scanner;
public class Multiples {
        public static int num1, num2;
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = collect.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = collect.nextInt();

        if( num1 % num2 == 0) {
            System.out.printf("%d is a multiple of %d",num1, num2);
        } else {
            System.out.printf("%d is not a multiple of %d",num1, num2);

        }
        collect.close();
    }
}