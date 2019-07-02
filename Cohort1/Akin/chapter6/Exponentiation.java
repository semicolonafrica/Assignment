import java.util.Scanner;

/**
 * Exponentiation
 */
public class Exponentiation {

    public static int integerPower(int base, int exponent) {
        int store = 1;
        for(int i = 1; i <= exponent; i++) {
            store *= base;
        }
        return store;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("input the base: ");
        int numberBase = input.nextInt();

        System.out.print("input the exponent: ");
        int numberExponent = input.nextInt();

        int result = integerPower(numberBase, numberExponent);

        System.out.printf("The result of %d raise to power %d is %d%n%n", numberBase,numberExponent,result);
        input.close();
    }
}