import java.util.Scanner;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        
        String store = "";

        Scanner input = new Scanner(System.in);
        int digit = 0;
        int number = input.nextInt();

        while(number != 0){

            
            digit = number % 10;

            store = digit + "  " + store;

            
            number /= 10;

        }
        System.out.print(store + " ");

    }
}