import java.util.Scanner;

/**
 * LargerInteger
 */
public class LargerInteger {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the value of m:");
        int valueofM = value.nextInt();
        
        if(valueofM < 0) {
            System.out.print("The value of m = " + valueofM + ".0\n" + "The value of n = -1");
        } else if(valueofM == 0) {
            System.out.print("The value of m = " + valueofM + ".0\n" + "The value of n = 0");
        } else {
            System.out.print("The value of m = " + valueofM + ".0\n" + "The value of n = 1");
        }
    }
}