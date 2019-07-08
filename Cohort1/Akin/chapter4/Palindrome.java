
import java.util.Scanner;

/**
 * ReverseANumber
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to Reverse: ");
        int num = input.nextInt();
    int num1 = num;
        int reversed = 0;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            
        }
        System.out.print("Reversed Number:" + reversed + "\n");

    System.out.print((num1 == reversed) ? "is Palindrome" : "is NOT Palindrome");
    System.out.println();
        input.close();
    }
}